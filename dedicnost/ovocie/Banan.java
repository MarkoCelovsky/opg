package dedicnost.ovocie;

public class Banan extends Ovocie {
    private String zrelost;

    // Konštruktor pre Banan
    public Banan(String farba, double vaha, String zrelost) {
        super(farba, vaha);
        this.zrelost = zrelost;
    }

    // Getter pre zrelosť
    public String getZrelost() {
        return zrelost;
    }

    // Setter pre zrelosť
    public void setZrelost(String zrelost) {
        this.zrelost = zrelost;
    }
}