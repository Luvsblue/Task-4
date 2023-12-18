import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();


        stack.push(5);
        stack.push(10);
        stack.push(15);

        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);
    }
}


