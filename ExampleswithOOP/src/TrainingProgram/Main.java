package TrainingProgram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("İdman programına hoşgeldiniz");

        String exercises = "***Geçerli Hareketler***\n"
                         + "Burpee\n"
                         + "Pushup(Şınav)\n"
                         + "Situp(Mekik)\n"
                         + "Squad\n";
        System.out.println(exercises);

        System.out.println("Bir idman oluşturun");
        System.out.println("Burpee Sayısı: ");
        int burpee = scanner.nextInt();
        System.out.println("Pushup Sayısı: ");
        int pushup = scanner.nextInt();
        System.out.println("situp Sayısı: ");
        int situp = scanner.nextInt();
        System.out.println("Squad Sayısı: ");
        int squad = scanner.nextInt();

        scanner.nextLine();

        Training training = new Training(burpee, pushup, situp, squad);
        System.out.println("İdmanınız başlıyor");

        while (training.doneExercise() == false){

            System.out.print("Hareket Türü(Burpee,Pushup,Situp,Squat) : ");
            String type = scanner.nextLine();
            System.out.print("Bu hareketten kaç tane yapacaksınız? : ");
            int number = scanner.nextInt();
            scanner.nextLine();
            training.doExercise(type,number);

        }
        System.out.println("İdmanı başarılı tamamladınız!");
    }
}
