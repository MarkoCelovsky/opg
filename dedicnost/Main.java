package dedicnost;

import dedicnost.ovocie.Banan;
import dedicnost.ovocie.Jablko;
import dedicnost.ovocie.Pomaranc;

public class Main {
    public static void main(String[] args) {
        // Vytvorenie inštancií ovocia
        Banan banan = new Banan("žltá", 0.15, "zrelý");
        Jablko jablko = new Jablko("červená", 0.2, "Granny Smith");
        Pomaranc pomaranc = new Pomaranc("oranžová", 0.25, "Španielsko");

        // Výpis vlastností na konzolu
        System.out.println("Banan - Farba: " + banan.getFarba() + ", Váha: " + banan.getVaha() + ", Zrelosť: " + banan.getZrelost());
        System.out.println("Jablko - Farba: " + jablko.getFarba() + ", Váha: " + jablko.getVaha() + ", Odroda: " + jablko.getOdroda());
        System.out.println("Pomaranc - Farba: " + pomaranc.getFarba() + ", Váha: " + pomaranc.getVaha() + ", Pôvod: " + pomaranc.getPovod());
    }
}