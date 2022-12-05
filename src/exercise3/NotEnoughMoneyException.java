package exercise3;

public class NotEnoughMoneyException extends RuntimeException {
    public NotEnoughMoneyException() {
        super("Nie masz tyle środków");
    }
}
