package BeybladeProgram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Beyblade programına hoşgeldiniz.");
        System.out.println("Çıkış için q'ya basınız.");

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Hangi beyblade' i üretmek istiyorsunuz? ");
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor.");
                break;
            } else {
                CreateBeyblade createBeyblade = new CreateBeyblade();
                Beyblade beyblade = createBeyblade.createBeylade(islem);
                if (beyblade == null){
                    System.out.println("Lütfen geçerli bir beyblade ismi giriniz.");
                }
                else {
                    beyblade.showInformation();
                    beyblade.attack();
                    beyblade.getMonster();
                }
            }
        }



    }
}
