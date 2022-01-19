import java.util.*;

public class P2 {
public static void main(String args[]) {
	ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
	ArrayList<Integer> list2 = new ArrayList<>();
	list2 = (ArrayList)list1.clone();
	System.out.println("ArrayList Orginal: "+list1);
	System.out.println("ArrayList Copy: "+list2);
}
}
