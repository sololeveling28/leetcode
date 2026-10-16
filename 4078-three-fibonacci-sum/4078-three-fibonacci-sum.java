class Solution {
    public boolean threeFibonacciSum(int n) {
      ArrayList<Integer> ne=new ArrayList<>();
      int i =0;
      int j=1;
      ne.add(0);
      ne.add(1);
      while(j<n){
           int temp =j;
        j = i+j;
        i = temp;
        ne.add(j);
     
      }  
       for(int x =0;x<ne.size()-2;x++){
    if(ne.get(x)+ne.get(x+1)+ne.get(x+2) == n) return true;
      }
      return false;
    }
}