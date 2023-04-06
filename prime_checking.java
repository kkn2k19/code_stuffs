import java.util.*;
public class prime_checking{
  public static void main (String args []){
    System.out.println ("Provide a number : ");
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    
    if (n==2){
      System.out.println("Prime.");
    }
    else {
      boolean isPrime = true;
      for (int i =2; i<=Math.sqrt(n); i++){
        if (n%i==0){
          isPrime=false;
        }
      }
      
      if (isPrime == true){
        System.out.println("Prime.");
      }
      else {
        System.out.println("Not Prime.");
      }
    }
  }
  
