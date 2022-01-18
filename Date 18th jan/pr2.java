import java.util.*;

public class pr2 {
public static void main(String [] a) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st no:");
	int n1 = sc.nextInt();
	System.out.println("Enter 2nd no:");
	int n2 = sc.nextInt();
	System.out.println("Enter 3rd no:");
	int n3 = sc.nextInt();
	
	int sum = n1 + n2 + n3;
	double average = sum / 3.0;
	int min = (n1 < n2) && (n1 < n3) ? n1 : (n2 < n3) ? n2 : n3;
	int max = (n1 > n2) && (n1 > n3) ? n1 : (n2 > n3) ? n2 : n3;
	System.out.println("Sum = " + sum + " Average = " + average + " Min = " + min + " Max = " + max);
}
}
