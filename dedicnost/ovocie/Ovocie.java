// Adresárova štruktúra:
// - src
//   - dedicnost
//     - ovocie
//       - Ovocie.java

// Ovocie.java
package dedicnost.ovocie;

public class Ovocie {
    private String farba;
    private double vaha;

    // Konštruktor
    public Ovocie(String farba, double vaha) {
        this.farba = farba;
        this.vaha = vaha;
    }

    // Getter pre farbu
    public String getFarba() {
        return farba;
    }

    // Setter pre farbu
    public void setFarba(String farba) {
        this.farba = farba;
    }

    // Getter pre váhu
    public double getVaha() {
        return vaha;
    }

    // Setter pre váhu
    public void setVaha(double vaha) {
        this.vaha = vaha;
    }
}
