package week2;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("BMW", "i3", 2010);
        Auto auto2 = new Auto("Audi", "RS e-tron GT", 2020);
        Auto auto3 = new Auto("Tesla", "Model 3", 2017);
        Auto auto4 = new Auto("Jemama", "pipi", 1969);

        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);
        System.out.println(auto4);

        Huisdier[] dieren = {
                new Hond("jeff", 12),
                new Kat("mittens", 6),
                new Hond("billy", 7),
                new Poedel("princess", 33),
                new Tijger("gerrit", 31)
        };

        for (Huisdier dier : dieren) {
            dier.wieBenIk();
            dier.maakGeluid();
            System.out.println(dier);
        }

    }
}
