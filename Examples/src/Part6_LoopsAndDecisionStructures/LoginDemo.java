package Part6_LoopsAndDecisionStructures;

import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int giris_hakki = 3;
        String id = "test";
        String pass= "12345";
        System.out.println("**************************");
        System.out.println("Kullanici ekranina hoşgeldiniz.");
        System.out.println("**************************");

        while(true){
            System.out.println("Kullanici adini giriniz: ");
            String userName = scanner.nextLine();
            System.out.println("Kullanici parolasini giriniz: ");
            String password = scanner.nextLine();

            if(userName.equals(id) && pass.equals(password)){
                System.out.println("Hoşgeldiniz! " + userName);
                break;
            }
            else if (userName.equals(id) && !pass.equals(password)){
                System.out.println("Kullanici adi veya parola hatali");
                giris_hakki -= 1;
                System.out.println("Kullanici adi veya parola hatali " + giris_hakki +" adet giris hakkiniz kaldi.");

            }else if (!userName.equals(id) && pass.equals(password)){
                System.out.println("Kullanici adi veya parola hatali");
                giris_hakki -= 1;
                System.out.println("Kullanici adi veya parola hatali " + giris_hakki +" adet giris hakkiniz kaldi.");

            }else {
                System.out.println("Kullanici adi veya parola hatali");
                giris_hakki -= 1;
                System.out.println("Kullanici adi veya parola hatali " + giris_hakki +" adet giris hakkiniz kaldi.");

            }
            if (giris_hakki ==0){
                System.out.println("3 kere hatali giris yaptiniz, çıkış yapılıyor.");
                break;
            }

        }

    }
}
