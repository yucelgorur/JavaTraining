package departureexitprogram;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz!");

        String conditions = "****Yurdışı Çıkış Kuralları****\n"
                            +"Herhangi bir siyasi yasağınızın bulunmaması gerekiyor.\n"
                            +"15 TL harç bedelinini tam olarak yatırmanız gerekiyor gerekiyor.\n"
                            +"Gideceğiniz ülkeye vizenizin bulunmaması gerekiyor.";

        String message = "Yurtdışı şartlarından hepsini sağlamanız gerekiyor.";

        while (true){
            System.out.println("**************************************");
            System.out.println(message);
            System.out.println("**************************************");
            System.out.println(conditions);

            Passenger passenger = new Passenger();

            System.out.println("Harç bedeli kontrol ediliyor...");
            Thread.sleep(3000);

            if(passenger.departureFee() == false){
                System.out.println(message);
                continue;
            }

            System.out.println("Siyasi yasak kontrol ediliyor...");
            Thread.sleep(3000);

            if (passenger.politicalBan() == false){
                System.out.println(message);
                continue;
            }

            System.out.println("Vize durumu kontrol ediliyor...");
            Thread.sleep(3000);
            if (passenger.visaStatus() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("İşlemleriniz tamam! Yurtdışına çıkabilirsiniz.");
            break;
        }
    }










}