class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayDeque<Integer> st = new ArrayDeque<>();
        HashMap<Integer, Integer> hmp = new HashMap<>();

        for(int i = 0; i < nums2.length; i++){
            while (!st.isEmpty() && nums2[i] > st.peek()){
                hmp.put(st.peek(), nums2[i]);
                st.pop();
            }
            st.push(nums2[i]);
        }
        for (Integer i: st) {
            hmp.put(i, -1);
    }
    int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = hmp.get(nums1[i]);  
        }
        return ans;
    }    
}    