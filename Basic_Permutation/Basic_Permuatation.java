package Basic_Permutation;

// make two sets of-- scanned items and non scanned items.
// full = full string ; prefix = portion checked ; remaining = what needs to be checked
// .substring returns remaining string from given point .
public class Basic_Permuatation {

    public static void permute(String full) throws Exception {
        if (full == null || full.length() <= 0){
            System.out.println("[!] Cannot process an empty string" + full);
            return;
        }
        System.out.println("[+] Finding Permutations on\n\t"+full);
        findPermute("", full);
    }
    private static void findPermute(String prefix, String remaining) throws Exception{
        if(remaining.length() == 0){
            System.out.println("[+] Prefix\n\t" +"[p] "+ prefix);
            return;
            //throw new Exception("[-] Null");
        }int remain_len = remaining.length();


        for (int i = 0; i < remaining.length(); i++){
            findPermute(prefix+remaining.charAt(i),
                    remaining.substring(0, i) + remaining.substring(i+1, remain_len));
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("[!] To Find Permutations");
        String full = "asd";
        permute(full);
    }
}
