import java.util.*;
 
public class hashing {
 
public static void main(String args[]){  
   
Scanner sc=new Scanner(System.in);    
    System.out.println("enter array size :");
    int size=sc.nextInt();
    System.out.println("enter "+size+" elements :");
      int arr[] =new int[size];
      for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();

      }
    //   int n = arr.length;
      countFreq(arr, size);  
  }
public static void countFreq(int arr[], int n)
{
    boolean visited[] = new boolean[n];
 
    for (int i = 0; i < n; i++) {
 
        // Skip this element if already processed
        if (visited[i] == true)
            continue;
 
        // Count frequency
        int count = 1;
        for (int j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
                visited[j] = true;
                count++;
            }
        }
        System.out.println(arr[i] + " " + count);
    }
}
}
