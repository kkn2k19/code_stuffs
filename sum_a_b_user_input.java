import java.util.*;

public class sum_a_b_user_input {
  public static void main (String args []){
    System.out.println("Provide the value of a and b : ");
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a+b;
    System.out.println("Sum of a and b = " + sum);
  }
}
