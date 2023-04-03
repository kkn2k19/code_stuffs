import java.util.*;

public class largest_of_3_no {
    public static void main(String args[]) {
        int a = 7, b = 3, c = 6;

        if (a >= b && a >= c) {
            System.out.println("a is largest.");
        }
        else if (b >= c) {
            System.out.println("b is largest.");
        } else {
            System.out.println("c is largest.");
        }
    }
}
