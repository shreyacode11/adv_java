import java.util.ArrayDeque;

public class ArrayDequeStackExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        System.out.println("Peek: " + stack.peek()); // Retrieves top element

        System.out.println("Pop: " + stack.pop()); // Removes top element

        System.out.println("After pop: " + stack);
    }
}
