import java.util.*;

public class income_tax_calc {
    public static void main(String args[]) {
        System.out.println("Provide income value : ");
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000) {
            tax = (int) (0.2 * income);
        } else {
            tax = (int) (0.3 * income);
        }
        System.out.println("Your Tax = " + tax);
    }
}
