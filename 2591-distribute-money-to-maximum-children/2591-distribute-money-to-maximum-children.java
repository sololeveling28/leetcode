class Solution {
    public int distMoney(int money, int children) {
        if(money<children)return -1;
        money-=children;
        int c=money/7;
        int r=money%7;
        if(c>=children){
            return (c==children && r==0)?children:children-1;
        }
        if(c==children-1 && r==3)return c-1;
        return c;
    }
}