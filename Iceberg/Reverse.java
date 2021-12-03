import java.io.*;
class Reverse {
public static void main(String args[]) {
Console c = System.console();
String s1 = c.readLine("enter a string ");
s1 = s1.toLowerCase();
StringBuffer sb = new StringBuffer(s1);
sb.reverse();
System.out.println(sb);
}
}