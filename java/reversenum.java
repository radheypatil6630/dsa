public class reversenum {
    public static void main(String[] args) {
        int a=1422, reverse=0;
        while (a>0) {
            int r=a%10;
            reverse=(reverse*10)+r;
            a=a/10;
            //2  20+2   220+4   2240+1
        }
        System.out.println("reverse number is : "+reverse);
    }
    
}
