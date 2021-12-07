import java.io.*;
class Cube{
public static void main(String args[]){
Console c = System.console();
int n = Integer.parseInt(c.readLine("Enter no of cubes to print: "));

for(int i = 0; i <= n; i++) 
	System.out.println("Number is " + i + " & cube of it is: " + Math.pow(i,3));
}
}