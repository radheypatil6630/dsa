import java.util.*;
public class binary_search {
    public static void main(String[] args) {
        binary_search obj=new binary_search();

        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array :- ");
        int size=sc.nextInt();
        System.out.println("Enter elements of array in ascending order:- ");
        int arr[]=new int[size];
        int start=0, end=size-1,mid=0,flag=0;
        
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array is entered ");

        for(int i=0;i<size-1;i++)
        {
            if(arr[i]>arr[i+1]){
                System.out.println("array is not sorted");
                obj.sortarray(size,arr);

            }
            else{
                System.out.println("array is sorted no need to sort again ..");
            }
    
        }
        System.out.println("\n Enter element which you find in above array :");
        int element=sc.nextInt();
        
      
        while (start<end) {
            mid=(start+end)/2;  
                if (arr[mid] == element) {
                    flag = 1;
                    break;
                } else if (arr[mid] < element) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            
        if (flag==1) {
            System.out.println("element is present at location "+(mid));
        }else{
            System.out.println("element is not present in array ");
            
        }
    }
    public void sortarray(int size,int arr[]){
        for (int i = 0; i <size-1; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Now array is sorted .....");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
