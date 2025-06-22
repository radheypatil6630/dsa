import java.util.*;

class Solution {
    public int largestInteger(int[] nums, int k) {
        int res = -1;
        Map<Integer, Integer> mp = new HashMap<>();
        Set<Integer> set = new HashSet<>();
       
        for (int i = 0; i < nums.length; i++) {
            int left = i;
            int right = left + k;
            while (left < right && right < nums.length) {
                if (mp.containsKey(nums[left])) {
                    mp.put(nums[left], mp.getOrDefault(nums[left], 0) + 1);
                }
                left++;
            }
        }

        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> traverse : mp.entrySet()) {
            System.out.println(traverse.getKey() + "   " + traverse.getValue());

            if (traverse.getValue() == 1) {
                max = Math.max(max, traverse.getKey());
                System.out.print(max + "   ");
                res = max;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {4, 3, 2, 3, 4, 5, 6};
        int k = 2;
        int result = sol.largestInteger(nums, k);
        System.out.println("\nLargest Unique Integer: " + result);
    }
}
