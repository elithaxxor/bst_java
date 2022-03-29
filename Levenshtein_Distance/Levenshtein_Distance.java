//package Levenshtein_Distance;
//// given two strings, figure out how  many iterations it willt ake to make one string into the other.
//
//import java.util.Arrays;
//
//public class Levenshtein_Distance {
//    public static int levenshteinDistance(String str1, String str2) {
//        String small = str1.length() < str2.length() ? str1 : str2;
//        String large = str1.length() >= str2.length() ? str1 : str2;
//
//        // [CREATES EMPTY ARRAYS]
//        int [] evenEdits = new int[small.length()+1];
//        int [] oddEdits = new int [small.length()+1];
//
//        System.out.println("[+] Smaller String--> " + small);
//        System.out.println("[+] Larger String--> " + large);
//        //System.out.println("[+] Even Edits--> " + Arrays.toString(evenEdits));
//        //System.out.println("[+] Odd Edits--> " + Arrays.toString(oddEdits));
//
//        for (int i = 0; i < large.length(); i++){
//            evenEdits[i] = i;
//            System.out.println("[+] Even Edits--> " + Arrays.toString(evenEdits));
//        }
//
//
//        int[] currentEdits;
//        int[] previousEdits;
//
//        for(int j = 1; j < large.length()+1; j++){
//           if (i %2==1){
//               currentEdits = evenEdits;
//               previousEdits = oddEdits;
//           }
//           currentEdits[0]
//        }
//        return -1;
//    }
//    public static void main(String[] args){
//        String str1 = "sad";
//        String str2 = "badd";
//        int result = levenshteinDistance(str1,str2);
//        System.out.println(result);
//
//
//    }
//}
