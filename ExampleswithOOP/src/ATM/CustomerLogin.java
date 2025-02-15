package ATM;

import java.util.Scanner;

public class CustomerLogin {

    public boolean login(Account account){

        Scanner scanner = new Scanner(System.in);
        String userName;
        String pass;

        System.out.println("Kullanıcı Adı: ");
        userName = scanner.nextLine();
        System.out.println("Parola: ");
        pass = scanner.nextLine();

        if (account.getUserName().equals(userName) && account.getPass().equals(pass)){
            System.out.println("Giriş başarılı");
            return true;
        }else {
            System.out.println("Kullanıcı adı veya parola hatalı");
            return false;
        }


    }
}
