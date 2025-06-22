public class finalize_example {
    public static void main(String[] args) {
        Person objPerson=null;

        for (int i = 0; i < 1000000000; i++) {
            objPerson=new Person();
        }
       

    }

    
}
class Person{
    String name="ram";
    int age=25;

    public Person() {
        System.out.println("Person object created");
    }
    public void finalize() {
    System.out.println("finalize() method called");
    }
}