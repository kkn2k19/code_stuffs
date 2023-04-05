import java.util.*;

public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide num1 : ");
        int a = sc.nextInt();
        System.out.println("Provide num2 : ");
        int b = sc.nextInt();
        System.out.println("select the operator : ");
        char operator = sc.next().charAt(0); // character is scanned like this only as it doesnot have next.Char()
                                             // syntax.

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Wrong Operator.");
        }
    }
}
