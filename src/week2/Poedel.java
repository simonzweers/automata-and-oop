package week2;

public class Poedel extends Hond{
    /**
     * @param nieuweNaam naam voor de poedel
     */
    Poedel(String nieuweNaam) {
        super(nieuweNaam);
    }

    @Override
    void maakGeluid() {
        System.out.println("worf");
    }
}
