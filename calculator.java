import java.util.*;

public class calculator{
  public static void main (String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("Provide num1 : ");
    int a = sc.nextInt();
    System.out.println("Provide num2 : ");
    int b = sc.nextInt();
    System.out.println("select the operator : ");
    char operator = sc.next().CharAt(0);
