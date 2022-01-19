import java.util.ArrayList;
import java.util.Arrays;

public class P4 {
public static void main(String args[]) {
	ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
	ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
	System.out.println("**Before**");
	System.out.println("ArrayList 1: "+list1);
	System.out.println("ArrayList 2: "+list2);
	list1.clear();
	System.out.println("After");
	System.out.println("ArrayList 1: "+list1);
	System.out.println("ArrayList 2: "+list2);
	boolean b1 = list1.isEmpty();
	boolean b2 = list2.isEmpty();

	System.out.println("ArrayList 1 is empty: " +b1);
	System.out.println("ArrayList 2 is empty: "+b2);
}
}
