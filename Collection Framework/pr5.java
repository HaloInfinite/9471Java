import java.util.*;
import java.io.*;

public class pr5 {

public static void main(String a[]) {
	LinkedList<Integer> ar = new LinkedList<>();
	ar.add(1); ar.add(2); ar.add(3); ar.add(4); ar.add(5); ar.add(6); ar.add(7);
	/*Iterator itr = ar.iterator();
	while(itr.hasNext()) {
		System.out.print(itr.next());
	}*/
	for(Integer x : ar){
		System.out.print(x + " ");
	}
}
}