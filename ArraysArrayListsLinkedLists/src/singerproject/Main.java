package singerproject;

import java.util.Scanner;

public class Main {
    private static Singer singers = new Singer();
    private static Scanner scanner = new Scanner(System.in);

    public  static void write_action(){
        System.out.println("\t 0 - İşlemleri Görüntüle");
        System.out.println("\t 1 - Şarkıcıları Görüntüle");
        System.out.println("\t 2 - Şarkıcı  Ekle");
        System.out.println("\t 3 - Şarkıcı Güncelle");
        System.out.println("\t 4 - Şarkıcı Sil");
        System.out.println("\t 5 - Şarkıcı Ara");
        System.out.println("\t 6 - Uygulamadan Çık");


    }
    public static void main(String[] args) {

        System.out.println("\t Şarkıcı Uygulamasına hoşgediniz...");
        write_action();

        boolean quit = false;

        int action ;
        while (!quit){
            System.out.println("Bir işlem seçiniz: ");

            action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    write_action();
                    break;
                case 1:
                    show();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    quit = true;
                    System.out.println("Uygulamadan çıkılıyor");
                    break;
            }

        }

    }


    public static void show() {
        singers.write_singer();
    }
    public static void add() {
        System.out.println("Eklemek istediğiniz şarkıcının ismi: ");
        String name = scanner.nextLine();
        singers.add_singer(name);
    }

    public static void update() {
        System.out.println("Güncellemek istediğiniz pozisyon(1,2,3....)");
        int position = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Güncellemek istediğiniz isim: ");
        String new_name = scanner.nextLine();
        singers.update_singer(new_name,(position-1));
    }

    public static void delete() {
        System.out.println("Silmek istediğiniz pozisyon(1,2,3.....): ");
        int position = scanner.nextInt();
        singers.delete_singer((position-1));
    }


    public static void search() {
        System.out.println("Aramak istediğiniz şarkıcı: ");
        String name = scanner.nextLine();
        singers.search_singer(name);
    }








}
