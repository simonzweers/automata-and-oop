package week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * Menu class to create an interactive Tui menu.
 *
 * @author Simon Zweers
 * @since 09-03-2023
 */
public class Menu {
    // Menu instance to apply singleton pattern
    private static Menu instance;
    private static Scanner userInputScanner = new Scanner(System.in);

    public File animalsFile;
    public ArrayList<Animal> animalObjectArray = new ArrayList<>();

    private Menu() {
        getFileName();
        createArray();
        printContent();
        changeMode();
    }

    public static Menu getInstance() {
        if (Menu.instance == null) {
            Menu.instance = new Menu();
        }
        return Menu.instance;
    }

    /**
     * Method to register obtain a file name of the file to edit
     */
    public void getFileName() {
        // Get filename from user
        userInputScanner = new Scanner(System.in);
        System.out.print("Input the filename of the file you want to create/edit: ");
        String fileName = userInputScanner.next();

        // Creating file object if it doesn't exisst
        animalsFile = null;
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
    }

    /**
     * Reads contents from file and creates objects from it to punt in an arrayList
     */
    public void createArray() {
        // Print inhoud van de file
        try {
            Scanner fileScanner = new Scanner(this.animalsFile);
            System.out.println("Huidige inhoud van de file:");
            while (fileScanner.hasNext()) {
                String animalLine = fileScanner.nextLine();
                String[] animalData = animalLine.split(" - "); // Split name and species into String array

                // Dier toevoegen aan Array
                animalObjectArray.add(new Animal(animalData[1], animalData[0]));
            }
            this.printContent();

        } catch (IOException e) {
            System.out.println("Er ging iets mis bij het lezen van de file");
            e.printStackTrace();
        }
    }

    /**
     * Method to check an array of animals if it contains a certain name
     * @param animalName Name that is checked
     * @return
     * true - if the list of animals contains the inputted name,
     * false - if the list of animals doesn't contain the inputted name
     */
    public boolean containsName(String animalName) {
        for (int i = 0; i < animalObjectArray.size(); i++) {
            if (Objects.equals(animalObjectArray.get(i).getName(), animalName)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Update's the text file with the current contents of the animals array
     */
    public void updateAnimalsFile() {
        try {
            PrintWriter output = new PrintWriter(animalsFile.getPath());
            output.print("");
            for (int i = 0; i < animalObjectArray.size(); i++) {
                output.println(animalObjectArray.get(i).getSpecies() + " - " + animalObjectArray.get(i).getName());
            }
            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("Er ging wat mis");
        }
    }

    /**
     * Method to print all objects in an arraylist to console
     */
    public void printContent() {
        for (int i = 0; i < animalObjectArray.size(); i++) {
            System.out.printf("%3d. %-12s | %s\n",
                    i + 1,
                    animalObjectArray.get(i).getSpecies(),
                    animalObjectArray.get(i).getName());
        }
        System.out.println();
    }

    /**
     * Asks for name and adds animal to animals array
     */
    private void addAnimal() {
        System.out.print("Please enter the new animals name: ");
        String name = userInputScanner.next();
        System.out.print("Please enter the new animals species: ");
        String species = userInputScanner.next();
        animalObjectArray.add(new Animal(name, species));
        updateAnimalsFile();
    }

    /**
     * Changes the name of an animal in the animal array
     */
    private void changeAnimalName() {
        System.out.print("Please enter the number of the animal you want to change: ");
        int animalindex = userInputScanner.nextInt() - 1;
        System.out.print("Please enter the new name for the animal: ");
        String newName = userInputScanner.next(); // TODO: Fix scanner input to not ignore whitespaces
        animalObjectArray.get(animalindex).setName(newName);
        updateAnimalsFile();
    }

    /**
     * Method to start different actions from a menu
     */
    void changeMode() {
        System.out.print(
                "Choose the action you want to perform:\n" +
                        "1. Show contents of the system\n" +
                        "2. Add an animal\n" +
                        "3. Change the data of an animal\n" +
                        "4. Quit Program\n" +
                        "Action: "
        );
        int newMode = userInputScanner.nextInt();

        switch (newMode) {
            case 1:
                printContent();
                changeMode();
                break;
            case 2:
                addAnimal();
                changeMode();
                break;
            case 3:
                changeAnimalName();
                changeMode();
                break;
            case 4:
                System.out.println("Quitting program");
                break;
            default:
                System.out.println("Bro u cant do that...");
                changeMode();
                break;
        }
    }
}
