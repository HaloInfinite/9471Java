import java.util.*;

public class Queue_Test1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(4);
		stack.push(3);
		stack.push(5);
		stack.push(6);
		stack.push(2);
		System.out.println("Before operation: " + stack);
		System.out.println("Removed ele 1: " + stack.pop());
		System.out.println("Removed ele 2: " + stack.pop());
		System.out.println("After operation: " + stack);
	}

}
//Eclipse compiler