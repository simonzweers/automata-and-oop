package week1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
                "simon@hva.nl@hva.nl"
        };

        Pattern compiledPattern = Pattern.compile(regexPattern);
        Matcher patternMatcher;
        boolean matches;
        for (String emailadress : emailadresses) {
            patternMatcher = compiledPattern.matcher(emailadress);
            matches = patternMatcher.matches();
            System.out.printf("%-25s is een geldig emailadres: %b\n", emailadress, matches);
        }
    }
}
