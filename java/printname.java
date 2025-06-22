import java.util.*;

public class printname {
  static  String name;

  // code for display name using recursion 
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter range for print number :");      
int N=sc.nextInt();
System.out.println("Enter name which you want to print : ");
 name=sc.next();  

printname obPrintname=new printname();
System.out.println(" display name upto "+N);
obPrintname.printN(1,N);
obPrintname.printrev(1, N);

 }
 //print name
 public void printN(int i,int N)
 {
   
    if(i>N)
    {
        return;
    }
    System.out.println(name);
    printN(i+1, N);
}
    
// print reverse numbers 
public void printrev(int i,int N)
{
  
   if(i>N)
   {
       return;
   }
   System.out.println(N);
   printrev(i, N-1);
}
}
