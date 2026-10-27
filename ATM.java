public class ATM {
    private double balance = 5000.0;

    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient Balance");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        double balanceInput = 5000;
        double withdrawAmount = 6000;

        System.out.println("Enter balance: " + balanceInput);
        System.out.println("Enter amount to withdraw: " + withdrawAmount);

        try {
            atm.withdraw(withdrawAmount);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Transaction Completed");
        }
    }
}