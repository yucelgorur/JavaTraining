package BeybladeProgram;

public class Beyblade {

    private String player;
    private int speed;
    private int power;

    public Beyblade(String player, int speed, int power) {
        this.player = player;
        this.speed = speed;
        this.power = power;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public void attack(){
        System.out.println(player+ " "+ power + " ve " + speed + " ile saldırıyor.");
    }
    public void getMonster(){
        System.out.println("Bu bayblade'in kutsal canavarı bulunmuyor.");
    }
    public void showInformation(){
        System.out.println("Oyuncu: " + player);
        System.out.println("Saldırı Gücü : " + power);
        System.out.println("Dönüş Hızı: " + speed);
    }

}
