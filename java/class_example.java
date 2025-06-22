import java.util.*;

public class class_example{

    //default access specifier
    String model="BMW";
    //public access specifier
    public int year=2000;

    //constructor
    public class_example(String model,int year) {
        this.model=model;
        this.year=year;
    }

    public class_example(){
        System.out.println("model of car is :- "+model);
        System.out.println("year  of this car is :- "+year);
    }

    public void printDetails(){
        System.out.println("\n Model: " + model);
        System.out.println("\n Year: " + year);
    }

    public static void main(String[] args) {
    
        class_example obj1=new class_example("Farari",1000);
        class_example obj2=new class_example();

        // obj1.model
        System.out.println("\n Instance variable called  by object 1");
        System.out.println(obj1.model);
        System.out.println(obj1.year);

        System.out.println("\n method called using object 1");
        obj1.printDetails();

        System.out.println("\n method called using object 2");
        obj2.printDetails();
    }
}