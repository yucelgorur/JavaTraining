package ATM;

import java.util.Scanner;

public class ATM {

    public void run(Account account){
        CustomerLogin login = new CustomerLogin();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bankamıza hoşgeldiniz");
        System.out.println("*************************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("*************************************");
        int rightEntry = 3;

        while (true){
            if (login.login(account)){
                System.out.println("Giriş başarılı");
                break;
            }else {
                System.out.println("Giriş başarısız");
                rightEntry -= 1;
                System.out.println("Kalan giriş hakkınız: " +rightEntry);
            }
            if (rightEntry == 0){
                System.out.println("Giriş hakkınız bitti");
                return;
            }
        }
        System.out.println("****************");
        String transactions ="1. Bakiye Görüntüle\n"
                            +"2. Para Yatırma\n"
                            +"3. Para Çekme\n"
                            +"Çıkış için q' ya basın\n";
        System.out.println(transactions);
        System.out.println("***********************************");
        while (true){
            System.out.println("İşlem seçiniz: ");
            String islem = scanner.nextLine();

            if(islem.equals("q")){
                System.out.println("Çıkış yapılıyor.");
                break;
            } else if (islem.equals("1")) {
                System.out.println("Bakiyeniz: "+ account.getBalance());
            } else if (islem.equals("2")) {
                System.out.println("Yatırmak istediğiniz tutar: ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                account.addMoney(amount);
            } else if (islem.equals("3")) {
                System.out.println("Çekmek istediğiniz tutar: ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                account.withDrawal(amount);
            }else{
                System.out.println("Geçersiz İşlem");
            }
        }
    }

}
