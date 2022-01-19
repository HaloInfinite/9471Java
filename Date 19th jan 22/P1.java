import java.util.*;

public class P1 {
public static void main(String args[]) {
	ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
	ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
	System.out.println("ArrayList 1: "+ list1);
	list1.addAll(list2);
	System.out.println("ArrayList 1: "+ list2);
	System.out.println("Joined ArrayList: "+ list1);
}
}
