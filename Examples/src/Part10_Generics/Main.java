package Part10_Generics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("YGS LYS Birinci Bulma Programı...");
        Scanner scanner = new Scanner(System.in);

        String actions = "İşlemler...\n"
                + "1. Eşit Ağırlık Öğrencileri Birincisi\n"
                + "2. Sayısal Öğrencileri Birincisi";



        System.out.println("*******************************************");
        System.out.println(actions);
        System.out.println("*******************************************");

        while (true) {
            System.out.print("Çıkış için q'ya basın...");
            String cevap = scanner.nextLine();
            if (cevap.equals("q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            // Birinci Öğrenci
            System.out.print("Birinci Öğrenci İsmi : ");
            String isim1 = scanner.nextLine();
            System.out.print("Netler(Türkçe Matematik Edebiyat Fizik ) : ");
            int turkce1 = scanner.nextInt();
            int matematik1 = scanner.nextInt();
            int edebiyat1 = scanner.nextInt();
            int fizik1 = scanner.nextInt();
            scanner.nextLine();

            // İkinci Öğrenci
            System.out.print("İkinci Öğrenci İsmi : ");
            String isim2 = scanner.nextLine();
            System.out.print("Netler(Türkçe Matematik Edebiyat Fizik ) : ");
            int turkce2 = scanner.nextInt();
            int matematik2 = scanner.nextInt();
            int edebiyat2 = scanner.nextInt();
            int fizik2 = scanner.nextInt();
            scanner.nextLine();
            // Üçüncü Öğrenci

            System.out.print("Üçüncü Öğrenci İsmi : ");
            String isim3 = scanner.nextLine();
            System.out.print("Netler(Türkçe Matematik Edebiyat Fizik ) : ");
            int turkce3 = scanner.nextInt();
            int matematik3 = scanner.nextInt();
            int edebiyat3 = scanner.nextInt();
            int fizik3 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("İşlemi Giriniz : ");
            String islem = scanner.nextLine();


            if (islem.equals("1")){
                TurkishMathematics ogrenci1 = new TurkishMathematics(turkce1, matematik1, edebiyat1, fizik1,isim1);
                TurkishMathematics ogrenci2 = new TurkishMathematics(turkce2, matematik2, edebiyat2, fizik2,isim2);
                TurkishMathematics ogrenci3 = new TurkishMathematics(turkce3, matematik3, edebiyat3, fizik3,isim3);

                TurkishMathematics birinci = birinci(ogrenci1,ogrenci2, ogrenci3);

                System.out.println("Birinci Eşit Ağırlık Öğrencisi : " + birinci.getIsim());
                System.out.println("Öğrenci Puanı : " + birinci.puanHesapla());





            }
            else if (islem.equals("2")){
                ScienceMath ogrenci1 = new ScienceMath(turkce1, matematik1, edebiyat1, fizik1,isim1);
                ScienceMath ogrenci2 = new ScienceMath(turkce2, matematik2, edebiyat2, fizik2,isim2);
                ScienceMath ogrenci3 = new ScienceMath(turkce3, matematik3, edebiyat3, fizik3,isim3);

                ScienceMath birinci = birinci(ogrenci1,ogrenci2, ogrenci3);

                System.out.println("Birinci Sayısal Öğrencisi : " + birinci.getIsim());
                System.out.println("Öğrenci Puanı : " + birinci.puanHesapla());
            }

            else {
                System.out.println("Geçersiz İşlem...");
            }

        }




    }

    public static <E extends Applicant> E birinci(E e1,E e2,E e3) {

        if (e1.puanHesapla() > e2.puanHesapla() && e1.puanHesapla() > e3.puanHesapla()) {

            return e1;
        }
        else if (e2.puanHesapla() > e1.puanHesapla() && e2.puanHesapla() > e3.puanHesapla()) {

            return e2;
        }
        else if (e3.puanHesapla() > e2.puanHesapla() && e3.puanHesapla() > e1.puanHesapla()) {

            return e3;
        }
        else {
            return e1;
        }




    }
}
