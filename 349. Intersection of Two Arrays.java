public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums1){
            set.add(n);
        }
        Set<Integer> intersect = new HashSet<>();
        
        for(int m : nums2){
            if(set.contains(m)){
                intersect.add(m);
            }
        }
        if(!intersect.isEmpty()){
            int[] result = new int[intersect.size()];
            int i = 0;
            for(Integer t : intersect){
                result[i++] = t;
            }
            return result;
        }
        int[] result = {};
        return result;
    }
}