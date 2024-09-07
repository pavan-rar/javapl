import java.util.Scanner;

class Laptop {
    String brand, model;
    double price;

    void addData(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

    void printData() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}

public class LaptopDemo {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.addData("Dell", "Inspiron", 999.99);
        laptop.printData();
    }
}
