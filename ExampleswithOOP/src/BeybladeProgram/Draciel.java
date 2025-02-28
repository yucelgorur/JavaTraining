package BeybladeProgram;

public class Draciel extends Beyblade{

    private String monster;

    public Draciel(String player, int speed, int power,String monster) {
        super(player, speed, power);
        this.monster =  monster;
    }

    @Override
    public void getMonster() {
        System.out.println(getPlayer() + " "+ monster + " "+ "ortaya çıkarıyor");
        System.out.println(getPlayer()+ " in Savunması: Kale Savunması");
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Kutsal Canavar Adı: " + monster);
    }
}
