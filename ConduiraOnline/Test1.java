// Given an array of strings, write a program to count String whose length is more than 3 using java 8 streams

import java.util.*;

public class Test1 {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	List<String> slist = new ArrayList<String>();
	System.out.println("Do u wish to enter string values in array: y/n ");
	String reply = sc.next();
	while(reply.equals("y")) {
		System.out.println("Enter the string value: ");
		slist.add(sc.next());
		System.out.println("Do u wish to enter more string values in array: y/n ");
		reply = sc.next();
	}
	System.out.println("Input: " + slist);
	System.out.println("Output: " + slist.stream().filter(n -> n.length() > 3).count());	//forEach(e -> System.out.println(e + " "));
	sc.close();
}
}
