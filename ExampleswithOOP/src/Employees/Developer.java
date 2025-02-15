package Employees;

public class Developer extends Employee{

    private  String programmingLangues;
    public Developer(String name, int id, String surname, String programmingLangues) {
        super(name, id, surname);
        this.programmingLangues = programmingLangues;
    }
    public void formatAt(String isletim_sistemi){
        System.out.println(getName()+" "+ isletim_sistemi + "'ni yüklüyor.");
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Yazılımcının bildiği diller:" + programmingLangues);
    }
}
