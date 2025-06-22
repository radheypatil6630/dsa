public class finalKeyword_example {
    public static void main(String[] args) {
        // final keyword in variables
        final int side=5;
        int length=10,breadth=4;
        Circle object=new Circle();
       System.out.println("Area of squre :- "+ object.area(side));
        System.out.println("Area of rectangle :- "+object.area(length, breadth));

        Student objStudent=new Student("Ram",1);
      
        objStudent.display();

        // objStudent.name="hari";
        // objStudent.rollNo=2;
        // objStudent.display();
    }
    
}


class  Shape{
   
   int area(int side){
    System.out.println("Method called of Shape() class");
        return  side*side;
    }
}

class Circle extends Shape{
    
    int area(int length,int breadth){
        System.out.println("Method called of circle() class ");
        return  length*breadth;
    }

}


//2nd example

final class  Student{
  final  String name;
   final int rollNo;

    public Student(String name,int rollNo){
    this.name=name;
    this.rollNo=rollNo;
    }

    public void display(){
        System.out.println("Name :- "+name+" Roll No :- "+rollNo);
    }
}