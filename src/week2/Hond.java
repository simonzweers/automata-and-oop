package week2;

public class Hond extends Huisdier{
    /**
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
