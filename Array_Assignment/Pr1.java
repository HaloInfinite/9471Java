import java.util.Scanner;

public class Pr1 {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter array size: ");
int size = sc.nextInt();
int[] arr = new int[size];
System.out.println("Enter array values ");
for(int i = 0; i < size; i++) {
	arr[i] = sc.nextInt();
	}

System.out.println();
System.out.println("Enter a size of string array: ");
int size2 = sc.nextInt();
String[] arr2 = new String[size2];
System.out.println("Enter string array values: ");
Scanner scan = new Scanner(System.in);
for(int i = 0; i < size2; i++) {
	arr2[i] = scan.nextLine();
	}


Sort_asc(arr, size);
System.out.println("Sorted Numeric Array: ");
for(int d : arr) {
	System.out.print(d + " ");
}

System.out.println();
Sort_String(arr2, size2);
System.out.println("Sorted String Array: ");
for(String d : arr2) {
	System.out.print(d + " ");
}
}

private static void Sort_String(String[] arr2, int size2) {
	for(int i = 0; i < size2; i++) {
		for(int j = i + 1; j < size2; j++) {
			if(arr2[i].compareTo(arr2[j]) > 0) {
				String temp = arr2[i];
				arr2[i] = arr2[j];
				arr2[j] = temp;
			}
			}
			}
	}

private static void Sort_asc(int[] arr, int size) {
	for(int i = 0; i < size; i++) {
		for(int j = 0 + i; j < size; j++) {
			int temp = 0;
			if(arr[i] > arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			}
	}
}
}
