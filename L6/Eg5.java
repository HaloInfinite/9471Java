import java.io.*;
class Multiply {
private int mul;

public Multiply(int num){
mul = num;
}

public void showTable(){
for(int i = 1; i <=10 ; i++)
	System.out.println(mul + " x " + i + " = " + (mul * i));
}
}

class Eg5 {
public static void main(String args[]){
Console c = System.console();
int num = Integer.parseInt(c.readLine("Enter a no whose table u want to print: "));
Multiply m = new Multiply(num);
m.showTable();
}
}
