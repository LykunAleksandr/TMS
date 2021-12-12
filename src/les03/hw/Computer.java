package les03.hw;

import java.util.Objects;

public class Computer {
    private Cpu cpu;
    private Ram ram;
    private Hdd hdd;
    private String type; // (laptop\desktop)
    private double cost;
    private String brand;
    private String model;
    private int maxWokringCount;

    public Computer(Cpu cpu, Ram ram, Hdd hdd, String type, double cost, String brand, String model) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.type = type;
        this.cost = cost;
        this.brand = brand;
        this.model = model;
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

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Double.compare(computer.cost, cost) == 0 &&
                Objects.equals(cpu, computer.cpu) &&
                Objects.equals(ram, computer.ram) &&
                Objects.equals(hdd, computer.hdd) &&
                Objects.equals(type, computer.type) &&
                Objects.equals(brand, computer.brand) &&
                Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, hdd, type, cost, brand, model);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", type='" + type + '\'' +
                ", cost=" + cost +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
