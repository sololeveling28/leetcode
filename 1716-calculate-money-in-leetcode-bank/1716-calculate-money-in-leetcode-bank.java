class Solution {
    public int totalMoney(int n) {
        int sum =0;
        for(int i=1;i<=n;i++){
           if(i%7!=0){
            sum +=(i-1)%7+(i-1)/7 +1;
           }else{
            sum +=7+(i-1)/7;
           }
        }
        return sum;
    }
}