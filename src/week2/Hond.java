package week2;

/**
 * Hond klasse representeerd een huisdier met een naam en leeftijd
 * Hond is een subklasse van {@link #Huisdier Huisdier}
 */
public class Hond extends Huisdier{

    /**
     * Creëert een nieuw Hond object
     * @param nieuweNaam naam voor de hond
     * @param leeftijd leeftijd van de hond
     */
    Hond(String nieuweNaam, int leeftijd) {
        super(nieuweNaam, leeftijd);
    }

    @Override
    void maakGeluid() {
        System.out.println("WOEF!");
    }
}
