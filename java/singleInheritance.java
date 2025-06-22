public class singleInheritance {
    int length=100;
    int breadth=21;
    singleInheritance(int l, int b){
        this.length=20;
        this.breadth=10;   }
    public void show(){
        System.out.println("Length is "+length+" and breadth is "+breadth);
    }   
}
class childInheritance extends singleInheritance{
    int height=10;
    childInheritance(int l, int b,int h){
        super(l,b);
    }
    // super(int l,int b);
    @Override
    public void show(){
        
        this.height=height;
        System.out.println("length is  "+length+"  breadth  "+breadth+" height  "+height);

    }
    public static void main(String[] args) {
        childInheritance obj=new childInheritance(10,20,20);
        singleInheritance obj2=new childInheritance(10, 20,20);
        obj2.show();
        // obj.show(100);
    }
}
