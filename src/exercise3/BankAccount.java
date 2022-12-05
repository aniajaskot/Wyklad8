package exercise3;

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
        if(amount > 1000){
            throw new MaximumWithdrawalExceededException("Przekroczono maksymalną kwotę wypłaty");
        }
        if(money < amount){
            throw new NotEnoughMoneyException();
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
