package constructMinMaxStack;
import buildMinMaxStack.minMaxStack;

import java.util.*;
// use array to store stack
// peak() --> array[-1]
// use 2 hashmaps to push vals--> map min val to "min" && map max cal to "max" in hash map (lastMinMax vals and newMinMax vals)



public class constructMinMaxStack {
    List<Map <String, Integer>> minMaxStack = new ArrayList<Map<String, Integer>>();
    List<Integer> stack = new ArrayList<Integer>();

    public int peek(){
        return stack.get(stack.size()-1);
    }
    public int pop(){
        minMaxStack.remove(minMaxStack.size() -1);
        return stack.remove(stack.size() - 1);
    }
    public void push(int val){
        Map<String, Integer> newMinMax = new HashMap<String, Integer>();
        newMinMax.put("min", val);
        newMinMax.put("max", val);
        if (minMaxStack.size() > 0){
            Map<String, Integer> lastMinMax = new HashMap<String, Integer>(minMaxStack.get(minMaxStack.size()-1));
            newMinMax.replace("min", Math.min(lastMinMax.get("min"), val));
            newMinMax.replace("max", Math.max(lastMinMax.get("max"), val));
        }
        minMaxStack.add(newMinMax);
        stack.add(val);

    }
    public int getMin(){
        return minMaxStack.get(minMaxStack.size()-1).get("min");
    }
    public int getMax(){
        return minMaxStack.get(minMaxStack.size()-1).get("max");
    }

    public static void main (String[] args){
        constructMinMaxStack mm = new constructMinMaxStack();
        mm.push(10);
        mm.push(12);
        mm.push(9);
        mm.push(4);
        int peek = mm.peek();
        System.out.println("[+] get min \n\t"+mm.getMin());
        System.out.println("[+] get max \n\t"+mm.getMax());
        System.out.println("[+] peek val \n\t"+peek);

    }
}
