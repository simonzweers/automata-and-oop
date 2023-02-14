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

    public void wiebenik() {
        System.out.printf("Mijn merk: %s \nMijn model: %s \nMijn bouwjaar: %d\n\n", merk, model, bouwjaar);
    }

    public void gassen() {
        System.out.println("Vroommmm!");
    }
    public void knipperlicht() {
        System.out.println("Knipper");
    }
}
