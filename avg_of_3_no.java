import java.util.*;

public class avg_of_3_no {
public static void main (String args[]){
  System.out.println("Provide 3 integer values : ");
  Scanner sc = new Scanner (System.in);
  int a = sc.nextInt();
  int b= sc.nextInt();
  int c= sc.nextInt();
  int avg = (a+b+c)/3;
  System.out.println("Average of 3 Given numbers is : " + avg);
}
}
