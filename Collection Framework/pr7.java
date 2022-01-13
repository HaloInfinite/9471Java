import java.util.*;
import java.io.*;

public class pr7 {
public static void main(String [] a) {
	PriorityQueue<String> pq = new PriorityQueue<>();
	
	pq.offer("Mayuresh"); pq.offer("Avinash"); pq.offer("Sachin"); pq.offer("Vignesh"); // adding ele to queue
	
	for(String x : pq) {
		System.out.print(x + " "); // printing queue ele
	}
	System.out.println();
	
	System.out.println("Peek:  " + pq.peek() ); // printing top ele
	
	System.out.println("Poll:  " + pq.poll()); // printing & removing top ele
	
	for(String x : pq) {
		System.out.print(x + " "); // printing queue ele
	}
}
}
