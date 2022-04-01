package minHeap;
/*
*
* // in a min heap tree, the root node is always smallest, with each subsequent increasing in size.
* // take inserted element, compare with parent- if not in order, swap.
* Use priority queue to solve heap probelems
* two types of heasp --> max and mininmum heaps
* max-heap --> root is stored at top of tree
* need to maintain state when add and removing tree values.
* best use cases: maintaining a strucure where max or min trees are requred after add / remove (ie --> largest file hiearchy)
* */

// [MAX HEAP]
// left index = 2 * index + 1
// right index = 2 * index + 2
// parent index = (i-2) / 2
// then compare children and check if swap is needed (given the right and left index from above ^)

import java.util.Arrays;

public class minHeap {
     int capacity = 10;
     int len = 0;
     int [] array = new int[capacity];

     // HEAP SETUP
    /*********************************************************************************************/
    private int getLeftChild(int parentIndex){
         return 2 * parentIndex + 1;}
     private int getRightChild(int parentIndex){
         return 2 * parentIndex + 2;}
     private int getParentIndex(int childIndex){
         return (childIndex-1)/2;}

     private boolean hasLeftChild(int index){
         return getLeftChild(index) < len;}
     private boolean hasRightChild(int index){
        return getRightChild(index) < len;}
    private boolean hasParent(int index){
         return getParentIndex(index) >= 0;}

    private int leftChild(int index){
         return array[getLeftChild(index)];}

    private int rightChild(int index){
         return array[getRightChild(index)];}
    private int parent(int index){
         return array[getParentIndex(index)];}
    // END HEAP SETUP
/*********************************************************************************************/
/*********************************************************************************************/

// HEAP LOGIC
    private int getPeak(){
         if (len ==0){
             throw new IllegalStateException();
         }
         return array[0];
    }

    public void swap(int indexOne, int indexTwo){
         int temp = array[indexOne];
         System.out.println("[!] Performing Swap Method.. [Current Array]" + temp);
         array[indexOne] = array[indexTwo];
         array[indexTwo] = temp;
    }

    // checks if size fits, if not creates new array to refit.
    private void ensureCapacity(){
        System.out.println("[!] Ensuring Capacity. [Current Array Len]: " + len);
        if (len == capacity){
            array = Arrays.copyOf(array, capacity *2);
            capacity *=2;
        }
     }
     // REMOVES SMALLEST ELEMENT FROM TREE
    public int [] removeSmallest() throws Exception {
         if (len == 0){
             throw new Exception("Len is == 0");
         }
         int val = array[0]; // adds element to the end
         array[0]=array[len-1]; // moves array end to the pos 1.

         System.out.println("[!] First Val Was : "+val+"And is now: "+array[0]);
         len--;
         heapifyDown();
         return array;
    }
     public void add(int val){
        ensureCapacity();
        array[len] = val;  // adds element to the end
         len++;
         heapifyUp();
     }
     // to adjest heap, and shift upwards
    public void heapifyUp(){
        int index = len -1;
        while(hasParent(index) && parent(index) > array[index]){
            System.out.println("[!] Swapping elements:\n\t[PARENT-INDEX]"+getParentIndex(index)+"\n\t[NODE-INDEX]"+index);
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
        System.out.println("\n[!] Parent Index- "+index);
    }

    // To adjust the heap and shift elements down;
     public void heapifyDown(){
        int index = 0;
        while (hasLeftChild(index)){
            int smallChild = getLeftChild(index);
            if(hasRightChild(index) && rightChild(index) < leftChild(index)){
                smallChild = getRightChild(index);
            }
            if (array[index] < array[smallChild]){
                break;
            }else{
                swap(index, smallChild);
            }
        }
     }

        public void printHeap() {
            System.out.println(Arrays.toString(array));
            int range = array.length - 1;

            for (int x = 0; x <= range; x++){
                System.out.print(array[x] +", ");
            }
         }


    public static void main(String[] args){
        minHeap mh = new minHeap();
        int capacity = mh.capacity;
        int [] array = mh.array;
        int len = mh.len;
        System.out.println("[!] capacity "+capacity);
        System.out.println("[!] len "+len);
        System.out.println("[!] array "+ Arrays.toString(array));
        for(int x=0; x <=20; x++) {
            mh.add(x);
        }
        mh.printHeap();
    }
}

