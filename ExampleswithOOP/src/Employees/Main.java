package Employees;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Çalışanlar Programına Hoşgeldiniz.");

        String actions = "****İşlemler****\n"
                        +"1. Yazılımcı İşlemleri\n"
                        +"2. Yönetici İşlemleri\n"
                        +"Çıkış için q'ya basın";
        System.out.println("******************************");
        System.out.println(actions);
        System.out.println("******************************");

        while (true){
            System.out.println(actions);
            System.out.println("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor.");
                break;
            } else if (islem.equals("1")) {
                Developer developer = new Developer("Yücel",55,"Görür","C,Java");
                String developer_actions = "1. Format At\n"
                                        +"2. Bilgileri Göster\n"
                                        +"Yazılımcı İşlemlerinden Çıkış için q'ya basın";
                while (true){
                    System.out.println(developer_actions);
                    System.out.println("Yazılımcı işlemini seçiniz: ");
                    String d_actions =scanner.nextLine();
                    if (d_actions.equals("q")){
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor.");
                        break;
                    } else if (d_actions.equals("1")) {
                        System.out.println("İşletim sistemi: ");
                        String operatingSystem = scanner.nextLine();
                        developer.formatAt(operatingSystem);
                    } else if (d_actions.equals("2")) {
                        developer.showInformation();
                    }else {
                        System.out.println("Geçersiz yazılımcı işlemi seçtiniz.");
                    }
                }

            }else if(islem.equals("2")){
                Manager manager = new Manager("Yücel",100,"Görür",15);
                String manager_actions = "**Yönetici İşlemleri**\n"
                                        +"1. Zam Yapılması\n"
                                        +"2. Bilgilerini Göster\n"
                                        +"Yönetici işlemlerinden çıkış için q'ya basın.\n";
                while (true){
                    System.out.println(manager_actions);
                    System.out.println("Yönetici İşlemi Seçiniz: ");
                    String m_actions = scanner.nextLine();

                    if (m_actions.equals("q")){
                        System.out.println("Yönetici işlemlerinden çıkılıyor.");
                        break;
                    } else if (m_actions.equals("1")) {
                        System.out.println("Yöneticinin ne kadar zam yapmasını istiyorsunuz :");
                        int raise_amount = scanner.nextInt();
                        scanner.nextLine();
                        manager.getRaise(raise_amount);
                    }else if(m_actions.equals("2")){
                        manager.showInformation();
                    }else {
                        System.out.println("Geçersiz Yönetici işlemi");
                    }

                }


            }else {
                System.out.println("Geçersiz İşlem");
            }
        }
    }



}
