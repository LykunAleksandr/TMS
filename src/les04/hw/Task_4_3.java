package les04.hw;

import java.util.HashMap;
import java.util.Scanner;

public class Task_4_3 {

    private static String switchTens (Integer tens){
        String num1 = null;
        switch (tens){
            case 1: num1 = "X";
                break;
            case 2: num1 = "XX";
                break;
            case 3: num1 = "XXX";
                break;
            case 4: num1 = "XL";
                break;
            case 5: num1 = "L";
                break;
            case 6: num1 = "LX";
                break;
            case 7: num1 = "LXX";
                break;
            case 8: num1 = "LXXX";
                break;
            case 9: num1 = "XC";
                break;
        }
        return num1;
    }

    private static String switchUnits (Integer unit){
        String num2 = null;
        switch (unit){
            case 0: num2 = "";
                break;
            case 1: num2 = "I";
                break;
            case 2: num2 = "II";
                break;
            case 3: num2 = "III";
                break;
            case 4: num2 = "IV";
                break;
            case 5: num2 = "V";
                break;
            case 6: num2 = "VI";
                break;
            case 7: num2 = "VII";
                break;
            case 8: num2 = "VIII";
                break;
            case 9: num2 = "IX";
                break;
        }
        return num2;
    }

    private static String makeRomeNumbers(Integer number){
        String resultStringNumber = null;
        String stringNumber = String.valueOf(number);
        String [] numbersArray = stringNumber.split("");
        int tens = Integer.valueOf(numbersArray [0]);
        int units = Integer.valueOf(numbersArray [1]);
        resultStringNumber = switchTens(tens) + switchUnits(units);
        return resultStringNumber;
    }

    private static void fillRomeNumbersMap (HashMap map){
        for (int i = 1; i <=100 ; i++) {
            if (i<10){
                map.put(i, switchUnits(i));
            } else if (i == 100){
                map.put(i, "C");
            } else {
                map.put(i, makeRomeNumbers(i));
            }
        }
    }

    private static int readNumberFromConsol (){
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Введите число (для завершения введите 100)");
            number = scanner.nextInt();
        } while (number < 1 || number >100);
        return number;
    }

    public static void main(String[] args) {
        
        HashMap<Integer, String> numbers = new HashMap<>();
        fillRomeNumbersMap(numbers);

        int number;
        do {
            number = readNumberFromConsol();
            System.out.println(numbers.get(number));
        } while (number != 100);
    }
}
