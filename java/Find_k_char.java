public class Find_k_char {
    //3304. Find the K-th Character in String Game I

    public static void main(String[] args) {
        Find_k_char findKChar = new Find_k_char();
        int k = 5; 
        char result = findKChar.kthCharacter(k);
        System.out.println("The " + k + "th character is: " + result);
    }
    public static char kthCharacter(int k) {
        String s = "a";
        char c= operation(k,s);

        return c;
    }

    public static char operation(int k,String s){
        
        if(s.length() >= k){
            return s.charAt(k-1);
        }

        StringBuilder str = new StringBuilder(s);
        for(int i = 0 ;  i < s.length() ;i++){
            int n = s.charAt(i);
            if(s.charAt(i) == 'z') str.append('a');
            else                   str.append((char)(n+1));
        }

        return operation(k,str.toString());
    }
}
