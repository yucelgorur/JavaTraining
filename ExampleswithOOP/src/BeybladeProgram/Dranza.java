package BeybladeProgram;

public class Dranza extends Beyblade{

    private String monster;

    public Dranza(String player, int speed, int power, String monster) {
        super(player, speed, power);
        this.monster = monster;
    }

    @Override
    public void getMonster() {
        System.out.println(getPlayer() + " "+ monster + " "+ "ortaya çıkarıyor");
        System.out.println(getPlayer()+ " in saldırısı: Alev Kılıcı");
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Kutsal Canavar Adı: " + monster);
    }
}
