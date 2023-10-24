// Napíšte Java program, ktorý použije dve čísla ako vstup a zobrazí súčin
// dvoch čísel.
// Údaje testu:
// Zadajte prvé číslo: 25
// Zadajte druhé číslo: 5
// Očakávaný výstup :
// 25 x 5 = 125

import java.util.Scanner;

public class Uloha5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {


        System.out.print("Zadajte prve cislo: ");
        double cislo1 = scanner.nextDouble();

        System.out.print("Zadajte druhe cislo: ");
        double cislo2 = scanner.nextDouble();

        double sucin = cislo1 * cislo2;

        System.out.println(cislo1 + " x " + cislo2 + " = " + sucin);
    }
    }
}
