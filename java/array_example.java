import java.util.*;

class array_example{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //take simple array
        System.out.print("enter size for array :");
        int size=sc.nextInt();


        String[] array1={"radhey","yash","amar"};
        int[] array2=new int[size];

        // System.out.println(" elements of array 1 :");
        // for(int i=0;i<array1.length;i++){
        //     System.out.println(array1[i]);
        // }

        //enter array 2
        System.out.print("Enter Array 2 elements ");
        for(int i=0;i<size;i++){
            array2[i]=sc.nextInt();
        }

        System.out.println(" Original array :");
        for(int i=0;i<array2.length;i++){
            System.out.println(array2[i]);
        }

        //swap 2 no's
        try {
            int temp;
        int position_1,position_2;

        System.out.println("enter 2 positions  less than " +array2.length);
        position_1=sc.nextInt();
        position_2=sc.nextInt();


        temp=array2[position_1];
        array2[position_1]=array2[position_2];
        array2[position_2]=temp; 

        // after swapping array 

        System.out.println("after changing the array positions :");
        for(int element:array2){
            System.out.println(element);
        }
        } catch (Exception e) {
            System.out.println("invalid input || array outoff bound ");
        }
       


        //Min Max from array2

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                
            }
        }

    }
}