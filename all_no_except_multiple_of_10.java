import java.util.*;
public class all_no_except_multiple_of_10 {
  public staic void main (String args []){
    Scanner sc=new Scanner (System.in);
    System.out.println("Provide numbers : ");
    int n = sc.nextInt();
    
    while (true){
      if (n%10 ==0){
        continue ;
      }
      System.out.println("Number was =" + n );
    }
  }
}
