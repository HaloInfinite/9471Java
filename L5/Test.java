class Test{
int id;
String name, surname;

public static void main(String args[]){

Test obj1 = new Test();
Test obj2 = new Test();

obj1.id = 10;
obj1.name = "Mayuresh";
obj1.surname = "Pednekar";
System.out.println(obj1.id);
System.out.println(obj1.name + " " + obj1.surname);

System.out.println("");
System.out.println("*********************");

obj2.id = 20;
obj2.name = "May";
obj2.surname = "Ped";
System.out.println(obj2.id);
System.out.println(obj2.name + " " + obj2.surname);

}
} 