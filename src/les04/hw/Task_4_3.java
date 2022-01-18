package les04.hw;

import java.util.HashMap;
import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class Task_4_3 {

    public static String switchUnits (Integer unit){
        String num1 = null;
        switch (unit){
            case 0: num1 = "";
                break;
            case 1: num1 = "I";
                break;
            case 2: num1 = "II";
                break;
            case 3: num1 = "III";
                break;
            case 4: num1 = "IV";
                break;
            case 5: num1 = "V";
                break;
            case 6: num1 = "VI";
                break;
            case 7: num1 = "VII";
                break;
            case 8: num1 = "VIII";
                break;
            case 9: num1 = "IX";
                break;
        }
        return num1;
    }

    public static String switchTens (Integer tens){
        String num2 = null;
        switch (tens){
            case 0: num2 = "";
                break;
            case 1: num2 = "X";
                break;
            case 2: num2 = "XX";
                break;
            case 3: num2 = "XXX";
                break;
            case 4: num2 = "XL";
                break;
            case 5: num2 = "L";
                break;
            case 6: num2 = "LX";
                break;
            case 7: num2 = "LXX";
                break;
            case 8: num2 = "LXXX";
                break;
            case 9: num2 = "XC";
                break;
        }
        return num2;
    }

    public static String switcHundrets (Integer hundreds){
        String num3 = null;
        switch (hundreds){
            case 0: num3 = "";
                break;
            case 1: num3 = "C";
                break;
            case 2: num3 = "CC";
                break;
            case 3: num3 = "CCC";
                break;
            case 4: num3 = "CD";
                break;
            case 5: num3 = "D";
                break;
            case 6: num3 = "DC";
                break;
            case 7: num3 = "DCC";
                break;
            case 8: num3 = "DCCC";
                break;
            case 9: num3 = "CM";
                break;
        }
        return num3;
    }

    public static String makeRomeNumbers(Integer number){
        String resultStringNumber = null;
        int hundreds = 0;
        int tens = 0;
        int units = 0;
        String stringNumber = String.valueOf(number);
        String [] numbersArray = stringNumber.split("");
        if (number >= 1000){
            return "M";
        }
        if (stringNumber.length() == 1){
            resultStringNumber =  switchUnits(number);
        } else if (stringNumber.length() == 2){
            tens = valueOf(numbersArray [0]);
            units = valueOf(numbersArray [1]);
            resultStringNumber = switchTens(tens) + switchUnits(units);
        } else if (stringNumber.length() == 3){
            hundreds = valueOf(numbersArray [0]);
            tens = valueOf(numbersArray [1]);
            units = valueOf(numbersArray [2]);
            resultStringNumber = switcHundrets(hundreds) + switchTens(tens) + switchUnits(units);
        }
        return resultStringNumber;
    }

//    public static void fillRomeNumbersMap (HashMap map){
//        for (int i = 1; i <=100 ; i++) {
//            if (i<10){
//                map.put(i, switchUnits(i));
//            } else if (i == 100){
//                map.put(i, "C");
//            } else {
//                map.put(i, makeRomeNumbers(i));
//            }
//        }
//    }

    public static void fillRomeNumbersMap (HashMap map){
        for (int i = 1; i <=1000 ; i++) {
            map.put(i, makeRomeNumbers(i));
            if (i % 100 == 0){
            }
        }
    }

    private static int readNumberFromConsole(){
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Введите число от 1 до 10");
            number = scanner.nextInt();
        } while (number < 1 || number >1001);

        return number;
    }

    public static void main(String[] args) {

        HashMap<Integer, String> numbers = new HashMap<>();
        fillRomeNumbersMap(numbers);

        int number;
        do {
            number = readNumberFromConsole();
            System.out.println(numbers.get(number));
            System.out.print("Для завершения введите 1001  ");
        } while (number != 1001);


    }
}
