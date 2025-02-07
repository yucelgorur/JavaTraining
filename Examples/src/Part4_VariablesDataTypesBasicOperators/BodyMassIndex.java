package Part4_VariablesDataTypesBasicOperators;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {

        //Beden Kitle İndeksi : Kilo / Boy(m) * Boy(m)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kilonuzu Girin:");
        int weight = scanner.nextInt();
        System.out.print("Boyunuzu Girin:(Örnek :  1.72)");
        double size = scanner.nextDouble();

        double bki = weight / (size * size);

        System.out.println("Beden Kitle Indeksiniz : " + bki);
    }
}