package week2;

public class Tijger extends Kat{

    /**
     * @param nieuweNaam naam voor de Tijger
     */
    Tijger(String nieuweNaam) {
        super(nieuweNaam);
    }

    @Override
    void maakGeluid() {
        System.out.println("ROAR!");
    }
}
