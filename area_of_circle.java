import java.util.*;

public class area_of_circle {
  public static void main (String args[]) {
    System.out.println("Provide value of radius : ");
    Scanner sc = new Scanner (System.in);
    int r = sc.nextInt ();
    float area = 3.14f*r*r;
    System.out.println("Area of Circle = " + area);
  }
}
