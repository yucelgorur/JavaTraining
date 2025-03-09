package linkedlistexample;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class main {

    public  static void show_action(){
        System.out.println("0 - işlemleri görüntüle");
        System.out.println("1 - Bir sonraki şehire git");
        System.out.println("2 - Bir önceki şehire git");
        System.out.println("3 - Uygulamadan çık");
    }
    public static void cities_tour(LinkedList<String> cities){
        ListIterator<String> iterator = cities.listIterator();

        int action;

        show_action();

        Scanner scanner = new Scanner(System.in);

        if (!iterator.hasNext()){

            System.out.println("Herhangi bir şehir bulunmuyor.");

        }
        boolean quit = false;
        boolean next = true;

        while (!quit){
            System.out.println("Bir işlem seçiniz: ");

            action = scanner.nextInt();

            switch (action){
                case 0:
                    show_action();
                    break;
                case 1:
                    if (!next){
                        if (iterator.hasNext()){
                            iterator.next();
                        }
                        next = true;
                    }
                    if (iterator.hasNext()){
                        System.out.println("Şehire gidiliyor: " + iterator.next());
                    }
                    else {
                        System.out.println("Gidilecek şehir kalmadı.");
                        next = true ;
                    }
                    break;

                case 2:
                    if (next){
                        if (iterator.hasPrevious()){
                            iterator.previous();
                        }
                        next = false;
                    }
                    if (iterator.hasPrevious()){
                        System.out.println("Şehire gidiliyor: " + iterator.previous());
                    }
                    else {
                        System.out.println("Şehir turu başladı.");
                    }
                    break;

                case 3 :
                    quit = true ;
                    System.out.println("Uygulamadan çıkılıyor.");
                    break;

            }

        }

    }

    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<String>();

        cities.add("Ankara");
        cities.add("Eskişehir");
        cities.add("Afyon");

        cities_tour(cities);
    }

}
