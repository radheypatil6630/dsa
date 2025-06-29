
public class evenOdd {
    public static void main(String[] args) {
        System.out.println(checkEven());
    }
    static  String checkEven(){
        int n = 67;
        return (n&1)== 1 ? "odd" : "even";
    }
}