import java.util.*;
public class leap_year{
  public static void main (String args[]){
    System.out.println("Enter year. : ");
    Scanner sc= new Scanner (System.in);
    int yr = sc.nextInt ();
    if (yr%4==0){
      if (yr%100==0){
        if (yr%400==0){
          System.out.println("Leap year. ");
        }
        else {
          System.out.println("Not a Leap year.");
        }
      }
      else {
        System.out.println("Not a leap year.");
      }
    }
    else {
      System.out.println("Not a leap year.");
    }
  }
}
