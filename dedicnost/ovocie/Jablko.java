package dedicnost.ovocie;

public class Jablko extends Ovocie {
    private String odroda;

    // Konštruktor pre Jablko
    public Jablko(String farba, double vaha, String odroda) {
        super(farba, vaha);
        this.odroda = odroda;
    }

    // Getter pre odrodu
    public String getOdroda() {
        return odroda;
    }

    // Setter pre odrodu
    public void setOdroda(String odroda) {
        this.odroda = odroda;
    }
}