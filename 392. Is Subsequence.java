public class Solution {
    public boolean isSubsequence(String s, String t) {
      // for plenty of s, reduce operations on t
    //   HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer>[] tlist = new ArrayList[128];
        for(int i = 0; i < t.length(); i++){
            int tdx = t.charAt(i); 
            if(tlist[tdx] == null){
                tlist[tdx] = new ArrayList<Integer>();
            }
            tlist[tdx].add(i);
            // in ascending order by nature
        }
        int pre = 0;
        for(int i = 0; i < s.length(); i++){
            int sdx = s.charAt(i);
            if(tlist[sdx] == null) return false;
            int idx = Collections.binarySearch(tlist[sdx],pre);
            if(idx < 0){
                idx = -idx - 1;
            }
            if(idx == tlist[sdx].size()) return false;
            pre = tlist[sdx].get(idx)+1;
        }
        return true;
    }
}