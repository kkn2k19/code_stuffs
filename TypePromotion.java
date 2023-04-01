public class TypePromotion {
    public static void main(String args[]) {
        // Type Promotion
        // 1. java automatically promotes each byte, short or char operand to int when
        // evaluating an expression.
        // 2. if one operand is long, float or double the whole expression is promoted
        // to long, float or double espectively.

        char a = 'a';
        char b = 'b';
        System.out.println((int) (a));
        System.out.println((int) (b));
        System.out.println(b - a);

    }

}
