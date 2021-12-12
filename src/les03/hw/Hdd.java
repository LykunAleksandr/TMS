package les03.hw;

import java.util.Objects;
import java.util.Random;

public class Hdd {
    private String type; //(sdd\hdd)
    private int capacity;
    private String brand;
    protected boolean isDamaged;

    public Hdd(String type, int capacity, String brand) {
        this.type = type;
        this.capacity = capacity;
        this.brand = brand;
        Random random = new Random();
        int possibility = random.nextInt(100);
        if (possibility < 10){
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

    public void setDamaged(boolean damaged) {
        isDamaged = damaged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hdd hdd = (Hdd) o;
        return capacity == hdd.capacity &&
                isDamaged == hdd.isDamaged &&
                Objects.equals(type, hdd.type) &&
                Objects.equals(brand, hdd.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, capacity, brand, isDamaged);
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "type='" + type + '\'' +
                ", capacity=" + capacity +
                ", brand='" + brand + '\'' +
                ", isDamaged=" + isDamaged +
                '}';
    }
}
