import java.util.*;

public class P10 {
public static void main(String a[]) {
	LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
	Scanner sc = new Scanner(System.in);
	System.out.println(list1);
	System.out.print("Enter ele to add: ");
	int n1 = sc.nextInt();
	System.out.println("Enter the pos the ele should be inserted: ");
	int index = sc.nextInt();
	list1.add(index, n1);
	System.out.println(list1);
}
}