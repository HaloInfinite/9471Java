import java.util.*;
import java.util.stream.*;

class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		ArrayList<Integer> list1 = new ArrayList<>(n);
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();
		for (int i = 0; i < n; i++)
			list1.add(sc.nextInt());

		for (Integer x : list1) {
			if (!list2.contains(x))
				list2.add(x);
			else
				list3.add(x);
		}
		Stream<Integer> s = list3.stream().distinct().sorted();
		List<Integer> l3 = s.collect(Collectors.toList());
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		System.out.println(l3);
		sc.close();
	}
}