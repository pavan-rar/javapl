import java.util.Scanner;

class Student {
    String name, city;
    int age;

    void addData(String n, String c, int a) {
        name = n;
        city = c;
        age = a;
    }

    void printData() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.addData("Alice", "New York", 21);
        s2.addData("Bob", "Los Angeles", 22);

        s1.printData();
        s2.printData();
    }
}
