public class multipleInheritance extends parent_1 {
    String name="mulitple inheritance";
    void display(){
        System.out.println("Name is "+name);
    }
    public static void main(String[] args) {
        multipleInheritance obj=new multipleInheritance();
    }
}

class parent_1 {
    String name="parent one";
    parent_1(){
        System.out.println("Name "+name);
    }

    void display(String name){
        System.out.println("Name of parent 1 is "+name);
    }
}

class parent_2 {
    
    void display(String name,int age){
        System.out.println("name of parent 2 is "+name +"& age is "+age);
    }
}
