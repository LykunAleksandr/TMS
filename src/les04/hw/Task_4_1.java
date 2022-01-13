package les04.hw;

import java.util.Scanner;

public class Task_4_1 {
    /** Напишите метод, который принимает возраст человека и возвращает целое число, которое обозначает номер группы
     * в которую его надо определить, если подходящей группы нет - верните ‘-1’.
     * 1 группа - от 7 до 13 лет;
     * 2 группа - от 14 до 17 лет;
     * 3 группа - от 18 до 65 лет.
     */

    private static int readAgeFromConsol (){
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.println("Введите возраст ");
        age = scanner.nextInt();
        return age;
    }

    private static int chooseGroup() {
        int age = readAgeFromConsol();
        if (age >= 7 && age <= 13) {
            return 1;
        } else if (age >= 14 && age <= 17) {
            return 2;
        } else if (age >= 18 && age <= 65) {
            return 3;
        } else return -1;
    }

    public static void main(String[] args) {
        int group;
        do {
            group = chooseGroup();
            System.out.println(group);
        } while (group != -1);
    }
}
