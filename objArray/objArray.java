package objArray;

import java.util.Arrays;

public class objArray {
    public static class monkey {

    }
    public static void main (String [] args){
        Object [] array = new Object[20];
        monkey m = new monkey();
        String s = "String in an array";
        array[0] = m;
        array[1] = s;
        System.out.println(Arrays.toString(array));

    }
}
