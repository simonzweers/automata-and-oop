package week2;

public class Huisdier {
    private final String naam;
    public int leeftijd;

    /**
     * Naam voor het huisdier
     * @param nieuweNaam naam voor het huidier
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
