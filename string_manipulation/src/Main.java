import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        int[] b = {1,2,3,4,5};
        String a = "ram";
        boolean ba= true;
        float aa = 1.0F;
        char abac= 's';

        System.out.println(Arrays.toString(b));
        System.out.println(b);
        for (int i = 1; i <= 5; i++) {
           System.out.println("i = " + i);
        }
    }
}