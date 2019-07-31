1. Two Sum
https://leetcode.com/problems/two-sum/

class Solution{
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i ;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }
}
Runtime: 2 ms, faster than 98.83% of Java online submissions for Two Sum.
Memory Usage: 37.9 MB, less than 98.85% of Java online submissions for Two Sum.