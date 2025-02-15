package ATM;

public class Account {

    private String userName;
    private String pass;
    private int balance;

    public Account(String userName, String pass, int balance) {
        this.userName = userName;
        this.pass = pass;
        this.balance = balance;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void addMoney(int amount){
        this.balance += amount;
        System.out.println("New balance: "+this.balance);
    }
    public void withDrawal(int amount){

        if((balance - amount) < 0){
            System.out.println("insufficient account balance! Balance is: " + balance );
        }else {
            this.balance -= amount;
            System.out.println("New balance: "+this.balance);
        }

    }


}