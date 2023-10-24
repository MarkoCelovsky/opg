// Napíšte program v jazyku Java, ktorý bude generovať náhodné údaje o úrode na farme. Program by mal generovať nasledujúce údaje:
// Počet plodín: od 1 do 100
// Typ plodiny: ovocie, zelenina alebo obilnina
// Úroda na jednu plodinu: od 0 do 100 kg
 
// Očakávaný výstup:
// Počet plodín: 50
// Typ plodiny: ovocie
// Úroda na jednu plodinu: 75.50 kg
 
// Možné pod úlohy a rozšírenia:
// Program by sa dal rozšíriť o nasledujúce funkcie:
// Možnosti generovania: Program by mohol ponúkať možnosti na výber typu plodiny a rozsahu úrody.
// Správa chýb: Program by mal byť vybavený mechanizmom na správu chýb, napríklad ak sa vygeneruje počet plodín mimo rozsahu.
// Grafické rozhranie: Program by mohol byť vybavený grafický rozhraním, ktoré by uľahčilo používanie.


import java.util.Random;
import java.util.Arrays;
import java.util.List;

public class Farma {
    public static void main(String[] args) {
        Random random = new Random();
        List<String> crops = Arrays.asList("ovocie", "zelenina", "obilnina");

        int cropCount = random.nextInt(100) + 1; // Počet plodín: od 1 do 100
        String cropType = crops.get(random.nextInt(crops.size())); // Typ plodiny: ovocie, zelenina alebo obilnina
        double cropYield = random.nextDouble() * 100; // Úroda na jednu plodinu: od 0 do 100 kg

        System.out.println("Pocet plodin: " + cropCount);
        System.out.println("Typ plodiny: " + cropType);
        System.out.printf("Uroda na jednu plodinu: %.2f kg\n", cropYield);
    }
}
