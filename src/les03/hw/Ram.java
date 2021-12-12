package les03.hw;

import java.util.Objects;
import java.util.Random;

public class Ram {
    private int capacity;
    private String type;
    protected boolean isDamaged;

    public Ram(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
        Random random = new Random();
        int possibility = random.nextInt(100);
        if (possibility < 10){
            this.isDamaged = true;
        } else this.isDamaged = false;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
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
        Ram ram = (Ram) o;
        return capacity == ram.capacity &&
                isDamaged == ram.isDamaged &&
                Objects.equals(type, ram.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, type, isDamaged);
    }

    @Override
    public String toString() {
        return "Ram{" +
                "capacity=" + capacity +
                ", type='" + type + '\'' +
                ", isDamaged=" + isDamaged +
                '}';
    }
}
