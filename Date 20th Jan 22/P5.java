import java.util.*;

  public class P5 {
  public static void main(String[] args) {
          ArrayList<String> c1= new ArrayList<String>();
          c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");
          System.out.println("Original array list: " + c1);
          System.out.println("Trimmed Array: ");
          c1.trimToSize();
          System.out.println(c1);
   }
}
