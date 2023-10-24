// . Napíšte program Java, ktorý vypíše výsledok nasledujúcich operácií.
// Testovacie údaje:
// a. -5 + 8 * 6
// b. (55+9) % 9
// c. 20 + -3*5 / 8
// d. 5 + 15 / 3 * 2 - 8 % 3
// Očakávaný výstup :
// 43
// 1
// 19
// 13


public class Uloha4 {
    public static void main(String[] args) {
        // a. -5 + 8 * 6
        int vysledokA = -5 + 8 * 6;
        System.out.println("Vysledok a: " + vysledokA);

        // b. (55+9) % 9
        int vysledokB = (55 + 9) % 9;
        System.out.println("Vysledok b: " + vysledokB);

        // c. 20 + -3*5 / 8
        double vysledokC = 20 + -3 * 5 / 8.0; // Používame 8.0 na zabezpečenie desatinného výsledku
        System.out.println("Vysledok c: " + vysledokC);

        // d. 5 + 15 / 3 * 2 - 8 % 3
        int vysledokD = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("Vysledok d: " + vysledokD);
    }
}
