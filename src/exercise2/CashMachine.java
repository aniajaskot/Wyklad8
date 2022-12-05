package exercise2;

public class CashMachine {
    public static void main(String[] args) {
        Person person = new Person("Jan", "Kowalski", "12356789");
        try{
            BankAccount bankAccount = new BankAccount(null, 3000);
            System.out.println("Utworzono konto dla " + bankAccount.getPerson().getLastName());
            bankAccount.deposit(1000);
            System.out.println(bankAccount.getMoney());
            bankAccount.withdraw(10000);
        } catch (NullPointerException | IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }
}
