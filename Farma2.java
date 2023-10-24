// Program by sa dal rozšíriť o funkciu, ktorá by počítala celkovú úrodu na farme. Táto funkcia by sa dala implementovať nasledovne:
// Očakávaný výstup:
// Počet plodín: 50
// Typ plodiny: ovocie
// Úroda na jednu plodinu: 75.50 kg
// Celková úroda: 3775 kg

import java.util.Random;
import java.util.Arrays;
import java.util.List;

public class Farma2 {
    public static void main(String[] args) {
        Random random = new Random();
        List<String> crops = Arrays.asList("ovocie", "zelenina", "obilnina");

        int cropCount = random.nextInt(100) + 1; 
        String cropType = crops.get(random.nextInt(crops.size())); 
        double cropYield = random.nextDouble() * 100; 
        double totalYield = cropCount * cropYield;

        System.out.println("Pocet plodin: " + cropCount);
        System.out.println("Typ plodiny: " + cropType);
        System.out.printf("Uroda na jednu plodinu: %.2f kg\n", cropYield);
        System.out.printf("Celkova uroda: %.2f kg\n", totalYield);
    }
}
