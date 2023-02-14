package week2;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.merk = "BMW";
        auto1.model = "i3";
        auto1.bouwjaar = 2010;

        Auto auto2 = new Auto();
        auto2.merk = "Audi";
        auto2.model = "RS e-tron GT";
        auto2.bouwjaar = 2020;

        Auto auto3 = new Auto();
        auto3.merk = "Tesla";
        auto3.model = "Model 3";
        auto3.bouwjaar = 2017;

        Auto auto4 = new Auto();
        auto4.merk = "Jemama";
        auto4.model = "pipi";
        auto4.bouwjaar = 1969;

        auto1.wiebenik();
        auto2.wiebenik();
        auto3.wiebenik();
        auto4.wiebenik();
    }
}
