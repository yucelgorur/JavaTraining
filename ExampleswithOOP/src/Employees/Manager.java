package Employees;

public class Manager extends Employee{
    private int numberofPeopleinTeam;

    public Manager(String name, int id, String surname, int numberofPeopleinTeam) {
        super(name, id, surname);
        this.numberofPeopleinTeam = numberofPeopleinTeam;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı: " + numberofPeopleinTeam);
    }
    public void getRaise(int raiseAmount){
        System.out.println(getName() + " çalışanlara " +raiseAmount+ " yapıldı.");
    }
}
