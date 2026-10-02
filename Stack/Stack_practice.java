import java.util.*;

public class Stack_practice {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        // Push elements
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println("Push elements:");

        for (Integer store : s) {
            System.out.println(store);
        }

        // Pop
        System.out.println("Deleted element: " + s.pop());

        // Remaining elements
        System.out.println("After pop:");

        for (Integer store : s) {
            System.out.println(store);
        }

        // Peek
        System.out.println("Top element: " + s.peek());
    }
}