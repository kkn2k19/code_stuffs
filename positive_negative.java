import java.util.*;

public class positive_negative {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Provide a number : ");
        int n = Sc.nextInt();
        if (n > 0) {
            System.out.println("positive number.");
        } else {
            System.out.println("negative number.");
        }
    }
}
