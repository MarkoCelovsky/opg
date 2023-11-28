public class BankovyUcet {
    private String cisloUctu;
    private String menoVlastnika;
    private double zostatok;

    public BankovyUcet(String cisloUctu, String menoVlastnika, double zostatok) {
        this.cisloUctu = cisloUctu;
        this.menoVlastnika = menoVlastnika;
        this.zostatok = zostatok;
    }

    public void vlozPeniaze(double mnozstvo) {
        if (mnozstvo > 0) {
            this.zostatok += mnozstvo;
            System.out.println("Vklad na ucet pre " + this.menoVlastnika + " bol uspesny. Novy zostatok: " + this.zostatok);
        } else {
            System.out.println("Chyba: Mnozstvo penazi na vklad musi byt kladne.");
        }
    }

    public void vyberPeniaze(double mnozstvo) {
        if (mnozstvo > 0 && mnozstvo <= this.zostatok) {
            this.zostatok -= mnozstvo;
            System.out.println("Vyber z uctu pre " + this.menoVlastnika +" bol uspesny"+". Vybranych: "+mnozstvo+ ". Novy zostatok: " + this.zostatok);
        } else {
            System.out.println("Chyba: Nemozno vybrat z uctu, nedostatok penazi alebo neplatna suma.");
        }
    }

    public void kontrolaZostatku() {
        System.out.println("Zostatok na ucte pre " + this.menoVlastnika + ": " + this.zostatok);
    }

    public static void main(String[] args) {
        // Vytvorenie troch objektov BankovyUcet
        BankovyUcet ucet1 = new BankovyUcet("123456", "John Doe", 1000);
        BankovyUcet ucet2 = new BankovyUcet("789012", "Jane Doe", 500);
        BankovyUcet ucet3 = new BankovyUcet("345678", "Alice Smith",320);

        // Inicializácia uctu pomocou metódy naplnUcet()
        ucet1.vlozPeniaze(200);
        ucet2.vlozPeniaze(300);
        ucet3.vlozPeniaze(100);

        // Kontrola zostatkov na uctoch
        System.out.println(" ");
        ucet1.kontrolaZostatku();
        ucet2.kontrolaZostatku();
        ucet3.kontrolaZostatku();
        System.out.println(" ");


        // Vyber penazi z uctu
        ucet1.vyberPeniaze(50);
        ucet2.vyberPeniaze(100);
        ucet3.vyberPeniaze(200);

        // Kontrola zostatkov po vybere
        System.out.println(" ");
        ucet1.kontrolaZostatku();
        ucet2.kontrolaZostatku();
        ucet3.kontrolaZostatku();
    }
}
