import  java.util.*;

public class wrapperClass_example {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Create an instance of the wrapper class
        System.out.println(".()");
        System.out.print("Enter integer number :- ");
        int i=sc.nextInt();

        System.out.print("\n Enter float number :- ");
        float j=sc.nextFloat();

        System.out.println("Enter character :- ");
        char c=sc.next().charAt(0);

        //autoboxing
        System.out.println("\n covert into wrapper class (auto boxing) ");

        Integer i_wrapper=i;
        Float f_wrapper=Float.valueOf(j);
        Character c_wrapper=Character.valueOf(c);

        System.out.print("\n Int :- "+i_wrapper+"\n float :- "+f_wrapper+"\n character :- "+c_wrapper);


        //operations 
        System.out.println("\n After performing some operations on wrapper classes :- ");

       
        System.out.println("\n Int :- "+(i_wrapper+10)+"\n float :- "+(f_wrapper+10)+"\n character :- "+(c_wrapper+'a'));

        //unboxing 

        int a=i_wrapper;
        float b=f_wrapper;
        char c1=c_wrapper;

        System.out.println("\n unboxing concept :- ");

        System.out.println("\n Int :- "+a+"\n float :- "+b+"\n character :- "+c1);
    }   
}
