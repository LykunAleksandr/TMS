package les03.hw;

import java.util.Objects;
import java.util.Random;

public class Computer {
    private Cpu cpu;
    private Ram ram;
    private Hdd hdd;
    private String [] types = {"Desktop", "Laptop" };
    private String type;
    private double cost;
    private String [] brands = {"ASUS", "HP  ", "Aser" };
    private String brand;
    private boolean isOk;
    private double discountPrise = 0.0;
//    private String model;
//    private int maxWokringCount;

    public Computer() {
        this.cpu = new Cpu();
        this.ram = new Ram();
        this.hdd = new Hdd();
        Random random = new Random();
        int randomNumber1 = random.nextInt(2);
        this.type = this.types [randomNumber1];
        this.cost = 700 + cpu.getCost() + hdd.getCost() + ram.getCost() + 300 * randomNumber1; // +300 if laptop
        int randomNumber2 = random.nextInt(3);
        this.brand = this.brands[randomNumber2];
        this.isOk = true;


    }

    public Cpu getCpu() {
        return cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }

    public String getBrand() {
        return brand;
    }

    public double getDiscountPrise() {
        return discountPrise;
    }

    public void setDiscountPrise(double discountPrise) {
        this.discountPrise = discountPrise;
    }

    public boolean isOk() {
        return isOk;
    }

    public void setOk(boolean ok) {
        isOk = ok;
    }

    @Override
    public String toString() {
        String str = "";
        if (getDiscountPrise() > 0){
            str = " DiscountPrise = " + discountPrise + "р.";
        }
        return " " + brand  + " " + type + " \t" + cost + "р." + "\t"  + str + "\t" +
                  cpu + ram +  hdd;


    }
}
