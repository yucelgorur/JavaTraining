package Part5_ConditionalsStatements;

import java.util.Scanner;

public class BodyMassIndexConditionalsResults {
    public static void main(String[] args) {
        /*
        Kullanıcıdan alınan boy ve kilo değerlerine göre beden kitle indeksini hesaplayın ve şu kurallara göre ekrana şu yazıları yazdırın.

            Beden Kitle İndeksi: Kilo / Boy(m) *  Boy(m)

            BKİ 18.5'un altındaysa -------> Zayıf

            BKİ 18.5 ile 25 arasındaysa ------> Normal

            BKİ 25 ile 30 arasındaysa --------> Fazla Kilolu

            BKİ 30'un üstündeyse -------------> Obez

        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kilonuz:");
        int kilo = scanner.nextInt();

        System.out.print("Boy (Örnek : 1.72): ");
        double boy = scanner.nextDouble();

        double bki = (kilo / (boy  * boy));


        if (bki < 18.5) {
            System.out.println(bki + ":Sağlıklı olmak için biraz beslenmelisin :)");
        }
        else if (bki >= 18.5 && bki < 25) {
            System.out.println(bki + ": Tebrikler! Sağlıklı aralıktasın.");
        }
        else if (bki >= 25 && bki < 30) {
            System.out.println(bki + ": Dikkat etmen gerekiyor! Sınırın üzerindesin!");
        }
        else {
            System.out.println(bki + ": Sınır aşılmış durumda! Destek almalısın!");
        }
    }
}
