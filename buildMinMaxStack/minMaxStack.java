package buildMinMaxStack;
import java.util.*;

// [MIN-MAX-STACK] --> most recent element is on the top.
// [POP] or remove from the top
// [TOP]--> look at top of the stack ]
// [PUSH] --> push element on stack
// [get min()] --> returns minmum value.


/*
    * crate two stacks--> main stack (stack)_ and min stack
* */
public class minMaxStack {
    Stack<Integer> mainStack = new Stack();
    Stack<Integer> minStack = new Stack();

    public void push(int val){
        if (minStack.isEmpty() || val < minStack.peek()){
            minStack.push(val);
            System.out.println("[+] Pushed Value to min stack: \n\t"+val);
            System.out.println("[+] [MIN-STACK]:\n\t"+ minStack.toString());
        }
        mainStack.push(val);
        System.out.println("[+] Pushed Value to main stack: \n\t"+val);
        System.out.println("[+] [MAIN-STACK]:\n\t"+ mainStack.toString());
    }
    public int top(){

        return mainStack.peek();
    }

    public int getMin(){
        System.out.println("[+] [MIN-STACK] MIN RESEULT :\n\t"+ minStack.peek());
        System.out.println("[+] [MAIN-STACK] MIN RESEULT :\n\t"+ mainStack.peek());

        return minStack.peek();
    }
    public static void main(String[] args){
        minMaxStack s = new minMaxStack();

        for (int x = 3; x <= 9; x++) {
            for (int j = 3; j <= 9; j++) {
                s.push(x);
                s.push(j);
            }
        }
        int top_result = s.top();
        int min_stackTop = s.getMin();
        System.out.println("[+] [MAIN] top result\n\t"+top_result);
        System.out.println("[+] [MIN] top result\n\t"+min_stackTop);

    }
}


