package les02.hw;

public class Task2 {
    public static byte byteNumber1 = 120;
    public static short shortNumber2 = 200;
    public static int intNumber3 = 5000;
    public static long longNumber4 = 10000L;
    public static float floatNumber5 = 100.0f;
    public static byte byteNumber6;
    public static int intNumber7;
    public static long longNumber8;
    public static double doubleNumber9;
    public static String str;

    public static void main(String[] args) {
        System.out.println("Исходные данные");
        System.out.println("byteNumber1 = " + byteNumber1);
        System.out.println("shortNumber2 = " + shortNumber2);
        System.out.println("intNumber3 = " + intNumber3);
        System.out.println("longNumber4 = " + longNumber4);
        System.out.println("floatNumber5 = " + floatNumber5);
        System.out.println();

        System.out.println("intNumber3 += shortNumber2 = " + (intNumber3 +=shortNumber2));

        byteNumber6 = (byte) (byteNumber1 + shortNumber2);
        System.out.println("byteNumber6 = byteNumber1 + shortNumber2 = " + byteNumber1 + " + " + shortNumber2 + " = " + byteNumber6 );

        intNumber7 = intNumber3 / shortNumber2;
        System.out.println("intNumber7 = intNumber3 * shortNumber2 = " + intNumber3 + " / " + shortNumber2 + " = " + intNumber7 );

        longNumber8 = longNumber4 * shortNumber2;
        System.out.println("longNumber8 = longNumber4 / shortNumber2 = " + longNumber4 + " * " + shortNumber2 + " = " + longNumber8 );

        doubleNumber9 = floatNumber5 + intNumber3;
        System.out.println("doubleNumber9 = floatNumber5 + intNumber3 = " + floatNumber5 + " + " + intNumber3 + " = " + doubleNumber9 );

        str  = String.valueOf(intNumber3);
        System.out.println("str  = String.valueOf(intNumber3) = " + str );



    }

}
