package geometricareacalculation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String conditions = "****İşlemler****\n"
                +"1. Kare alanını hesapla\n"
                +"2. Üçgen alanını hesapla\n"
                +"3. Daire alanını hesapla\n"
                +"Çıkış için q ya basın";
        
        while (true){
            System.out.println(conditions);
            System.out.println("Hangi şeklin alanını hesaplamak istiyorsunuz? ");
            String shapeType = scanner.nextLine();
            
            if (shapeType.equals("q")){
                System.out.println("Programdan çıkılıyor");
                break;
            }
            else if (shapeType.equals("1")) {
                System.out.println("Karenin kenarı: ");
                int rim = scanner.nextInt();
                scanner.nextLine();
                Square shape = new Square("Kare1", rim);
                shape.calculateArea();
            }
            else if (shapeType.equals("2")) {
                System.out.println("Kenar 1: ");
                int rim1 = scanner.nextInt();
                System.out.println("Kenar 2: ");
                int rim2 = scanner.nextInt();
                System.out.println("Kenar 3: ");
                int rim3 = scanner.nextInt();
                scanner.nextLine();

                Triangle shape = new Triangle("Üçgen1", rim1,rim2, rim3);

                shape.calculateArea();
            }
            else if (shapeType.equals("3")) {
                System.out.println("Dairenin yarıçapı: ");
                int radius = scanner.nextInt();
                scanner.nextLine();

                Circle shape = new Circle("Daire1", radius);

                shape.calculateArea();

            } else {
                System.out.println("Geçersiz işlem");
            }

        }





    }
}
