package PriorityQ;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Random;
// adds array into heap using PriorityQueue method=
// Using priority queues to determeint highes/lowest values

public class PriorityQ {
    public int[] array;

    public void setArray (int[] array){
        this.array = array;
    }
    public int[] getArray (int[] array){
        this.array = array;
        return array;
    }


    public int minHeap(int[] array){
        System.out.println("[!] Starting min-heap find on array:\n\t"+ Arrays.toString(array));
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int x = 0; x <= array.length-1; x++){
            heap.add(array[x]);
        }
        System.out.println("XXXXXXXXXXXXXXXXXXXXXX");
        for (int x = 0; x < array.length-1; x++){
            heap.poll(); // RESHUFFLES THE TREE
            System.out.println("[+] Heap Peak:\n\t"+ heap.peek() + "");
        }System.out.println("XXXXXXXXXXXXXXXXXXXXXX");
        return 1;

    }
    public int maxHeap(int[] array){
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        System.out.println("[!] Starting max-heap find on array:\n\t"+ Arrays.toString(array));
        System.out.println("XXXXXXXXXXXXXXXXXXXXXX");

        for (int i = 0; i <= array.length-1; i++){
            heap.add(array[i]);
        } System.out.println("XXXXXXXXXXXXXXXXXXXXXX");

        for (int i = 0; i <= array.length-1; i++){
            heap.poll();
            System.out.println("[+] Heap Peak [Reversed]:\n\t"+ heap.peek() + "");
        }
        return 1;
    }

    public int findKthValueMax(int [] array, int val) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        System.out.println("[!] Finding value[MAX-HEAP]\n\t"+val);
        if (array.length < val){
            return -1;}

        // [Create the Min-Heap for Input Value //
        for(int i = 0; i < val - 1; i++){
            heap.add(array[i]);}
        System.out.println("[!] Peak \n\t"+heap.peek());

        for(int i = 0; i < array.length; i++){
            if (array[i] > val){
                heap.poll();
                heap.add(array[i]);
            }        System.out.println("[+][MIN-HEAP] Found val " +val + " Heap-Peak\n\t "+heap.peek());

        }
        return array[val];
    }

    public int findKthvalueMin(int[]array, int val){
        System.out.println("[!] Finding value [MIN-HEAP]\n\t"+val);
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

        // [Adds heap up to val in array]
        for (int i=0; i < array.length; i++){
            heap.add(array[i]);
        }

        for (int i=0; i< val-1; i++){
            heap.poll();
        }
        System.out.println("[+][MIN-HEAP] Found val " +val + " Heap-Peak \n\t"+heap.peek());
        return array[val];

    }
    public static void main(String[] args) {
        //[VARS]
        int [] array  = {1,2,3,4,12,2,43,5,2,452,2,23};
        int[] unsorted = new int[51];
        int upperLimit = 50;

        //[MAKE RANDOM ARRAY]
        Random rand = new Random();
        int val = rand.nextInt(upperLimit);

        for(int x = 0; x <= upperLimit; x++){
            unsorted[x] = rand.nextInt();
        } System.out.println("[+] Randomly unSorted Array:\n\t"+ Arrays.toString(unsorted)+"\n");


        // [CALLS]
        PriorityQ heap = new PriorityQ();
         heap.setArray(array);
      //   array = heap.getArray(array);
        int sortedMin = heap.minHeap(unsorted);
        int sortedMax = heap.maxHeap(unsorted);
        int findKmax = heap.findKthValueMax(unsorted, val);
        int findKmin = heap.findKthvalueMin(unsorted, val);
         System.out.println("[+] Sorted-Min:\n\t"+ sortedMin+"\n");
         System.out.println("[+] Sorted-Max:\n\t"+ sortedMax+"\n");
         System.out.println("[+] find pos "+ val +" [Max-Heap] :\n\t"+ findKmax +"\n");
         System.out.println("[+] find pos "+ val +" [Min-Heap] :\n\t"+ findKmin +"\n");
}
}

