package exercise2;

public class BankAccount {
    private Person person;
    private double money;

    public BankAccount(Person person, double money) {
        if(person == null){
            throw new NullPointerException("Konto bankowe musi mieć właściciela");
        }
        this.person = person;
        this.money = money;
    }

    void deposit(double additionalMoney){
        money += additionalMoney;
    }

    void withdraw(double amount){
        if(money < amount){
            throw new IllegalArgumentException("Nie masz tylu środków");
        }
        money -= amount;
    }

    public Person getPerson() {
        return person;
    }

    public double getMoney() {
        return money;
    }
}
