/**
 * Huisdiermanagement programma
 * @author Simon Zweers
 * @date 07-03-2023
 */

package week5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Filenaam van user verkrijgen
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("Input the filename of the file you want to create/edit: ");
        String fileName = userInputScanner.next();

        // File object aanmaken
        File animalsFile = null;
        try {
            animalsFile = new File("src\\week5\\" + fileName);

            if (animalsFile.createNewFile()) {
                System.out.println("New file created: "+ animalsFile.getName());
            } else {
                System.out.println(animalsFile.getName() + " bestaat al");
            }
        } catch (IOException e) {
            System.out.println("Het creëren van een file is misgegaan:");
            e.printStackTrace();
        }

        // Print inhoud van de file voor
        try {
            Scanner fileScanner = new Scanner(animalsFile);
            System.out.println("Huidige inhoud van de file:");
            ArrayList<Animal> animalObjectArray = new ArrayList<>();
            while (fileScanner.hasNext()) {
                String animalLine = fileScanner.nextLine();
                String[] animalData = animalLine.split(" - "); // Split name and species into String array

                // Dier toevoegen aan Array
                animalObjectArray.add(new Animal(animalData[1], animalData[0]));

            }
            for (Animal animal : animalObjectArray) {
                System.out.printf("%-12s | %s\n", animal.getSpecies(), animal.getName());
            }
        } catch (IOException e) {
            System.out.println("Er ging iets mis bij het lezen van de file");
            e.printStackTrace();
        }

        // TODO: Add statemachine for editing / adding
        // TODO: Add stateinterface
    }
}
