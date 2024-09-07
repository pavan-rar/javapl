# Java Programming Exercises

## 1. Integer Operations

### 1.1 Add all digits of an integer
**Problem:**  
Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

**Solution:**
```java
import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 1000: ");
        int number = scanner.nextInt();

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
```

### 1.2 Reverse the digits of an integer
**Problem:**  
Write a Java program that reads an integer and outputs the number with its digits reversed.

**Solution:**
```java
import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }

        System.out.println("Reversed number: " + reverse);
    }
}
```

### 1.3 Count the number of digits in an integer
**Problem:**  
Write a Java program that reads an integer and counts the number of digits in the integer.

**Solution:**
```java
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
    }
}
```

### 1.4 Find the largest digit in an integer
**Problem:**  
Write a Java program that reads an integer and finds the largest digit in the integer.

**Solution:**
```java
import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int largest = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit > largest) {
                largest = digit;
            }
            number /= 10;
        }

        System.out.println("Largest digit: " + largest);
    }
}
```

---

## 2. String Operations

### 2.1 Check if a string is a palindrome
**Problem:**  
Write a Java program that checks whether an input string is a palindrome.

**Solution:**
```java
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
```

### 2.2 Count vowels and consonants in a string
**Problem:**  
Write a Java program that reads a string and counts the number of vowels and consonants.

**Solution:**
```java
import java.util.Scanner;

public class VowelsConsonantsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
```

### 2.3 Find the longest word in a sentence
**Problem:**  
Write a Java program that reads a sentence and finds the longest word in it.

**Solution:**
```java
import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
    }
}
```

### 2.4 Check if two strings are anagrams
**Problem:**  
Write a Java program that checks whether two input strings are anagrams of each other.

**Solution:**
```java
import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] arr2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
```

### 2.5 Count the number of words in a string
**Problem:**  
Write a Java program that reads a string and counts the number of words.

**Solution:**
```java
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String[] words = str.trim().split("\\s+");
        System.out.println("Number of words: " + words.length);
    }
}
```

### 2.6 Remove duplicate characters from a string
**Problem:**  
Write a Java program that reads a string and removes all duplicate characters, leaving only the first occurrence.

**Solution:**
```java
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String result = "";
        for (char ch : str.toCharArray()) {
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println("String after removing duplicates: " + result);
    }
}
```

---

## 3. Class and Object Examples

### 3.1 Student Class
**Problem:**  
Write a Java program to create a class `Student` with data members `name`, `city`, and `age`. Implement methods `addData` and `printData` to input and display the data.

**Solution:**
```java
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
```

### 3.2 Laptop Class
**Problem:**  
Write a Java program to create a class `Laptop` with data members `brand`, `model`, and `price`. Implement methods `addData` and `printData` to input and display the data.

**Solution:**
```java
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
        laptop.addData("Dell", "Inspiron

", 999.99);
        laptop.printData();
    }
}
```

### 3.3 BankAccount Class
**Problem:**  
Write a Java program to create a class `BankAccount` with data members `accountNumber`, `accountHolderName`, and `balance`. Implement methods `addData` and `printData` to input and display the data.

**Solution:**
```java
import java.util.Scanner;

class BankAccount {
    String accountNumber, accountHolderName;
    double balance;

    void addData(String accNum, String accHolder, double bal) {
        accountNumber = accNum;
        accountHolderName = accHolder;
        balance = bal;
    }

    void printData() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.addData("12345678", "John Doe", 5000.00);
        account.printData();
    }
}
```

---

