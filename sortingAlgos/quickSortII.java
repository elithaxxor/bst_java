package sortingAlgos;

import buildMaxStack.buildMaxStack;

import java.util.*;

public class quickSortII {
    public static int[] quickSort(int[] array) {

        quickSort(array, 0, array.length-1);
        return array;
    }
    public static void quickSort(int[] array, int startIdx, int endIdx) {
        if (startIdx >= endIdx) {
            return;
        }
        System.out.println("[!] Starting Quick Sort- [+]");

        // [PARTITION VARIABLES]
        int pivotIdx = startIdx;
        int pivotIdx2 = Math.max((endIdx / 2), endIdx);
        int leftIdx = startIdx + 1;
        int rightIdx = endIdx;

        while (rightIdx >= leftIdx) {
            if (array[leftIdx] > array[pivotIdx] && array[rightIdx] < array[pivotIdx]) {
                swap(leftIdx, rightIdx, array);
            }
            if (array[leftIdx] <= array[pivotIdx]) {
                leftIdx += 1;
            }
            if (array[rightIdx] >= array[pivotIdx]) {
                rightIdx -= 1;
            }
        }
        // [END OF PARTITIONING==> 1. swap right with pivot. ===> 2. CHECK WHICH SUBARRAY IS LARGER, initiate recursion
        // IF LEFT SUBARRAY IS SMALLER --> RECURSE TO THE RIGHT
        // OF  RIGHT SUB ARRAY IS SMALLER, RECURSE TO THE LEFT.

        swap(pivotIdx, rightIdx, array);
        boolean compareLeftIndex = (rightIdx - 1 - startIdx) < (endIdx - (rightIdx + 1));
        System.out.println("[!] Is Left Sub-Partition smaller Than Right Sub Partition? [!]\n\t" + compareLeftIndex);
        if (compareLeftIndex) { // [IF RIGHT IS LARGER THAN LEFT]
            quickSort(array, startIdx, rightIdx - 1);
            quickSort(array, rightIdx + 1, endIdx);
        } else { // [IF RIGHT IS SMALLER]
            quickSort(array, rightIdx + 1, endIdx);
            quickSort(array, startIdx, rightIdx - 1);
        }
    }

    public static void swap(int left, int right, int[] array) {
        System.out.println("[!] Starting Quick Sort- [+]\n\t");
        System.out.println("[!] Array Right- [+]\n\t" + array[right]);
        System.out.println("[!] Array Left- [+]\n\t" + array[left]);

        int temp = array[right];
        array[right] = array[left];
        array[left] = temp;
        }

    public static void main(String[] args){
        int upperLimit = 20;
        Random rand = new Random();
        int val = rand.nextInt(upperLimit);
        quickSortII qs = new quickSortII();
        int[] unsorted = new int[val+1];

        for(int x = 0; x <= val; x++){
            int randNum = rand.nextInt();
            unsorted[x] = randNum;
        } System.out.println("[+] [UNSORTED]\n\t" + Arrays.toString(unsorted));
        int [] quickSort_Result = qs.quickSort(unsorted);
        System.out.println("[+] [SORTED]\n\t" + Arrays.toString(quickSort_Result));
        System.out.println("[+] [UNSORTED]\n\t" + Arrays.toString(unsorted));
    }
}

