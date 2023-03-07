package week2;

/**
 * Kat klasse representeerd een huisdier met een naam en leeftijd
 * Kat is een subklasse van {@link #Huisdier Huisdier}
 */
public class Kat extends Huisdier{
    /**
     * Maakt een nieuw Kat object aan
     * @param nieuweNaam naam voor de kat
     * @param leeftijd leeftijd voor de kat
     */
    Kat(String nieuweNaam, int leeftijd) {
        super(nieuweNaam, leeftijd);
    }

    @Override
    void maakGeluid() {
        System.out.println("Miauw!");
    }
}
