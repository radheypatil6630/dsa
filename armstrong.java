import java.util.*;

//armstrong num=cube of all digit is equal to original number 
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter number for checking is it armstrong number or not :");
        int num=sc.nextInt();
        
        int duplicate=num;
        int armstrong=0;
        while (duplicate>0) {
            int r=duplicate%10;
            armstrong+=(r*r*r);
            duplicate=duplicate/10;
            
        }
        if (num==armstrong) {
            System.out.println(num+" is armstrong num :\n ---- its cube addtion is :"+armstrong);
            
        } else {
            System.out.println("number is not armstrong number \n ---- its cube addtion is :"+armstrong);          
        }
    }
}
