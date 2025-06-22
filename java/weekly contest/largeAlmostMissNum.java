import java.util.*;

class largeAlmostMissNum {
    public int largestInteger(int[] nums, int k) {
       int res = -1;
        Map<Integer, Integer> mp = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int left = i;
            int right = left + k -1;
            while (left <= right && right < nums.length) {
//                System.out.println(left +"  "+right);
                if (mp.containsKey(nums[left])) {
                    mp.put(nums[left], mp.getOrDefault(nums[left], 0) + 1);
//                    System.out.println(nums[left] + "   "+ mp.get(nums[left]));
                }else{
                    mp.put(nums[left], 1);
//                    System.out.println(nums[left] + "   "+ mp.get(nums[left]));
                }
                left++;
            }
        }
             int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> traverse : mp.entrySet()) {
//            System.out.println(traverse.getKey() + "   " + traverse.getValue());

            if (traverse.getValue() == 1) {
                max = Math.max(max, traverse.getKey());
//                System.out.print(max + "   ");
                res = max;
            }
        }
        if(k == nums.length)  {
            // int max2 = 0;
            Arrays.sort(nums);
            
            return nums[nums.length-1];


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
