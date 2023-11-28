public class Zamestnanec {
    private int id;
    private String meno;
    private Number vyplata;

    public Zamestnanec(int id, String meno, Number vyplata) {
        this.id = id;
        this.meno = meno;
        this.vyplata = vyplata;
    }

    public int ziskajId() {
        return id;
    }

    public String ziskajMeno() {
        return meno;
    }

    public Number ziskajVyplatu() {
        return vyplata;
    }

    public static void main(String[] args) {
        // Vytvorenie 3 objektov typu Zamestnanec a ich inicializácia
        Zamestnanec zamestnanec1 = new Zamestnanec(1, "Marek", 50000);
        Zamestnanec zamestnanec2 = new Zamestnanec(2, "Eva", 60000);
        Zamestnanec zamestnanec3 = new Zamestnanec(3, "Peter", 55000);

        // Vypísanie vlastností vytvorených a inicializovaných zamestnancov
        System.out.println("Zamestnanec 1:");
        System.out.println("ID: " + zamestnanec1.ziskajId());
        System.out.println("Meno: " + zamestnanec1.ziskajMeno());
        System.out.println("Vyplata: " + zamestnanec1.ziskajVyplatu());
        System.out.println();

        System.out.println("Zamestnanec 2:");
        System.out.println("ID: " + zamestnanec2.ziskajId());
        System.out.println("Meno: " + zamestnanec2.ziskajMeno());
        System.out.println("Vyplata: " + zamestnanec2.ziskajVyplatu());
        System.out.println();

        System.out.println("Zamestnanec 3:");
        System.out.println("ID: " + zamestnanec3.ziskajId());
        System.out.println("Meno: " + zamestnanec3.ziskajMeno());
        System.out.println("Vyplata: " + zamestnanec3.ziskajVyplatu());
    }
}
