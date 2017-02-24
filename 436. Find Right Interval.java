/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public int[] findRightInterval(Interval[] intervals) {
      HashMap<Integer, Integer> map = new HashMap<>();  
      int[] ilist = new int[intervals.length];
      for(int i = 0; i < intervals.length; i++){
          map.put(intervals[i].start, i);
          ilist[i] = intervals[i].start;
      }
      Arrays.sort(ilist);
      int[] result = new int[intervals.length];
      for(int i = 0; i < intervals.length; i++){
          int idx = bSearch(ilist, intervals[i].end);
          if(idx < intervals[i].end){
              result[i] = -1;
          }
          else{
              result[i] = map.get(idx);
          }
      }
      return result;
    }
    
    public int bSearch(int[] ilist, int target){
        int left = 0, right = ilist.length-1;
        while(left < right){
            int mid = left + (right-left)/2;
            if(ilist[mid]>=target){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return ilist[left];
    }
}