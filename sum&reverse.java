import java.util.*;
public class sum&reverse {
  public static void main (String args []){
    Scanner sc = new Scanner (System.in);
    System.out.println("Provide number : ");
    int n=sc.nextInt();
    int s=0, r=0;
    
    for (i=n; i>0; i++){
      int d= i%10;
      s=s+d;
      r=r*10+d;
    }
    
    System.out.println("Sum of digits : "+ s);
    System.out.println("Reverse of the number : "+n+"is"+r);
  }
}
