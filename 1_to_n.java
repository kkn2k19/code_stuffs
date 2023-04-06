import java.util.*;
public class 1_to_n{
  public static void main (String args[]){
    System.out.println("Provide n : ");
    Scanner sc= new Scanner (System.in);
    
    int n = sc.nextInt();
    for (int i = 1; i<=n; i++){
      System.out.println(i);
    }
    
    /* 
    int i=1;
    while(i<=n){
    System.out.println(i);
    }
    
    
    int i=1;
    do {
    System.out.println(i);
    } while (i<=n);
    */
    
  }
}
