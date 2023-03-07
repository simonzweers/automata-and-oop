package week2;

/**
 * Tijger klasse representeerd een huisdier met een naam en leeftijd
 * Tijger is een subklasse van {@link #Kat Kat}
 */
public class Tijger extends Kat{

    /**
     * @param nieuweNaam naam voor de Tijger
     * @param leeftijd leeftijd van de Tijger
     */
    Tijger(String nieuweNaam, int leeftijd) {
        super(nieuweNaam, leeftijd);
    }

    @Override
    void maakGeluid() {
        System.out.println("ROAR!");
    }
}
