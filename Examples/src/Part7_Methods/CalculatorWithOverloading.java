package Part7_Methods;

import java.util.Scanner;

public class CalculatorWithOverloading {

    public static int toplama(int a, int b){

        return (a+b);
    }

    public static int toplama(int a, int b, int c){

        return (a+b+c);
    }

    public static int cikarma(int a,int b){

        return(a-b);
    }

    public static int cikartma(int a,int b, int c){

        return (a-b-c);
    }
    public static int carpma(int a,int b){

        return (a*b);
    }
    public static int carpma(int a,int b,int c){

        return (a*b*c);
    }
    public static double bolme(int a,int b){

        return ((double) a*b);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String islemler = "1. İslem Toplama İslemi\n"
                        + "2. İslem Çıkartma İslemi\n"
                        + "3. İslem Çarpma İslemi\n"
                        + "4. İslem Bölem İslemi\n"
                        + "Çıkış için q 'ya basınız.";
        System.out.println("****************************************");
        System.out.println(islemler);
        System.out.println("****************************************");

        while (true){
            System.out.println("İşlemi seçiniz");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor");
                break;
            }else if(islem.equals("1")){
                System.out.println("Kaç değer toplamak istiyorsunuz? (2 veya 3)");
                int adet = scanner.nextInt();
                if (adet==2){
                    System.out.println("İlk sayıyı giriniz: ");
                    int sayi1 = scanner.nextInt();
                    System.out.println("İkinci sayıyı giriniz: ");
                    int sayi2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayıların toplamı: "+ toplama(sayi1,sayi2));
                } else if (adet==3) {
                    System.out.println("İlk sayıyı giriniz: ");
                    int sayi1 = scanner.nextInt();
                    System.out.println("İkinci sayıyı giriniz: ");
                    int sayi2 = scanner.nextInt();
                    System.out.println("İkinci sayıyı giriniz: ");
                    int sayi3 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayıların toplamı: "+ toplama(sayi1,sayi2,sayi3));
                }else {
                    System.out.println("Uygun adet bulunamadı.");
                }
            } else if (islem.equals("2")) {
                System.out.println("Kaç değer çıkarmak istiyorsunuz? (2 veya 3)");
                int adet = scanner.nextInt();
                if (adet==2){
                    System.out.println("İlk sayıyı giriniz: ");
                    int sayi1 = scanner.nextInt();
                    System.out.println("İkinci sayıyı giriniz: ");
                    int sayi2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayıların farkı: "+ cikarma(sayi1,sayi2));
                } else if (adet==3) {
                    System.out.println("İlk sayıyı giriniz: ");
                    int sayi1 = scanner.nextInt();
                    System.out.println("İkinci sayıyı giriniz: ");
                    int sayi2 = scanner.nextInt();
                    System.out.println("İkinci sayıyı giriniz: ");
                    int sayi3 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayıların farkı: "+ cikartma(sayi1,sayi2,sayi3));
                }else {
                    System.out.println("Uygun adet bulunamadı. Tekrar işlem seçiniz");
                }
            }else if (islem.equals("3")){
                System.out.println("Kaç değer çarpmak istiyorsunuz? (2 veya 3)");
                int adet = scanner.nextInt();
                if (adet==2){
                    System.out.println("İlk sayıyı giriniz: ");
                    int sayi1 = scanner.nextInt();
                    System.out.println("İkinci sayıyı giriniz: ");
                    int sayi2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayıların çarpımı: "+ carpma(sayi1,sayi2));
                } else if (adet==3) {
                    System.out.println("İlk sayıyı giriniz: ");
                    int sayi1 = scanner.nextInt();
                    System.out.println("İkinci sayıyı giriniz: ");
                    int sayi2 = scanner.nextInt();
                    System.out.println("İkinci sayıyı giriniz: ");
                    int sayi3 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayıların çarpımı: "+ carpma(sayi1,sayi2,sayi3));
                }else {
                    System.out.println("Uygun adet bulunamadı. Tekrar işlem seçiniz");
                }
            }else if (islem.equals("4")){
                System.out.println("İlk sayıyı giriniz: ");
                int sayi1 = scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz: ");
                int sayi2 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Girilen sayıların bolme sonucu: "+ bolme(sayi1,sayi2));
            }else {
                System.out.println("Hatalı tuşlama yaptınız, tekrar işlem seçiniz. \n" + islemler);
            }

        }
    }
}
