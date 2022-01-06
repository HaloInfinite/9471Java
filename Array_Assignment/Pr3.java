import java.util.Scanner;

public class Pr3 {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no of lines the pattern should be printed: ");
	int n = sc.nextInt();
	for(int i = 1; i <= n; i++) {
		for(int j = 1; j <= n; j++) {
			System.out.print("-	");
		}
		System.out.println();
	}
}
}
