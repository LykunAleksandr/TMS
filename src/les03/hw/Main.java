package les03.hw;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Computer [] storage = new Computer[5];
        for (int i = 0; i < storage.length; i++) {
            Computer computer = new Computer();

            Tester tester = new Tester();
            tester.test(computer);

            if (computer.isOk()) {

                System.out.println(computer +"\n" + "... added to storage");
                storage[i] = computer;
                System.out.println();
            }
        }

    }
}
