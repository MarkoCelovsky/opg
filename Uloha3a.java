import java.util.Scanner;

public class Uloha3a {
    public static void main(String[] args) {
       try( Scanner scanner = new Scanner(System.in)){

        System.out.print("Zadajte číslo, ktoré chcete vydeliť: ");
        double cislo = scanner.nextDouble();

        System.out.print("Zadajte číslo, na ktoré chcete deliť: ");
        double delitel = scanner.nextDouble();

        double vysledok = cislo / delitel;

        System.out.println("Výsledok delenia: " + vysledok);
    }
}
}
