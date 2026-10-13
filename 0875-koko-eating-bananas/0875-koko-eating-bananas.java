class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int s = 1;
        int e = max(piles);
        int k = -1;
        int banana = Integer.MAX_VALUE;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int totalhrs = total(piles, mid);
            if (totalhrs <= h) {
                banana = totalhrs;
                e = mid - 1;
            } else {
                s = mid + 1;
            }

        }
        return s;
    }

    private int max(int[] piles) {
        int max = 0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        return max;
    }
    private int total(int[] piles,int n){
        int thrs = 0;
        for(int i = 0;i<piles.length;i++){
            thrs += Math.ceil((double) piles[i]/n);
        }return thrs;
    }
}