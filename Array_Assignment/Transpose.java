import java.util.*;

public class Transpose {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row : "); 
		int row = sc.nextInt();
		System.out.print("Enter column : "); 
		int column = sc.nextInt();
		int[][] arr = new int[row][column];
		System.out.println("Enter array elements: ");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Original Matrix: ");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] arr2 = new int[row][column];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				arr2[i][j] = arr[j][i];
			}
		}
		System.out.println("Transpose Matrix: ");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
}
}