import java.io.*;

class A {
public static String toLower(String s){
	return s.toLowerCase();
}
public static void main(String ... a){
Console c = System.console();
String s = c.readLine("Enter orginal string: ");
String n = toLower(s);
System.out.println("LowereCase string: " + n);
}
}

