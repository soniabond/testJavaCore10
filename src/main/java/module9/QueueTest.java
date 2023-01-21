package module9;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        //FIFO first in first out
        queue.add("first message");
        queue.add("second message");
        queue.add("third message");
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue.peek() = " + queue.peek());

        Stack<String> stack = new Stack<>();
        // LIFO last in first out
        stack.add("first action");
        stack.add("second action");
        stack.add("third action");
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
    }
}
