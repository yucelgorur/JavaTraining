package BeybladeProgram;

public class Dragon extends Beyblade{

    private String monster;
    private String skill;

    public Dragon(String player, int speed, int power,String monster,String skill) {
        super(player, speed, power);
        this.monster = monster;
        this.skill = skill;
    }
    @Override
    public void getMonster() {
        System.out.println(getPlayer() + " "+ monster + " "+ "ortaya çıkarıyor");
        System.out.println(getPlayer()+ " in Saldırısı: Hayalet Kasırgası");

    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Kutsal Canavar Adı: " + monster);
        System.out.println("Gizli Yetenek: " + skill);
    }


}
