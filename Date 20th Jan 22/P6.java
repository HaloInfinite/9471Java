import java.util.*;

public class P6 {
public static void main(String a[]) {
	LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
	Scanner sc = new Scanner(System.in);
	System.out.println(list1);
	System.out.print("Enter 1st ele: ");
	int n1 = sc.nextInt();
	System.out.println("Enter last ele: ");
	int n2 = sc.nextInt();
	list1.addFirst(n1);
	list1.addLast(n2);
	System.out.println(list1);
}
}
