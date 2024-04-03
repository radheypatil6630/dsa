import java.util.*;

public class gcd {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers :");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int gcd=0;
            int i=1;
            int minimum;

            // taking minimum number for gcd
            if (n1>n2) {
                minimum=n2;
            }else{
                minimum=n1;
            }

          
        System.out.println("GCD of "+n1+" and "+n2+" is :");
        while (i<=minimum) {
            if (n1%i==0 && n2%i==0) {
              // it takes all divisor
                gcd=i;// at this line it overrides all divisors and left only last number that is gcd
            }
            
            i++;
        }
        System.out.println(gcd);
    }
}
