package week1;

public class MailChecker {
    public static void main(String[] args) {
        // Opgave 2 van week 1: Regex voor controle HvA email adres

        // Regex patroon
        String regexPattern = "([a-z]|\\.|_|-)+@[Hh][Vv][Aa]\\.[Nn][Ll]";

        String[] emailadresses = {
                "piet@HvA.NL",
                "piet_de.winter@hva.nl",
                "simon.zweers@hva.nl",
                "simon.zweers.@hva.nl",
                "piet@@hvvva.nl",
                "jan@hvaa.nl.nl",
                "henk@@hva.nl",
                "geert@hva.com",
        };
        for (String emailadress : emailadresses) {
            System.out.printf("%-25s is een geldig emailadres: %b\n", emailadress, emailadress.matches(regexPattern));
        }
    }
}
