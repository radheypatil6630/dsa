public class pow_4 {
    public static void main(String[] args){
        int n = 16;

        System.out.println(n+" is power of  4  ? = "+ isPowerOfFour(n));

    }
    static public boolean isPowerOfFour(int n) {
        int countZero = 0 ;
        String binary = Integer.toBinaryString(n);

        for(char c : binary.toCharArray()){
            if(c=='0') countZero++;
        } 

        return (((n & (n-1))== 0) && (( countZero & 1 ) == 0));
    }
    
}