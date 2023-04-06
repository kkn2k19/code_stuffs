import java.util.*;
public class sum_n_natural_no {
  public static void main (String args []){
    Scanner sc=new Scanner (System.in);
    System.out.println("Provide n : ");
    int n=sc.nextInt ();
    int s=0;
    for (int i=1; i<=n; i++){
      s=s+i;
    }
    System.out.println("Sum of first"+ n+ "natural numbers is ="+s);
  }
}
