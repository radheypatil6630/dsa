import java.util.*;
public class selection_sort {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[]{121,32,1,89,30};
    int temp,min;

    for(int i=0;i<(arr.length);i++){
        min=i;
        
        for(int j=i+1;j<(arr.length);j++){
            if(arr[min]>arr[j])
            {
                min=j;
            }

        }
      temp=arr[min];
     arr[min]=arr[i];
     arr[i]=temp;
    }
    for(int i=0;i<arr.length;i++)
    {
       System.out.println(arr[i]);
    } 
 }  

}
