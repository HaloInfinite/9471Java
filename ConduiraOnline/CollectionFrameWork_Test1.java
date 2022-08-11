import java.util.*;

public class CollectionFrameWork_Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter set size: ");
		int n = sc.nextInt();
		Set<Integer> set = new HashSet<Integer>(n);
		System.out.println("Enter " + n + " Integers: ");
		for (int i = 0; i < n; i++) {
			int ans = sc.nextInt();
			set.add(ans);
		}
		System.out.println(set);
		sc.close();

	}

}

//Eclipse Compiler
