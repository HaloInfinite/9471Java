import java.util.*;

public class pr1 {
public static void main(String [] a) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st no:");
	int n1 = sc.nextInt();
	System.out.println("Enter 2nd no:");
	int n2 = sc.nextInt();
	System.out.println("Before " + " n1 = " + n1 + " n2 = "+ n2);
	n1 = n1 + n2;
	n2 = n1 -n2;
	n1 = n1-n2;
	System.out.println("After " + " n1 = " + n1 + " n2 = "+ n2);
		
}
}
