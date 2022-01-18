package les03.hw;

import java.util.Objects;
import java.util.Random;

public class Hdd {
    private String [] types = {"HDD", "SDD"};
    private String type;
    private int capacity;
    private String [] brands = {"SUMSUNG", "WD", "SanDisk" };
    private String brand;
    private double cost;
    protected boolean isDamaged;

    public Hdd() {
        Random random = new Random();
        int randomNumber1 = random.nextInt(2);
        this.type = this.types [randomNumber1];
        int randomNumber2 = random.nextInt(5);
        this.capacity = 500+ 500 * randomNumber2;
        int randomNumber3 = random.nextInt(3);
        this.brand = this.brands [randomNumber3];
        this.cost = 200 + 50 * randomNumber1 + 50 * randomNumber2 + 10*randomNumber3;
        int possibility = random.nextInt(100);
        if (possibility < 20){
            this.isDamaged = true;
        } else this.isDamaged = false;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isDamaged() {
        return isDamaged;
    }

    public double getCost() {
        return cost;
    }

    public void setDamaged(boolean damaged) {
        isDamaged = damaged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hdd hdd = (Hdd) o;
        return capacity == hdd.capacity && Double.compare(hdd.cost, cost) == 0 && isDamaged == hdd.isDamaged && Objects.equals(type, hdd.type) && Objects.equals(brand, hdd.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, capacity, brand, cost, isDamaged);
    }

    @Override
    public String toString() {
        return "" + type + " " + capacity + " Гб " +
                '\'' + brand + '\'' + '|';
    }
}