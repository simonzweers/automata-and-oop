package week2;

public class Poedel extends Hond{
    /**
     * @param nieuweNaam naam voor de poedel
     */
    Poedel(String nieuweNaam, int leeftijd) {
        super(nieuweNaam, leeftijd);
    }

    @Override
    void maakGeluid() {
        System.out.println("worf");
    }
}
