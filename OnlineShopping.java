class MinimumAmountException extends Exception {
    public MinimumAmountException(String message) {
        super(message);
    }
}

public class OnlineShopping {
    public void placeOrder(int amount) throws MinimumAmountException {
        if (amount < 500) {
            throw new MinimumAmountException("Minimum cart value must be  500");
        }
        System.out.println("Order placed successfully for amount: ₹" + amount);
    }

    public static void main(String[] args) {
        OnlineShopping os = new OnlineShopping();
        int cartAmount = 300;

        System.out.println("Enter cart amount: " + cartAmount);

        try {
            os.placeOrder(cartAmount);
        } catch (MinimumAmountException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}