/**
 * Auto klasse voor practicum week 2
 * @author Simon Zweers
 * @date 13-02-2023
 */

package week2;

public class Auto{
    public String merk;
    public String model;
    public int bouwjaar;

    public Auto(String merk, String model, int bouwjaar) {
        this.merk = merk;
        this.model = model;
        this.bouwjaar = bouwjaar;
    }

    /**
     * Funtie voor het geven van informatie over het object
     */
    public void wieBenIk() {
        System.out.printf("Mijn merk: %s \nMijn model: %s \nMijn bouwjaar: %d\n\n", merk, model, bouwjaar);
    }

    public void gassen() {
        System.out.println("Vroommmm!");
    }
    public void knipperlicht() {
        System.out.println("Knipper");
    }

    @Override
    public String toString() {
        return "Mijn merk: " + merk + " \nMijn model: " + model + " \nMijn bouwjaar: " + bouwjaar + "\n\n";
    }
}
