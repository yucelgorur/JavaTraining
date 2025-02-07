package Part6_LoopsAndDecisionStructures;

import java.util.Scanner;

public class YearlyInterestCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bankamıza hoşgeldiniz. Yıllık faiz oranımız %60");

        double faizOrani = 0.4;
        int anapara, vade;
        System.out.println("Anapara miktarini giriniz: ");
        anapara = scanner.nextInt();
        System.out.println("Kaç sene vadede kalacağını giriniz: ");
        vade = scanner.nextInt();

        double toplam = anapara;

        for (int i = 1; i <= vade; i++){
            toplam = (anapara * faizOrani) + toplam;
            System.out.println( i + ". yilin sonunda toplam para:" + toplam);
        }





    }
}
