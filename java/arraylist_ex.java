
import java.util.ArrayList;

public class arraylist_ex {
    
    public static void main(String[] args) {
    
        ArrayList<Integer> a=new ArrayList<>();
        System.out.println(" original array list :"+a);
        a.add(4);
        a.add(1,6);

        System.out.println("after addding values in array list :"+a);
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Orange");

        // Add an element to the beginning of the list
        try {
            // Add an element to the beginning of the list
            list.addFirst("Apple");

            System.out.println("ArrayList after addFirst: " + list);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }


    
    }
}
