import java.util.*;

public class CollectionFrameWork_Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list size: ");
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>(n);
		System.out.println("Enter " + n + " Integers: ");
		for (int i = 0; i < n; i++) {
			int ans = sc.nextInt();
			list.add(ans);
		}
		System.out.println(list);
		sc.close();

	}

}

//Eclipse Compiler
