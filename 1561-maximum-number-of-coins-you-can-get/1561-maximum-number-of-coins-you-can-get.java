class Solution {
    public int maxCoins(int[] piles) {
        int ans =0;
        Arrays.sort(piles);
        int n = piles.length/3;
        for(int i= n;i<piles.length;i+=2){
            ans +=piles[i];
        }
        return ans;
    }
}