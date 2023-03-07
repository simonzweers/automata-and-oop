package week2;

/**
 * Huisdier superklasse representerend voor een bepaald huisdier.
 */
public class Huisdier {
    private final String naam;
    public int leeftijd;

    /**
     * Maakt een nieuw Huisdier object aan
     * @param nieuweNaam naam voor het huisdier
     * @param leeftijd leeftijd van het dier
     */
    Huisdier(String nieuweNaam, int leeftijd) {
        this.naam = nieuweNaam;
        this.leeftijd = leeftijd;
    }

    /**
     * Geeft het geluid wat het dier maakt
     */
    void maakGeluid() {
        System.out.println("Ik maak geen geluid");
    }

    /**
     * Geeft de naam van het huisdier
     */
    void wieBenIk() {
        System.out.printf("Mijn naam is: %s en ik ben %d jaar oud\n", naam, leeftijd);
    }

    @Override
    public String toString() {
        return naam;
    }
}
