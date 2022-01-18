package les03.hw;

import java.util.Objects;
import java.util.Random;

public class Cpu {
    private int Frequency;
    private int coreCount;
    private int cahseSize;
    private String [] brands = {" AMD ", "Intel" };
    private String brand;
    private double cost;
    protected boolean isDamaged;

    public Cpu() {
        Random random = new Random();
        int randomNumber1 = random.nextInt(4);
        this.Frequency = 1000+ 500*randomNumber1;
        int randomNumber2 = random.nextInt(4);
        this.coreCount =  1 + 2*randomNumber2;
        int randomNumber3 = random.nextInt(3);
        this.cahseSize = 1 + randomNumber3;
        int randomNumber4 = random.nextInt(2);
        this.brand = this.brands[randomNumber4];
        this.cost = 300+ (randomNumber1 * randomNumber2 * randomNumber3) + 50*randomNumber4 ; // +50 if Intel
        int possibility = random.nextInt(101);
        if (possibility < 20){
            this.isDamaged = true;
        } else this.isDamaged = false;
    }

    public int getFrequency() {
        return Frequency;
    }

    public int getCoreCount() {
        return coreCount;
    }

    public int getCahseSize() {
        return cahseSize;
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
        Cpu cpu = (Cpu) o;
        return Frequency == cpu.Frequency && coreCount == cpu.coreCount && cahseSize == cpu.cahseSize && Double.compare(cpu.cost, cost) == 0 && isDamaged == cpu.isDamaged && Objects.equals(brand, cpu.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Frequency, coreCount, cahseSize, brand, cost, isDamaged);
    }

    @Override
    public String toString() {
        return " |Cpu: " + brand + " " +
                 Frequency + " ГГц" +
                ", core = " + coreCount +
                ", cahseSize = " + cahseSize + " Гб " + "| ";
    }
}