public class Divide_string {
//2138 problem number
//https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int mod = n % k;
        int size = (mod == 0) ? n / k : (n / k) + 1;
        String[] res = new String[size];
        int index = 0;
        String newStr = "";

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            newStr += c;
            if (newStr.length() == k) {
                res[index] = newStr;
                newStr = "";
                index++;
            }
        }

        if (mod != 0) {
            int i = 0;
            while (i < (k - mod)) {
                newStr += fill;
                i++;
            }
            res[index] = newStr;
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "abcdefghi";
        int k = 3;
        char fill = 'x';

        Divide_string obj = new Divide_string();
        String[] result = obj.divideString(s, k, fill);

        
        for (String part : result) {
            System.out.println(part);
        }
    }
}
