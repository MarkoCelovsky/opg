// Napíšte program v jazyku Java, ktorý bude simulovať jazdu automobilu. Program by mal spĺňať nasledujúce požiadavky:
// Vstupné údaje (zadá užívateľ):
// Značka automobilu: Škoda
// Model automobilu: Oktávia
// Spotreba litrov na 100 km: 6
// Objem nádrže (litre): 40
// Vzdialenosť cesty: 1000
 
// Očakávaný výstup:
// Značka automobilu: Škoda
// Model automobilu: Oktávia
// Spotreba: 6l/100 km
// Objem nádrže: 40 litrov
// Vzdialenosť cesty: 1000 kilometrov
// Celková spotreba paliva: 60.0 litrov
// Počet natankovaní: 2
import java.util.Scanner;

public class Automobily {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Zadajte udaje o automobile:");
            System.out.print("Znacka automobilu: ");
            String brand = scanner.nextLine();

            System.out.print("Model automobilu: ");
            String model = scanner.nextLine();

            System.out.print("Spotreba litrov na 100 km: ");
            double consumption = scanner.nextDouble();

            System.out.print("Objem nadrze (litre): ");
            double tankCapacity = scanner.nextDouble();

            System.out.print("Vzdialenost cesty (km): ");
            double distance = scanner.nextDouble();

            double totalFuelConsumed = (consumption / 100) * distance;

            int refills = (int) Math.ceil(totalFuelConsumed / tankCapacity);

            System.out.println("Znacka automobilu: " + brand);
            System.out.println("Model automobilu: " + model);
            System.out.println("Spotreba: " + consumption + "l/100 km");
            System.out.println("Objem nadrze: " + tankCapacity + " litrov");
            System.out.println("Vzdialenost cesty: " + distance + " kilometrov");
            System.out.println("Celkova spotreba paliva: " + totalFuelConsumed + " litrov");
            System.out.println("Pocet natankovani: " + refills);
        }
    }
}
