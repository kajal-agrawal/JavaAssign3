class BankTransaction extends Thread {
    private String name;
    private int amount;

    public BankTransaction(String name, int amount, int priority) {
        this.name = name;
        this.amount = amount;
        setPriority(priority);
    }

    @Override
    public void run() {
        if (getPriority() == Thread.MAX_PRIORITY) {
            System.out.println("High-value transaction processed first");
        } else {
            System.out.println("Low-value transaction processed later");
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        System.out.println("Transaction1: ₹5000");
        System.out.println("Transaction2: ₹50000");

        BankTransaction lowValue = new BankTransaction("Transaction1", 5000, Thread.MIN_PRIORITY);
        BankTransaction highValue = new BankTransaction("Transaction2", 50000, Thread.MAX_PRIORITY);

        highValue.start();
        lowValue.start();
    }
}