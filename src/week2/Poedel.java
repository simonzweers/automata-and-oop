package week2;

/**
 * Hond klasse representeerd een huisdier met een naam en leeftijd
 * Hond is een subklasse van {@link #Hond Hond}
 */
public class Poedel extends Hond{
    /**
     * Maakt een nieuw Poedel object aan
     * @param nieuweNaam naam voor de poedel
     * @param leeftijd leeftijd voor de poedel
     */
    Poedel(String nieuweNaam, int leeftijd) {
        super(nieuweNaam, leeftijd);
    }

    @Override
    void maakGeluid() {
        System.out.println("worf");
    }
}
