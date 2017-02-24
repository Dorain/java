public class Solution {
    public int arrangeCoins(int n) {
        int k = (int)Math.sqrt((double)n*2) - 1;
        while(k*(k+1)<=2*n){
            k++;
        }
        return k-1;
    }
}