public class Obdlznik {
    private double vyska;
    private double sirka;

    // Konstruktor triedy Obdlznik
    public Obdlznik(double vyska, double sirka) {
        this.vyska = vyska;
        this.sirka = sirka;
    }

    public double vypocitajObsah() {
        return vyska * sirka;
    }

    public static void main(String[] args) {
        // Vytvorenie objektu typu Obdlznik pomocou konštruktora
        Obdlznik obdlznik = new Obdlznik(5.0, 10.0);

        // Výpočet a výpis obsahu obdĺžnika
        System.out.println("Obsah obdlznika: " + obdlznik.vypocitajObsah());
    }
}
