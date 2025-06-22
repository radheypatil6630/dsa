

class fruits_basket {
    public static  int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int m = baskets.length;
        boolean[] basks = new boolean[n];
        int count= 0;
                for(int i =0 ;i< n;i++){
                    for(int j = 0 ;j< m ;j++){
                        if(fruits[i] <= baskets[j] && basks[j]!=true){
                           
                            basks[j]= true;
                            count++;
                           break;
                        }
                    }
                }
                    return m-count;
        }
    
    
    public static void main(String[] args) {
        int[] fruits = {4,1,3};
        int[] baskets = {3,5,4};
        System.out.println(numOfUnplacedFruits(fruits, baskets));

       
    }
}