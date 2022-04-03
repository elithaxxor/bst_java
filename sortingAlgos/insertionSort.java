package sortingAlgos;

// [INSERTION-SORT]--> SEARCH, INSERT, SHIFT .
// Whenever inserting any value, the array should be first sorted.
// [LOGIC] --> insert a value in a sorted array.
// ?= Unlike a linked list, an Array needs to be Unsorted . (LinkedList == insert/del)
// => find where value should be inseerted (between low[i] and high[j])
// => then insert and shift.

import java.util.Arrays;
import java.util.Random;

public class insertionSort {

      public static int[] runInsertionSort01(int[] unsorted) {
          if (unsorted.length == 0) {
              return unsorted;
          }

          System.out.println("[!] Starting Insertion Sort One [Iterative] \n\t " + Arrays.toString(unsorted));
          // [LOGIC] --> Set initial val [i]  +1; then assign val[j] = i-1 (value behind val[i])
          // --> [while loop condition] --> while unsorted[j] is > currentIndex;
          for (int i = 1; i < unsorted.length; i++) {
              int j = i - 1;
              int currentIndex = unsorted[i];
              while (j > -1 && unsorted[j] > currentIndex) { // start comparasson
                  unsorted[j + 1] = unsorted[j];
                  j--;
              }
              unsorted[j + 1] = currentIndex;
              System.out.println("[+] [Insertion-Sort-01] Results: \n\t " + Arrays.toString(unsorted));
          }
          return unsorted;
      }



            //--> [RECURSIVE]
          public static int[] runInsertionSort02 (int[] unsorted){
              if (unsorted.length == 0) {
                  return unsorted;
              }

              for (int i = 1; i < unsorted.length; i++) {
                  int j = i;
                  while (j > 0 && unsorted[j] < unsorted[j - 1]) {
                      swap(j, j - 1, unsorted);
                      j--;
                  }
              }
              System.out.println("[+] [Insertion-Sort-02] Results: \n\t " + Arrays.toString(unsorted));
              return unsorted;
          }

          public static void swap ( int i, int j, int[] unsorted){ // [HELPER SWAP FUNCTION]
              int temp = unsorted[j];
              unsorted[j] = unsorted[i];
              unsorted[i] = temp;
          }


    public static void main(String[] args) {
        Random rand = new Random();
        int upperLimit = 20;
        int val = rand.nextInt(upperLimit);
        int[] unsorted = new int[val + 1];

        insertionSort qs1 = new insertionSort();

        for (int x = 0; x <= val; x++) {
            int randNum = rand.nextInt();
            unsorted[x] = randNum;
        }
        System.out.println("[+] [UNSORTED]\n\t" + Arrays.toString(unsorted));
        int[] result01 = qs1.runInsertionSort01(unsorted);
        int[] result02 = qs1.runInsertionSort02(unsorted);
        System.out.println("[+] [UNSORTED 01]-- RESULTS \n\t" + Arrays.toString(result01));
        System.out.println("[+] [UNSORTED 02]-- RESULTS \n\t" + Arrays.toString(result02));
    }
}


