public class Main {
    /**
     *
     * @param array
     * @param n
     * @return
     */

    public static int findSmallCount(int[] array, int n){
        int counter =0;
        for(int i=0;i< array.length;i++){
            if(array[i] < n){
                counter++;
            }
        }



        return counter;
    }








    public static void main(String[] args) {
        System.out.println(findSmallCount(new int[] {1, 2, 3}, 2));
        System.out.println(findSmallCount(new int[] {1, 2, 3, 4, 5}, 0));
    }
}