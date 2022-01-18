package les05.hw;

import les04.hw.Task_4_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Calculator {

    static int intNumber1 = 0;
    static int intNumber2 = 0;
    static String romeNumber1 = null;
    static String romeNumber2 = null;
    static HashMap<Integer, String> numbers = new HashMap<>();

    static String [] readAddingExpression (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение");
        String str = scanner.nextLine();
        String[] stringArray = str.split("\\+");
        return stringArray;
    }
    static void findIntOrRomeNumber (String []stringArray){
        try {
            intNumber1 = Integer.valueOf(stringArray [0]);
        }catch (Exception e){
            romeNumber1 = stringArray [0];
//            intNumber1 = numbers.getOrDefault (69,null);
        }
        try {
            intNumber2 = Integer.valueOf(stringArray [1]);
        }catch (Exception e){
            romeNumber2 = stringArray [1];
        }
    }

    static int getKeyInMapByValue (String romeNumber){
        int key = 0;
        for (Map.Entry entry: numbers.entrySet()) {
            if (entry.getValue().equals(romeNumber))
                key =  (int) entry.getKey();
        }
        return key;
    }

    static int [] getKeyInMapByValue (String romeNumber1, String romeNumber2){
        int [] keys = {0, 0};
        for (Map.Entry entry: numbers.entrySet()) {
            if (entry.getValue().equals(romeNumber1)) {
                keys[0] = (int) entry.getKey();
            }
            if (entry.getValue().equals(romeNumber2)) {
                keys[1] = (int) entry.getKey();
            }
        }
        return keys;
    }

    static String  culculate (){
        String result = null;
        int key = 0;
        if (intNumber1 != 0 && intNumber2 != 0 ){
            result =  Integer.toString(intNumber1 + intNumber2);
            System.out.println(intNumber1 + " + " + intNumber2 + " = " + result);

        } else if (romeNumber1 != null && intNumber2 != 0){
            key = getKeyInMapByValue(romeNumber1);
            result =  numbers.get(key+intNumber2);
            System.out.println(romeNumber1 + " + " + intNumber2 + " = " + result);

        } else if (intNumber1 != 0 && romeNumber2 != null){
            key = getKeyInMapByValue(romeNumber2);
            result =  numbers.get(key+intNumber1);
            System.out.println(intNumber1 + " + " + romeNumber2 + " = " + result);

        } else {
            int [] keys = getKeyInMapByValue (romeNumber1, romeNumber2);
            result =  numbers.get(keys[0] + keys[1]);
            System.out.println(romeNumber1 + " + " + romeNumber2 + " = " + result);
        }
        return result;
    }

    public static void main(String[] args) {

        Task_4_3.fillRomeNumbersMap(numbers);

        findIntOrRomeNumber(readAddingExpression());
        culculate();
    }
}

