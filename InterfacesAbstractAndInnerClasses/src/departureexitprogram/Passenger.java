package departureexitprogram;

import java.util.Scanner;

public class Passenger implements DepartureRules{
    private int feeControl;
    private boolean banControl;
    private boolean visaControl;

    public Passenger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yatırdığınız harç bedeli: ");
        this.feeControl = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Siyasi yasağınız bulunuyor mu?(evet veya hayır)");
        String response = scanner.nextLine();

        if(response.equals("evet")){
            this.banControl = true;
        }else {
            this.banControl =false;
        }
        System.out.println("Vizeniz bulunuyor mu?(evet veya hayır)");
        String response2 = scanner.nextLine();

        if(response2.equals("evet")){
            this.visaControl = true;
        }else {
            this.visaControl =false;
        }
    }

    @Override
    public boolean departureFee() {
        if (this.feeControl < 15){
            System.out.println("Lütfen yurtdışı çıkış harcını tam yatırın");
            return  false;
        }else {
            System.out.println("Yurtdışı harcı işlemi tamam!");
            return true;
        }
    }

    @Override
    public boolean politicalBan() {
        if (this.banControl == true){
            System.out.println("Siyasi yasağınız bulunuyor, yurtdışına çıkamazsınız");
            return false;
        }else {
            System.out.println("Siyasi yasağınız bulunmuyor.");
            return true;
        }
    }

    @Override
    public boolean visaStatus() {

        if (this.visaControl == true) {
            System.out.println("Vize işlemleri tamam!");
            return  true;
        }else {
            System.out.println("Vizeniz gideceğiniz ülkeye bulunmamaktadır.");
            return false;
        }
    }
}











