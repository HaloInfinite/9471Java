abstract class Parent {
public abstract void display();

public void display1() {
System.out.println("In Display1");
}
}

class Child extends Parent{
public void display(){
System.out.println("In Child");}
}

class Test {
public static void main(String args[]){
Child c = new Child();
c.display();
c.display1();
}
}