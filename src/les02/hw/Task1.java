package les02.hw;

public class Task1 {
    public static byte number1 = 7;
    public static short number2 = 6;
    public static int number3 = 8;
    public static int maxNumber = 0;
    public static int midleNumber = 0;
    public static int minNumber = 0;

    public static void main(String[] args) {
        maxNumber = number1;
        if (number2 > maxNumber){
            maxNumber = number2;
        }
        if (number3 > maxNumber){
            maxNumber = number3;
        }

        if (maxNumber == number1){
            if (number2 > number3){
                midleNumber = number2;
                minNumber = number3;
            } else if (number3 > number2) {
                midleNumber = number3;
                minNumber = number2;
            } else {midleNumber = number2;
                minNumber = number2;

            }
        }
        if (maxNumber == number2) {
            if (number1 > number3) {
                midleNumber = number1;
                minNumber = number3;
            } else if (number3 > number1) {
                midleNumber = number3;
                minNumber = number1;
            } else {
                midleNumber = number1;
                minNumber = number1;

            }
        }
        if (maxNumber == number3) {
            if (number2 > number1) {
                midleNumber = number2;
                minNumber = number1;
            } else if (number1 > number2) {
                midleNumber = number1;
                minNumber = number2;
            } else {
                midleNumber = number2;
                minNumber = number2;

            }
        }
        System.out.println("maximum: " + maxNumber);
        System.out.println("midle: " + midleNumber);
        System.out.println("minimum: " + minNumber);
    }
}
