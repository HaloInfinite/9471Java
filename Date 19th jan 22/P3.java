import java.util.*;

public class P3 {
public static void main(String args[]) {
	ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
	ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
	System.out.println("**Before**");
	System.out.println("ArrayList 1: "+list1);
	System.out.println("ArrayList 2: "+list2);
	list1.clear();
	list2.clear();
	System.out.println("After");
	System.out.println("ArrayList 1: "+list1);
	System.out.println("ArrayList 2: "+list2);
}
}
