import java.io.*;

class Pyramid{
public static void main(String ... a) {
Console c = System.console();
int n = Integer.parseInt(c.readLine("Enter no of lines u wish to print: "));
for(int i = 1; i <= n; i++) {
	for(int j = n; j >= i; j-- )
		System.out.print("*");
	System.out.println();
	}
}
}