import java.util.*;

public class divisor {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter number :");
        int num=sc.nextInt();

        int i=1;
        
        System.out.println("divisor of "+num+" is :");
        while (i<=num) {
            if (num%i==0) {
                System.out.print(i+ "  ");
                
            }
            i++;
            
        }
        
    }
}
