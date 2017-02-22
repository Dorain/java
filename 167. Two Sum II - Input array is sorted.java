public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < numbers.length; i++){
            if(map.get(numbers[i]) != null){
                int[] result = {map.get(numbers[i])+1, i+1};
               
                return result;
            }
            else{
                map.put(target - numbers[i], i);
            }
        }
        int[] result = {};
        return result;   
    }
}