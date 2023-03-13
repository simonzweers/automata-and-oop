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

        Menu menu = Menu.getInstance();
        menu.getFileName();
        menu.createArray();
        menu.printContent();
        System.out.println(menu.containsName("Jeff"));
        System.out.println(menu.containsName("Obabma"));
        menu.changeMode();

    }
}
