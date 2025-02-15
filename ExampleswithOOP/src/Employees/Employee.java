package Employees;

public class Employee {

    private String name;
    private String surname;
    private int id;

    public Employee(String name, int id, String surname) {
        this.name = name;
        this.id = id;
        this.surname = surname;
    }

    public void showInformation(){
        System.out.println("Çalışan Bilgileri");
        System.out.println("Ad: " + name);
        System.out.println("Soyad: " + surname);
        System.out.println("id: " + id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
