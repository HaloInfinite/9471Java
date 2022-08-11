import java.util.*;

public class Queue_Test2 {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.add(1);
		queue.add(4);
		queue.add(3);
		queue.add(5);
		queue.add(6);
		queue.add(2);
		System.out.println("Before operation: " + queue);
		System.out.println("Removed ele 1: " + queue.remove());
		System.out.println("Removed ele 2: " + queue.remove());
		System.out.println("After operation: " + queue);
	}

}
//Eclipse compiler