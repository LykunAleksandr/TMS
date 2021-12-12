package les03.hw;

public class Fixer {

    public void fixCpu (Computer computer){
        if (computer.getCpu().isDamaged()){
            System.out.println("Cpu is damaged");
            computer.getCpu().setDamaged(false);
            System.out.println("Cpu has repaired");
        } else System.out.println("Cpu is OK");
    }

    public void fixHdd (Computer computer){
        if (computer.getHdd().isDamaged()){
            System.out.println("Hdd is damaged");
            computer.getCpu().setDamaged(false);
            System.out.println("Hdd has repaired");
        } else System.out.println("Hdd is OK");
    }

    public void fixRam (Computer computer){
        if (computer.getCpu().isDamaged()){
            System.out.println("Ram is damaged");
            computer.getCpu().setDamaged(false);
            System.out.println("Ram has repaired");
        } else System.out.println("Ram is OK");
    }
}
