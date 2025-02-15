package ATM;

public class Main {

    public static void main(String[] args) {
        ATM atm = new ATM();
        Account account = new Account("yucel","12345",5000);
        atm.run(account);
        System.out.println("Programdan çıkış yapılıyor");
    }



}
