import java.util.*;

public class Pr5 {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter array size: ");
	int size = sc.nextInt();
	int[] arr = new int[size];
	System.out.println("Enter array elements: ");
	for(int i = 0; i < size; i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println("Enter no u want to search: ");
	int search = sc.nextInt();
	for(int i = 0; i < size; i++) {
		if(search == arr[i]) {
				System.out.println("Match found at " + i);
				break;
		}
				
	}
}
}
