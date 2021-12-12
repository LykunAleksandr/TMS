package les03.hw;

public class Tester {

    public void test(Computer computer){
       System.out.println("Test " + computer.getBrand() + " model: " + computer.getModel()  );
       if (computer.getCpu().isDamaged()){
           System.out.println("Cpu is damaged");
       } else System.out.println("Cpu is OK");

        if (computer.getHdd().isDamaged()){
            System.out.println("Hdd is damaged");
        } else System.out.println("Hdd is OK");

        if (computer.getHdd().isDamaged()){
            System.out.println("Hdd is damaged");
        } else System.out.println("Hdd is OK");


    }
}
