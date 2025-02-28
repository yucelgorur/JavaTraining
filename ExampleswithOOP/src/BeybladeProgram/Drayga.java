package BeybladeProgram;

public class Drayga extends Beyblade{

    private String monster;

    public Drayga(String player, int speed, int power,String monster) {
        super(player, speed, power);
        this.monster = monster;
    }

    @Override
    public void getMonster() {
        System.out.println(getPlayer() + " "+ monster + " "+ "ortaya çıkarıyor");
        System.out.println(getPlayer()+ " in saldırısı: Kaplan Pençesi");
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Kutsal Canavar Adı: " + monster);
    }
}
