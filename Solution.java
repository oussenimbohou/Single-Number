import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {4,1,2,1,2};
        System.out.println("Single Number: " + sol.singleNumberV1(nums));
    }
    public int singleNumber(int[] nums) {
        int count = 0;
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length ; j++) {
                if(nums[i] == nums[j]){
                   hashMap.put( nums[i], ++count);
                }
            }
            count = 0;
        }
        for (Map.Entry<Integer, Integer> elt : hashMap.entrySet()) {
            Integer key = elt.getKey();
            Integer value = elt.getValue();
            if(value == 1) return key;
        }
        return 0;
    }
    
    public int singleNumberV1(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count ^= nums[i];
        }
        return count;
    }
}
