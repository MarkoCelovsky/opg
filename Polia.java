class Polia {
    static void celePole(int[] pole){
        for(int p:pole) {
            System.out.println(p);
        }
    }
    static void min(int[] pole){
        int min = pole[0];
        for (int i = 1; i < pole.length; i++) {
            if (min > pole[i]){
                min = pole[i];
            }
        }
        System.out.println(min);
    }
    static void max(int[] pole){
        int max = pole[0];
        for (int i = 1; i < pole.length; i++) {
            if (max < pole[i]){
                max = pole[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args){
        int[] pole = {39, 15, 2, 8, 10, 25, 6, 12, 18, 21, 5, 17, 9, 14, 27, 20, 11, 4, 22, 19, 13, 7, 23, 16};
        System.out.print("Cele pole:\n");
        celePole(pole);
        System.out.print("Najmensie cislo: ");
        min(pole);
        System.out.print("Najvacsie cislo: ");
        max(pole);
    }
}