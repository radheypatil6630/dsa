import java.util.Arrays;

public class evenOdd {
    public static void main(String[] args) {
        int[] nums = {3,5,6,7};
        System.out.println(numSubseq( nums, 9));
    }
//    static  String checkEven(){
//        int n = 67;
//        return (n&1)== 1 ? "odd" : "even";
//    }

   static public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);

        int numSubSequences = 0;

        int ptr1 = 0, ptr2 = 0;

        for(int i = 0 ; i < nums.length ; i++){

            for(int j = i ; j < nums.length ; j++){
                if(nums[i] + nums[j] > target){
                    break;
                }
                System.out.println(i+" "+j);
                numSubSequences++;
            }
        }
        return numSubSequences;
    }

}