package week5;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = null;
        try {
            file = new File("bestand.txt");
            if (file.createNewFile()) {
                System.out.println("Bestand aangemaakt, genaamd: " + file.getName());
            } else {
                System.out.println("Bestand bestaat al.");
            }
        } catch (IOException e) {
            System.out.println("Er ging wat mis...");
            e.printStackTrace();

        }

        try {
            Scanner filescanner = new Scanner(file);
            while(filescanner.hasNext()) {
                String tekstRegel = filescanner.nextLine();
                System.out.println(tekstRegel);
                Thread.sleep(100);
            }
        } catch (Exception e) {
            System.out.println("Er is iets misgegaan");
            e.printStackTrace();
        }
    }
}
