package week2;

public class Huisdier {
    private final String naam;

    /**
     * Naam voor het huisdier
     * @param nieuweNaam naam voor het huidier
     */
    Huisdier(String nieuweNaam) {
        this.naam = nieuweNaam;
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
    void watIsMijnNaam() {
        System.out.printf("Mijn naam is: %s\n", naam);
    }

    @Override
    public String toString() {
        return naam;
    }
}
