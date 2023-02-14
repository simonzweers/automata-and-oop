package week2;

public class Hond extends Huisdier{
    /**
     * @param nieuweNaam naam voor de kat
     */
    Hond(String nieuweNaam) {
        super(nieuweNaam);
    }

    @Override
    void maakGeluid() {
        System.out.println("WOEF!");
    }
}
