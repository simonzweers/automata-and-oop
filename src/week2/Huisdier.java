package week2;

import java.util.Scanner;

public class Huisdier {
    Scanner scanner = new Scanner(System.in);
    String naam;

    Huisdier() {
        System.out.println("Whats this pets name?");
        naam = scanner.next();
    }

    void maakGeluid() {}

    void watIsMijnNaam() {
        System.out.printf("My name is: %s", naam);
    }
}
