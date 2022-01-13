import java.util.*;
import java.io.*;

public class pr6 {

public static void main(String a[]) {
	Stack<Integer> ar = new Stack<>();
	ar.push(1); ar.push(2); ar.push(3);
	
	for(Integer x: ar) {
	System.out.print(x + " ");
	}
	System.out.println();
	System.out.println("***********************");
	ar.peek(); System.out.println(ar);
	System.out.println("***********************");
	ar.remove(0); System.out.println(ar);	
	System.out.println("***********************");
	ar.pop();
	System.out.println(ar);
}
}
