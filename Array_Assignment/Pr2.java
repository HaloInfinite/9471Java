import java.util.Scanner;

public class Pr2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int sum = 0;
		System.out.println("Enter array values ");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
			}
		for(int i = 0; i < size; i++) {
			sum = sum + arr[i];
			}
		System.out.println("Sum of array = " + sum);
}
}
