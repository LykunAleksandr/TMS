package les03.hw;

import java.util.Objects;
import java.util.Random;

public class Ram {
    private int capusity;
    private String [] types = {"DDR3", "DDR4", "DDR5"};
    private String type;
    private double cost;
    private boolean isDamaged;

    public Ram() {
        Random random = new Random();
        int randomNumber1 = random.nextInt(4);
        this.capusity = 8 + 8* randomNumber1;
        int randomNumber2 = random.nextInt(3);
        this.type = this.types [randomNumber2];
        this.cost = 100 + 50 * randomNumber1 + 5 * randomNumber2;
        int possibility = random.nextInt(100);
        if (possibility < 20){
            this.isDamaged = true;
        } else this.isDamaged = false;
    }

    public int getCapusity() {
        return capusity;
    }

    public String getType() {
        return type;
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
        Ram ram = (Ram) o;
        return capusity == ram.capusity &&
                Double.compare(ram.cost, cost) == 0 &&
                isDamaged == ram.isDamaged &&
                Objects.equals(type, ram.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capusity, type, cost, isDamaged);
    }

    @Override
    public String toString() {
        return "Ram: " + capusity + " Гб " +  type + " | ";
    }
}