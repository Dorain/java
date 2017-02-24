public class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        long lo = 0, hi = num;
        while(lo < hi){
            long mid = lo + (hi-lo)/2;
            long mid2 = mid * mid;
            if(mid2 == num){
                return true;
            }else if(mid2 < num){
                lo = mid+1;
            }else{
                hi = mid;
            }
        }
        System.out.println(lo);
        if(lo*lo == num) return true;
        else return false;
    }
}