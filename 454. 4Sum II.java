public class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        // change to two list question based on the gurantee N<= 500
        // O(n2)
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<A.length; i++){
            for(int j = 0; j<B.length; j++){
                int tmp = -(A[i]+B[j]);
                map.put(tmp, map.getOrDefault(tmp,0)+1);
            }
        }
        int count = 0;
        for(int i = 0; i<C.length; i++){
            for(int j = 0; j<D.length;j++){
                count += map.getOrDefault((C[i]+D[j]),0);
            }
        }
        return count;
    }
}