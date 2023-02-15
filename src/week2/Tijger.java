package week2;

public class Tijger extends Kat{

    /**
     * @param nieuweNaam naam voor de Tijger
     */
    Tijger(String nieuweNaam, int leeftijd) {
        super(nieuweNaam, leeftijd);
    }

    @Override
    void maakGeluid() {
        System.out.println("ROAR!");
    }
}
