# Week 1

Simon Zweers, IT102

## Opdracht 1

Een van de opgaven was om een automaat te maken in FLACI voor de FSAexec klasse ([hier een link haar de code](FSAexec.java)):

![fsaexec-flaci](../../images/fsaexec-flaci.png)

Om te testen heb ik een aantal extra inputs aan de automaat gegeven:  
`abcabacaaba`  
`ababacaaba`  
`abcabaaaba`  
`aabcaabcab`  
`abcabacaabac`  
`bcaabbabac`  
`baabababaabcaabaabac`  

Deze inputs zijn allemaal in FLACI gesimuleerd om te checken:  
![](../../images/fsaexec-flaci-input-words.png)

```plantuml
'https://plantuml.com/state-diagram

[*] -> State0
State0 --> State1 : b
State0 --> State0 : a,c
State1 --> State1 : b,c
State1 --> State2 : a
State2 --> State0 : a
State2 --> State1 : b
State2 --> State3 : c
State3 --> State0 : a
State3 --> State1 : b
State3 --> State3 : c
```

Ik heb het programma zo aangepast dat na het uitvoeren van de input in de output wordt weergegeven of de eindstaat bereikt is.
Aan het begin wordt de input string weergegeven.
Ook wordt per stap aangegeven welke transitie gebeurt, en welke staat het programma naartoe gaat.
Twee voorbeelden:  
```text
Input string: abcabacaaba
State: 0 | transition: a (0) | going to: 0
State: 0 | transition: b (1) | going to: 1
State: 1 | transition: c (2) | going to: 1
State: 1 | transition: a (0) | going to: 2
State: 2 | transition: b (1) | going to: 1
State: 1 | transition: a (0) | going to: 2
State: 2 | transition: c (2) | going to: 3
State: 3 | transition: a (0) | going to: 0
State: 0 | transition: a (0) | going to: 0
State: 0 | transition: b (1) | going to: 1
State: 1 | transition: a (0) | going to: 2
Final state reached: false
```
```text
Input string: bcaabbabac
State: 0 | transition: b (1) | going to: 1
State: 1 | transition: c (2) | going to: 1
State: 1 | transition: a (0) | going to: 2
State: 2 | transition: a (0) | going to: 0
State: 0 | transition: b (1) | going to: 1
State: 1 | transition: b (1) | going to: 1
State: 1 | transition: a (0) | going to: 2
State: 2 | transition: b (1) | going to: 1
State: 1 | transition: a (0) | going to: 2
State: 2 | transition: c (2) | going to: 3
Final state reached: true
```

## Opdracht 2

Opdracht 2 ging over regex.
De opdracht was om een reguliere expressie te maken die de geldigheid van een HvA e-mail adres checkt.
Een aantal vereisten:

- Dubbele apenstaartjes (`piet@@hva.nl`) moeten niet toegestaan worden
- karakters . _ - moeten toegelaten worden voor de apenstaart
- Het domein moet niet hoofdlettergevoelig zijn (dus patronen zoals `HvA.NL` en `hva.nl` moeten toegestaan worden)

Ik ben op de volgende expressie gekomen:

```regexp
([a-z]|\.|_|-)+@[Hh][Vv][Aa]\.[Nn][Ll]
```

Ik heb deze expressie met de volgende e-mail adressen getest:

`piet@HvA.NL` (goed)  
`piet_de.winter@hva.nl` (goed)  
`simon.zweers@hva.nl` (goed)  
`simon.zweers.@hva.nl` (goed)  
`piet@@hvvva.nl` (fout)  
`jan@hvaa.nl` (fout)  
`henk@@hva.nl` (fout)  
`geert@hva.com` (fout)

In het [Java programma](MailChecker.java) heb ik een variabele `regexPattern` aangemaakt waarin de expressie staat.
Omdat het karakter "\" in veel talen een "escape character" is, moet je een extra "\" toevoegen aan de Java versie om de punt mee te kunnen nemen in de exoressie.  
De expressie komt er in java als volgt uit te zien:

```java
public class MailChecker {
    public static void main(String[] args) {
        String regexPattern = "([a-z]|\\.|_|-)+@[Hh][Vv][Aa]\\.[Nn][Ll]";
    }
}
```

Ik heb het programma zo uitgebreid dat alle e-mail adressen adressen uit een array gecheckt worden.
Het programma ziet er nu zo uit:

```java
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
```