class Solution {
    public boolean isPalindrome(int x) {
         
         int temp = x;
         int i =0;
         int rev =0;
         while(x>0){
            int r = x%10;

              rev = rev*10+r;
              
              x = x/10;
              i++;
         }
         if( rev == temp){
            return true;
         }
         return false;
    }
}