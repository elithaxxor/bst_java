package getNumberedPermutations;
import java.util.*;



public class getNumberedPermutations {

    public static List<List<Integer>> getPermutations(List<Integer> array){

        List<List<Integer>> permutations = new ArrayList<List<Integer>>(); // save the permutation lists in a nested list.
        getPermutations(array, new ArrayList<Integer>(), permutations);
        return permutations;
    }

    // create 2 new arrays in the for loop, 1 will  subtract the values that are added to newly created array . ( newPermutation && newArray)


    public static void getPermutations(List<Integer> array, List<Integer> currentPermutation, List<List<Integer>> permutations){
        System.out.println("[!] permutations\n\t"+ permutations);
        System.out.println("[!] current permutation\n\t"+ currentPermutation);
        System.out.println("[!] current permutation Size\n\t"+ currentPermutation.size());
        System.out.println("[!] array\n\t"+ array);

        if (array.size() == 0 && currentPermutation.size() > 0){
            permutations.add(currentPermutation);
        }else{
            for(int i = 0; i < array.size(); i++){
                List<Integer> newArray = new ArrayList<Integer>(array);
                newArray.remove(i);
                List<Integer> newPermutation = new ArrayList(currentPermutation);
                newPermutation.add(array.get(i));
                getPermutations(newArray, newPermutation, permutations);

            }
        }
    }

    public static void main(String[] args){
        List<Integer> unsorted = new ArrayList<Integer>();
        getNumberedPermutations getperm = new getNumberedPermutations();

        //[MAKE RANDOM ARRAY]
        // int[] unsorted = new int[26];
        int upperLimit = 25;
        Random rand = new Random();
        int val = rand.nextInt(upperLimit);

        for(int x = 0; x <= val; x++){
            int randNum = rand.nextInt();
            unsorted.add(randNum);
        } System.out.println("[+] Randomly unSorted Array:\n\t"+ Arrays.toString(new List[]{unsorted})+"\n");
        System.out.println(unsorted);
        getperm.getPermutations(unsorted);
    }
}
