package week2;

public class Kat extends Huisdier{
    /**
     * @param nieuweNaam naam voor de kat
     */
    Kat(String nieuweNaam) {
        super(nieuweNaam);
    }

    @Override
    void maakGeluid() {
        System.out.println("Miauw!");
    }
}
