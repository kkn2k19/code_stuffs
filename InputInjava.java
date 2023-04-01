import java.util.*;

public class InputInjava {
    public static void main(String args[]) {
        System.out.print("Enter Input:-");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println("Your Input:-" + input);

        // in upper case it prints only the words before a (space). to view full line
        // use { nextLine()} function in sc scanner in next code/program

    }
}
