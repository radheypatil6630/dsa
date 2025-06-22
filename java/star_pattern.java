 class star_pattern{
 
 public static void main(String[] args) {
    System.out.println("Star Pattern 1:");  
    for(int i=0;i<4; i++){
        for(int j=0;j<i+1;j++){
            System.out.print("*");
        }
        System.out.println();
    }    


    System.out.println("Star Pattern 2:");
    for(int i =0 ;i<4 ;i++){
        int k =1;
        for(int j =0;j<i+1;j++){
            System.out.print(k);
            k++;
        }
        System.out.println();
    }
    

  
}
}