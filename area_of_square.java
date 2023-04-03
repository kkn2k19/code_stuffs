import java.util.*;

public class area_of_square {
  public static void main (String args []){
System.out.println("Provide value of side of square : ");
    Scanner sc = new Scanner (System.in);
    int s = sc.nextInt();
    int area = s*s;
    System.out.printf("Area of Sqaure :  " + area);
  }
}
