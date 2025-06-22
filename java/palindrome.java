import java.util.*;

public class palindrome {
    public static void main(String args[])
    {

        // palindrome mean original num and its reverse both are same
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number :");
        int a=sc.nextInt();

        int num=a;
        int rev=0;
        while (a>0) {
            int r=a%10;
            rev=(rev*10)+r;
            a=a/10;
        }

        if (num==rev) {

            System.out.println(num+" is the palindrome number : \n "+" after reverse "+rev);
            
        }

        else{
            System.out.println(num+" is not palindrome : \n"+"after reverse"+rev);
        }
    }
    
}
