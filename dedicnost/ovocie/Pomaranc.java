package dedicnost.ovocie;

public class Pomaranc extends Ovocie {
    private String povod;

    // Konštruktor pre Pomaranč
    public Pomaranc(String farba, double vaha, String povod) {
        super(farba, vaha);
        this.povod = povod;
    }

    // Getter pre pôvod
    public String getPovod() {
        return povod;
    }

    // Setter pre pôvod
    public void setPovod(String povod) {
        this.povod = povod;
    }
}