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
    

    System.out.println("Star Pattern 3:");
    for(int i = 0 ;i <= 4; i++){
        for(int j =i;j<4;j++){
            System.out.print(" ");
        }
        for(int j =0;j<i*2+1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
  

      System.out.println("Upward Hollow Pyramid:");
      int n = 5; // height of the pyramid
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // stars and spaces between
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println(); // space between patterns

        System.out.println("Downward Hollow Pyramid:");
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // stars and spaces between
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
}
}