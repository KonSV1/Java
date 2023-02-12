package DZ.DZ_6;

public class Laptop {
    int id;
    String model;
    String cpu;
    int ram;
    int ssd;
    String os;
    String color;

    public Laptop(int id, String model, String cpu, int ram, int ssd, String os, String color) {
        this.id = id;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.os = os;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("id - %d, Model - %s, CPU - %s, RAM - %d, SSD - %d, OS - %s, Color - %s", id, model, cpu, ram, ssd, os, color);
    }
}