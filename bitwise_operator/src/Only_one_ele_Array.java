public class Only_one_ele_Array {
    public static void main(String[] args) {
        int[] a = {2,3,4,6,4,3,2};

        System.out.println("\nunique number = "+unique_element(a));
    }

    private static int unique_element(int[] a) {
        int unqiue =0;

        for(int i : a){

            unqiue ^= i;
            System.out.println();
            System.out.print(unqiue+"   ");
        }

        return unqiue;
    }
}
