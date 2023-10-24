// Napíšte program v jazyku Java, ktorý bude simulovať rezerváciu izby v hoteli. Program by mal spĺňať nasledujúce požiadavky:
// Užívateľ by mal byť schopný zadať údaje o rezervácii, vrátane typu izby, počtu izieb, dátumu príchodu a odchodu a počtu osôb.
// Program by mal vypočítať celkovú cenu rezervácie.
// Program by mal vytlačiť potvrdenie rezervácie.
 
// Výstup:
// Typ izby: jednolôžková
// Počet izieb: 1
// Dátum príchodu: 2023-10-12
// Dátum odchodu: 2023-10-14
// Počet osôb: 1
// Celková cena: 150
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Hotelierstvo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // Vstupne udaje od uzivatela
            System.out.println("Vitajte v rezervacnom systeme hotela.");
            System.out.print("Zadajte typ izby: ");
            String roomType = scanner.nextLine();

            System.out.print("Zadajte pocet izieb: ");
            int roomCount = scanner.nextInt();

            System.out.print("Zadajte datum prichodu (yyyy-MM-dd): ");
            String arrivalDateStr = scanner.next();
            LocalDate arrivalDate = LocalDate.parse(arrivalDateStr);

            System.out.print("Zadajte datum odchodu (yyyy-MM-dd): ");
            String departureDateStr = scanner.next();
            LocalDate departureDate = LocalDate.parse(departureDateStr);

            System.out.print("Zadajte pocet osob: ");
            int numberOfGuests = scanner.nextInt();

            // Vypocet ceny
            long numberOfNights = ChronoUnit.DAYS.between(arrivalDate, departureDate);
            double pricePerNight = calculatePrice(roomType);
            double totalPrice = roomCount * numberOfNights * pricePerNight;

            // Vystup
            System.out.println("Typ izby: " + roomType);
            System.out.println("Pocet izieb: " + roomCount);
            System.out.println("Datum prichodu: " + arrivalDate);
            System.out.println("Datum odchodu: " + departureDate);
            System.out.println("Pocet osob: " + numberOfGuests);
            System.out.println("Celkova cena: " + totalPrice);
        }
    }

    // Metoda pre vypocet ceny izby na zaklade typu izby (prispôsobte si svojim cenam)
    public static double calculatePrice(String roomType) {
        if (roomType.equalsIgnoreCase("jedno")) {
            return 50.0; // Cena za noc jednolozkovej izby
        } else if (roomType.equalsIgnoreCase("dvoj")) {
            return 80.0; // Cena za noc dvojlozkovej izby
        } else {
            return 100.0; // Neznamy typ izby
        }
    }
}
