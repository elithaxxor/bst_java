package sortingAlgos;

/*
// [BINARY-SEARCH] --> Take and unsoreted array, and sort for given val. return index if found, else return -1
    * Replaces linear search.
    * On average-> requires atleaste half the array to be search. [TIME] n/2 == o(n)
    * Define two pointers: left and right. [0] [arr.len-1]
*/


import java.util.Arrays;
import java.util.Random;

 class binarySearch {
    public static int binarySearch0(int[] array, int target) {
        return binarySearch01(array, target, 0, array.length - 1);
    }

    public static int binarySearch01(int[] array, int target, int left, int right) {

        // [LOGIC] --> the middle val will change as the loop iterates; and will be value-checked between target and possibleMatch
        while (left <= right) {
            int middle = (left + right) / 2;
            int possibleMatch = array[middle];

            // [CHECK-LOOP-VALUES]
            if (target == possibleMatch){
                System.out.println("[+] [BINARY-SEARCH]-[FOUND]\n\t" + target);
                return middle;


                // [IF MISMATCH, CONTINUE TRAVERSAL]
            } else if (target < possibleMatch){
                right = middle-1;
            } else {
                left = middle + 1;
            }
            System.out.println("[+] [BINARY-SEARCH]-[DID NOT FIND]\n\t" + target);
            System.out.println(Arrays.toString(array));
        } return -1;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int upperLimit = 20;
        int val = rand.nextInt(upperLimit);
        int[] array = new int[val + 1];

        binarySearch bs1 = new binarySearch();

        for (int x = 0; x <= val; x++) {
            int randNum = rand.nextInt();
            array[x] = randNum;
        }
        System.out.println("[+] [UNSORTED]\n\t" + Arrays.toString(array));
        int bsresult01 = binarySearch0(array, 10);
        System.out.println("[+] [UNSORTED 01]-- RESULTS \n\t" + Arrays.toString(new int[]{bsresult01}));

    }
}
