package week2;

public class Kat extends Huisdier{
    /**
     * @param nieuweNaam naam voor de kat
     */
    Kat(String nieuweNaam, int leeftijd) {
        super(nieuweNaam, leeftijd);
    }

    @Override
    void maakGeluid() {
        System.out.println("Miauw!");
    }
}
