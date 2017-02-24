public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int result = 0;
        for(int h : houses){
            int idxh = Arrays.binarySearch(heaters, h);
            if(idxh<0){
               idxh = Math.max(-idxh-2, 0);
            }
            else{
                continue;
            }
            // System.out.println(idxh);
            int pre = Math.abs(heaters[idxh] - h);
            int post = Math.abs(heaters[Math.min(heaters.length-1,idxh+1)] - h);
            result = Math.max(result, Math.min(pre,post));
        }
        return result;
    }
 
}