package les03.hw;

public class Main {
    public static void main(String[] args) {
        Cpu cpu1 = new Cpu(2000, 2, 500);
        Cpu cpu2 = new Cpu(2800, 4, 500);
        Cpu cpu3 = new Cpu(3600, 8, 1000);

        Hdd hdd1 = new Hdd("SSD", 512, "Sumsung");
        Hdd hdd2 = new Hdd("SSD", 1000, "WD");
        Hdd hdd3 = new Hdd("HDD", 1000, "SanDisk");

        Ram ram1 = new Ram(4, "DDR4");
        Ram ram2 = new Ram(8, "DDR4");
        Ram ram3 = new Ram(16, "DDR5");

        Computer comp1 = new Computer(cpu1, ram1, hdd1, "Laptop", 1650.00, "Lenovo", "L111");

        Tester tester = new Tester();
        tester.test(comp1);
    }
}
