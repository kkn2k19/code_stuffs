import java.util.*;

public class bill_3_item_float_18tax {
  public static void main (String args []){
    System.out.println("Provide the prices of all items : ");
    Scanner sc = new Scanner (System.in);
    float pen= sc.nextFloat();
    float pencil = sc.nextFloat();
    float eraser = sc.nextFloat();
    float total = pen + pencil + eraser;
    System.out.println("Total bill without tax : " + total);
     //now for tax 18%
    
    float nettotal = total + (total * 0.18f);
    System.out.print("Total bill with 18% tax : " + nettotal);
  }
}
