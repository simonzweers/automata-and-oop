package week5;

/**
 * Dier klasse representerend voor een dier met naam, soort
 *
 * @author Simon Zweers
 * @since 09-03-2023
 */
public class Animal {
    private String name;
    private String species;
    private int leeftijd;

    Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setSpecies(String newSpecies) {
        this.species = newSpecies;
    }
}
