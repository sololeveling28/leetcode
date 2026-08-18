class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {

        int l =1;
        int r = 10000000;
        int ans = -1;

        while(l<=r){
            int mid = l+(r-l)/2;

   double total = totals(dist ,mid);
   if(total <=hour){
    ans = mid;
    r = mid -1;

   }else{
    l = mid+1;
   }
        }

        return ans;
    }
    double totals(int[] dist,int mid){
        int n = dist.length;
      double total =0;
        for(int i =0;i<n;i++){
            if(i == n -1){
                total += (double) dist[i]/mid;
            }else{
                total += Math.ceil((double)dist[i]/mid);
            }
        }
        return total;
    }
}