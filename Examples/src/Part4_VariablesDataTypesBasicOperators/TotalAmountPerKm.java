package Part4_VariablesDataTypesBasicOperators;

import java.util.Scanner;

public class TotalAmountPerKm {
    public static void main(String[] args) {
        /*

        Bir aracın kilometrede ne kadar yaktığı ve kaç kilometre yol yaptığı bilgilerini alın ve
        sürücünün toplam ne kadar ödemesini gerektiğini hesaplayın.

        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Aracınız kilometre kaç kuruş yakıyor? (Örnek : 2.35):");
        double kurus = scanner.nextDouble();

        System.out.print("Aracınızla kaç kilometre gittiniz? :");

        int km = scanner.nextInt();

        System.out.println("Toplam ödemeniz gereken tutar: " + (kurus * km) + " 'tl dir...");

    }
}
