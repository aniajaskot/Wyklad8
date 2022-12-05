package exercise3;

public class CashMachine {
    public static void main(String[] args) {
        Person person = new Person("Jan", "Kowalski", "12356789");
        try{
            BankAccount bankAccount = new BankAccount(person, 300);
            System.out.println("Utworzono konto dla " + bankAccount.getPerson().getLastName());
            bankAccount.deposit(100);
            System.out.println(bankAccount.getMoney());
            bankAccount.withdraw(500);
        } catch (MaximumWithdrawalExceededException | NotEnoughMoneyException | NullPointerException e){
            System.err.println(e.getMessage());
        }
    }
}
