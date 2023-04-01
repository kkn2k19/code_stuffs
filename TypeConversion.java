public class TypeConversion {
    public static void main(String args[]) {

        // TYPE CONVERSION
        // Conversion happens when-
        // 1. type compatitable
        // 2. destination type is greater than source type in storage.

        // here lets do int to long

        int a = 26;
        long b = a;
        System.out.println(b);

        // but if go for opposite then we will get error. just see here

        long c = 26;
        int d = c;
        System.out.println(d);

    }

}
