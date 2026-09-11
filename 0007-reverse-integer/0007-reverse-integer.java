class Solution {
    public int reverse(int x) {
       int n=0;
       int r=0;
       
        while(x!=0){
            n = x%10;
           if (r > Integer.MAX_VALUE / 10 || 
               (r == Integer.MAX_VALUE / 10 && n > 7)) {
                return 0;
            }

            if (r < Integer.MIN_VALUE / 10 || 
               (r == Integer.MIN_VALUE / 10 && n < -8)) {
                return 0;
            }
            r = r*10+n;
            x = x/10;
        }

        return r;
        
    }
}