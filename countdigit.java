import java.util.*;

class countdigit {
    public static void main(String[] args) {
        int a=132;
        int count =0;
        while(a>0){
            int r=a%10;
            count++;
            a=a/10;
        }
        System.err.println("total no of digit"+count);
    }
}