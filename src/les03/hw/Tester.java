package les03.hw;

import java.util.Scanner;

public class Tester {
    boolean isCpuDamaged = false;
    boolean isHddDamaged = false;
    boolean isRamDamaged = false;

    public void test(Computer computer){
        int damageCount = 0;

        Scanner scanner = new Scanner(System.in);
       System.out.println("Test " + computer );
       if (computer.getCpu().isDamaged()){
           System.out.println("Cpu is damaged.");
           damageCount++;
           this.isCpuDamaged = true;
       } else System.out.println("Cpu is OK");

        if (computer.getHdd().isDamaged()){
            System.out.println("Hdd is damaged");
            this.isHddDamaged = true;
        } else System.out.println("Hdd is OK");

        if (computer.getRam().isDamaged()){
            System.out.println("Ram is damaged");
            damageCount++;
            this.isRamDamaged = true;
        } else System.out.println("Ram is OK");

        if (damageCount  >= 1 ){
            System.out.println("Set % of discount ");
            int discount = scanner.nextInt();
            computer.setDiscountPrise(computer.getCost() - computer.getCost()* discount/100);
        }

        if (damageCount  == 3 ){
            System.out.println("It can't be repaired");
            computer.setOk(false);
        }
        chooseFixerType(computer);
    }

    private void chooseFixerType (Computer computer){
        if (this.isCpuDamaged){
            fixCpu(computer);
        }if (this.isHddDamaged){
            fixHdd(computer);
        }if (this.isRamDamaged){
            fixRam(computer);
        } else System.out.println( computer.getBrand() + " " + computer.getType()+ " " + computer.getCost() + " can be added to storage");



    }

    public void fixCpu (Computer computer){
        if (computer.getCpu().isDamaged()){
            System.out.println("Cpu is damaged. Fixer starts repairing Cpu");
            computer.getCpu().setDamaged(false);
            System.out.println("Cpu has being repaired");
        } else System.out.println("Cpu is OK");
    }

    public void fixHdd (Computer computer){
        if (computer.getHdd().isDamaged()){
            System.out.println("Hdd is damaged. Fixer starts repairing Hdd");
            computer.getCpu().setDamaged(false);
            System.out.println("Hdd has being repaired");
        } else System.out.println("Hdd is OK");
    }

    public void fixRam (Computer computer){
        if (computer.getRam().isDamaged()){
            System.out.println("Ram is damaged. Fixer starts repairing Ram");
            computer.getCpu().setDamaged(false);
            System.out.println("Ram has being repaired");
        } else System.out.println("Ram is OK");
    }
}
