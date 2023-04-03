import java.util.*;

public class product_a_b_user_input {
  public static void main (String args[]){
    System.out.println("Provide values of a and b : ");
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Product of a and b : " + a*b);
  }
}
