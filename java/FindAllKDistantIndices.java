import java.util.*;

public class FindAllKDistantIndices {
//2200. Find All K-Distant Indices in an Array

    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res = new ArrayList<>();
        List<Integer> keyIndices = new ArrayList<>();
        int n = nums.length;

        // Step 1: Find all indices where nums[i] == key
        for (int i = 0; i < n; i++) {
            if (nums[i] == key) {
                keyIndices.add(i);
            }
        }

        // Step 2: Mark indices within k distance of any key index
        boolean[] seen = new boolean[n];
        for (int index : keyIndices) {
            int start = Math.max(0, index - k);
            int end = Math.min(n - 1, index + k);
            for (int i = start; i <= end; i++) {
                seen[i] = true;
            }
        }

        // Step 3: Collect all marked indices
        for (int i = 0; i < n; i++) {
            if (seen[i]) {
                res.add(i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        FindAllKDistantIndices sol = new FindAllKDistantIndices();

        int[] nums = {1, 2, 3, 4, 2};
        int key = 2;
        int k = 1;

        List<Integer> result = sol.findKDistantIndices(nums, key, k);
        System.out.println("K-Distant Indices: " + result);
    }
}
