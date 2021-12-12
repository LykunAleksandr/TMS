package les03.hw;

import java.util.Objects;
import java.util.Random;

public class Cpu {
    private int Frequency;
    private int coreCount;
    private int cahseSize;
    protected boolean isDamaged;

    public Cpu(int frequency, int coreCount, int cahseSize) {
        Frequency = frequency;
        this.coreCount = coreCount;
        this.cahseSize = cahseSize;
        Random random = new Random();
        int possibility = random.nextInt(100);
        if (possibility < 10){
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

    public void setDamaged(boolean damaged) {
        isDamaged = damaged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cpu cpu = (Cpu) o;
        return Frequency == cpu.Frequency &&
                coreCount == cpu.coreCount &&
                cahseSize == cpu.cahseSize &&
                isDamaged == cpu.isDamaged;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Frequency, coreCount, cahseSize, isDamaged);
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "Frequency=" + Frequency +
                ", coreCount=" + coreCount +
                ", cahseSize=" + cahseSize +
                ", isDamaged=" + isDamaged +
                '}';
    }
}
