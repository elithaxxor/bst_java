package sortingAlgos;
import java.util.Arrays;
import java.util.Random;

//import static java.util.Arrays.swap;

public class sortingAlgos {
    public int val;

     void unsorted(int val){
        this.val = val;
    }

    // establishg pivot point, move smaller to left and larger to the right.
    // Create a counter, one to keep track of the last swap position, and another to increment list
    public static void quickSort(int[] array, int left, int right) {
         int count = 0;
        int pivot = array[(left+right)/2];
        System.out.println("[!] Starting Quick-sorting Algorithm \n\t[PIVOT]"+pivot);
        if (left >= right){
            return;
         }
        int index = partition(array, left, right, pivot);

        quickSort(array, left, index - 1);
        quickSort(array, index, right);
        //return array;
        System.out.println("[!] Counted " + count + "passes, returning array\n\t"+Arrays.toString(array));
//
//        count++;
//        if (count == right){
//            System.out.println("[!] Counted " + count + "passes, returning array\n\t"+Arrays.toString(array));
//            return;
//        }
    }
    public static int partition(int[] array, int left, int right, int pivot){
        while(left <= right){
            while (array[left] < pivot) {
                left++; }

        while(array[right] > pivot){
            right--;
        }
        if (left <= right) {
            swap(array, left, right);
            left++;
            right--; }
        } return left;
    }

    public static void swap(int[] array, int left, int right) {
         array[left] = array[right];
         array[right] = array[left];
    }


    int[] quickSortHelper(int[] array, int left, int right){
        if (left > right){
            System.out.println("returning array");
            return array;
        }
        return array;
    }

    /* [Logic] --> Creates an empty array (51) and fills with empty numbers */
    public static void main(String [] args){
        int[] unsorted = new int[52];
         Random rand = new Random();
        int upperLimit = 50;
        for(int x = 0; x <= upperLimit; x++){
                unsorted[x] = rand.nextInt();
        } System.out.println("[+] Randomly unSorted Array:\n\t"+ Arrays.toString(unsorted)+"\n");


        sortingAlgos sort = new sortingAlgos();
        int left = 0; int right = unsorted.length - 2;

        //int [] quickResults =
        quickSort(unsorted, left, right);
       System.out.println("\n\n[+] Original Unsorted Array:\n\t "+ Arrays.toString(unsorted));



    }
}
