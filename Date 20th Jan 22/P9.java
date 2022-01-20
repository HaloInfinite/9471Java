import java.util.*;

public class P9 {
public static void main(String a[]) {
	LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
	System.out.println("Before: " + list);
	list.add(0, 0);
	list.add(6,6);
	System.out.println("After: " + list);
}
}
