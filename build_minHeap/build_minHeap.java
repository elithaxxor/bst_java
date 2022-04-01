package build_minHeap;
import java.util.*;

// list array heap

class MinHeap{
        List<Integer> heap = new ArrayList<Integer>();

        public MinHeap(List<Integer> array){
            this.heap = buildHeap(array);
        }

        public List<Integer> buildHeap(List<Integer> array){
            int firstParentIdx = (array.size() - 2 )/2;
            System.out.println("[!] Array Size\n\t"+firstParentIdx);

            for (int currentIdx = firstParentIdx; currentIdx >= 0; currentIdx--){
                siftDown(currentIdx, array.size()-1, array);
            } return array; }

        public void siftDown(int currentIdx, int endIdx, List<Integer> array){
            int childOneIdx = currentIdx * 2 + 1;
            int childTwoIdx0 = currentIdx * 2 + 2;
            int parent = (array.size() - 2 )/2;

            System.out.println("[!] Array \n\t"+ array.toString());
            System.out.println("[!] Array Size\n\t[size] "+ array.size());
            System.out.println("[!] Indexes: [current/end] \n\t[curr] "+ currentIdx +" [end] "+ endIdx);
            System.out.println("[!] Children Index: [one/two] \n\t[1]"+ childOneIdx +" [2] "+ childTwoIdx0);
            System.out.println("[!] Parent: \n\t[] "+ parent);

            while (childOneIdx <= endIdx){
                int childTwoIdx = currentIdx * 2 + 2 <= endIdx ? currentIdx * 2 + 2 : -1;
                int idxToSwap;
                if (childTwoIdx != -1 && heap.get(childTwoIdx) < heap.get(childOneIdx)){
                    idxToSwap = childTwoIdx;
                }else {
                    idxToSwap = childOneIdx;
                }
                if (heap.get(idxToSwap) < heap.get(currentIdx)){
                    swap(currentIdx, idxToSwap, heap);
                    currentIdx = idxToSwap;
                    childOneIdx = currentIdx *2 + 1;
                } else {
                    return;
                }
            }
         }

         public void siftUp(int currentIdx, List<Integer> heap){
            int parentIdx = (currentIdx - 1) / 2;
            while (currentIdx > 0 && heap.get(currentIdx) < heap.get(parentIdx)) {
                swap(currentIdx, parentIdx, heap);
                currentIdx = parentIdx;
                parentIdx = (currentIdx - 1) /2;
             }
         }

         public int peek(){
            return heap.get(0);
         }

         public int remove(){
            swap(0, heap.size()-1, heap);
            int valueToRemove = heap.get(heap.size()-1);
            heap.remove(heap.size() -1);
            siftDown(0, heap.size()-1, heap);
            return valueToRemove;
         }


         public void insert(int value){
            heap.add(value);
            siftUp(heap.size()-1, heap);
         }
         public void swap(int parent, int swapval, List<Integer> heap){
            Integer temp = heap.get(swapval);
            heap.set(swapval, heap.get(parent));
            heap.set(parent, temp);
         }






         public static class build_minHeap {
         public static void main(String[] args) {
             List<Integer> input_array = new ArrayList<Integer>();
             MinHeap run_heap = new MinHeap(input_array);

             for (int x = 0; x < 10; x++) {
                 input_array.add(x);
             }

             System.out.println(input_array);
             run_heap.buildHeap(input_array);
             int peek = run_heap.peek();
             run_heap.insert(22);
             int delete = run_heap.remove();
             System.out.println("[+] peek val\n\t "+peek);
             System.out.println("[+] delete val\n\t "+delete);
         }
        }
}

