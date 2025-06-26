public class BinarySubsequence {
  
    public int longestSubsequence(String s, int k) {
        int n = s.length();
        int count = 0;
        int onesIncluded = 0;
        long value = 0;
        long pow = 1;

        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (c == '0') {
                count++;
            } else {
                if (pow <= k && value + pow <= k) {
                    value += pow;
                    count++;
                    onesIncluded++;
                }
            }

            if (pow <= k) {
                pow <<= 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        BinarySubsequence sol = new BinarySubsequence();
        String s = "1001010";
        int k = 5;
        int result = sol.longestSubsequence(s, k);
        System.out.println("Longest subsequence length: " + result);
 
    }
}
