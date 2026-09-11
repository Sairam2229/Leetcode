class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] avgs = new int[n];
        java.util.Arrays.fill(avgs, -1);
        
        if (k == 0) {
            return nums;
        }
        
        long windowSize = 2L * k + 1;
        if (windowSize > n) {
            return avgs;
        }
        
        long sum = 0;
        for (int i = 0; i < windowSize; i++) {
            sum += nums[i];
        }
        
        avgs[k] = (int) (sum / windowSize);
        
        for (int i = (int) windowSize; i < n; i++) {
            sum = sum - nums[i - (int) windowSize] + nums[i];
            avgs[i - k] = (int) (sum / windowSize);
        }
        
        return avgs;
    }
}