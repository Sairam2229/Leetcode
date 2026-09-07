class Solution {

    public static boolean canEat(int[] piles, int hoursHave, int k) {
        long hoursNeeded = 0;

        for (int pile : piles) {
            hoursNeeded += (pile + k - 1) / k;
        }

        return hoursNeeded <= hoursHave;
    }

    public static int getMax(int[] piles) {
        int max = piles[0];

        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }

        return max;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = getMax(piles);

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canEat(piles, h, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}