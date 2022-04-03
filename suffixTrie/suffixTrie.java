package suffixTrie;
import java.util.*;


/*
    * [SUFFIX-TRIE] --> A Suffix tree is a compressed trie containing all suffixes off given text as keys and positions in the text as values
    * -> store charicteres, each node stores a char. Each subsequent node creates a word or part word [Optimal Storage-- Balanced BST())
    *
    * = [ROOT] = empty
    * = [CHILDREN] -> suffix
    * = [LOGIC]--> use hash table, where every node in the tree is a key in a hash table, pointing to another hash table.
    * All the values in the hash-table will oiont to specific letters down the tree
    * [the first suffix]-> will be the entire string, starting at index 0
    * [if node is not stored in tree, create a branch by creating hash key with it pointing to another empty hash table ]
 */


/*
    * [POPULATE]--> Iterate through string suffixies and add them to tree
    * -> loop, and  call insert method using iter val.
    * [INSERT]--> Checks wether of not charicter is already stored in tree
    *  -> create node with root. (node = self.root)
    *  => start insertion from passed in iter val, assign forward iter letter var.
    *  => conditional [if letter not in node/tree]
    *  =>=> add node to hash table; then assign node reference to node[letter] val && kill recursion with endSymbol bool [ defined in class init() ]
* */

public class suffixTrie {

   static class Node {
        Map<Character, Node> childrenHash = new HashMap<>();
    }

    // [CONSTRUCT]
    static class SuffixTrie {
         Node root = new Node();
        char endSymbol = '*';

        public SuffixTrie(String str) { // [CALL TO POPULATE]
            populateSuffixTrieFrom(str);
        }

        public void populateSuffixTrieFrom(String str) {
            System.out.println("[!] [POPULATING TREE] \n\t" + str);
            for (int i = 0; i < str.length(); i++) {
                insertSubStringStartingAt(i, str);
            }
        }

        public void insertSubStringStartingAt(int i, String str) {
            Node node = root;
            for (int j = i; j < str.length(); j++) {
                char letter = str.charAt(j);

                // [CONDITIONAL] if !node not in hashtable, create new node, and put [letter+child] as [key/val]
                if (!node.childrenHash.containsKey(letter)) {
                    Node newChild = new Node();
                    node.childrenHash.put(letter, newChild);
                }
                node = node.childrenHash.get(letter);
            }
            node.childrenHash.put(endSymbol, null); //[END]
        }

        public boolean contains(String str) {
            System.out.println("[!] [CONTAINS] CHECKING: \n\t" + str);
            Node node = root;

            for (int i = 0; i < str.length(); i++) {
                char checkLetter = str.charAt(i);
                if (!node.childrenHash.containsKey(checkLetter)) {
                    return false;
                }
                node = node.childrenHash.get(checkLetter);
                System.out.println("[!] [CONTAINS] CHECKING: \n\t" + node.childrenHash);

            }
                return node.childrenHash.containsKey(endSymbol);
            }



    public static void main (String [] args){
       System.out.println("[+] Suffix Trie");
       String str = "i wish i could be you, captain computer science *";
        suffixTrie st = new suffixTrie();
        st.populateSuffixTrieFrom(str);
    }
}

}

