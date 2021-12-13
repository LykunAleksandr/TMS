package les02.hw;

import java.util.Scanner;

// Ввести с клавиатруы два числа (а и b) и вывести прямоугольник из букв 'О' размером a x b
public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число ");
        byte a = scanner.nextByte();
        System.out.println("Введите второе число ");
        byte b = scanner.nextByte();

        System.out.println();
        for (int i = 0; i < a ; i++) {
            for (int j = 0; j <b ; j++) {
                System.out.print('O');
            }
            System.out.print("\n");
        }

    }
}
