public class Solution {
    public int search(int[] nums, int target) {
        // seperate into two situation, do binary search for each case
        if(nums == null || nums.length == 0) return -1;
        int lo = 0, hi = nums.length-1;
        if(target >= nums[0]){
            while(lo<hi){
                int mid = lo + (hi - lo)/2;
                if(nums[mid] == target) return mid;
                if(nums[mid]>=nums[lo] && target > nums[mid]){
                        lo = mid + 1;
                }
                else{
                        hi = mid;
                }
            }
        }
        else{
             while(lo<hi){
                int mid = lo + (hi - lo)/2;
                if(nums[mid] == target) return mid;
                if(nums[mid]<nums[hi] && target < nums[mid]){
                    hi = mid;
                }
                else{
                    lo = mid + 1;
                }
            }
        }
        if(nums[lo] == target ) return lo;
        return -1;
    }
}