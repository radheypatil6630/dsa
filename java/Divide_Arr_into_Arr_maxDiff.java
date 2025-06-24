
//2966. Divide Array Into Arrays With Max Difference

import java.util.*;

public class Divide_Arr_into_Arr_maxDiff {

    public int[][] divideArray(int[] nums, int k) {
        if (nums.length % 3 != 0) return new int[0][0];

        int n = nums.length / 3;
        int[][] res = new int[n][3];

        Arrays.sort(nums);
        int rows = 0, col = 0, count = 0;

        for (int i = 0; i < nums.length; i++) {
            res[rows][col] = nums[i];
            col++;
            count++;

            if (count == 3) {
                if (res[rows][2] - res[rows][0] > k) return new int[0][0];
                rows++;
                col = 0;
                count = 0;
            }
        }
        /*another approach 
        for(int  i = 0; i < n;i += 3)
        {
            if((nums[i + 2] - nums[i]) > k)
            {
                return new int[0][];
            }
            ans[i / 3] = new int[]{nums[i],nums[i + 1],nums[i + 2]};
        } */

        return res;
    }

    public static void main(String[] args) {
        Divide_Arr_into_Arr_maxDiff sol = new Divide_Arr_into_Arr_maxDiff();

        int[] nums = {1, 3, 4, 8, 7, 9, 3, 5, 1};
        int k = 2;

        int[][] result = sol.divideArray(nums, k);

        if (result.length == 0) {
            System.out.println("Cannot divide array into valid groups.");
        } else {
            System.out.println("Grouped result:");
            for (int[] group : result) {
                System.out.println(Arrays.toString(group));
            }
        }
    }
}
