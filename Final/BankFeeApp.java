package v4;

/**
 * BankFeeApp applies each transaction, then charges a fee _per day_.
 * 
 * AOC2 is used in this program
 */
public class BankFeeApp {
    private static final double FEE_PER_TRANSACTION = 5.0;

    /**
     * Apply fees based on the number of transactions.
     */
    public static double applyFees(double balance, int _____) {
        return balance - (_____ * transactionCount);
    }

    /**
     * Applies all transactions, then deducts fee per transaction.
     */
    public static double applyTransactions(double[] transactions) {
        double _____ = 0.0;

        for (double amount : transactions) 
            _____
            applyFees(balance, transactions.length);
            
        return balance;
    }

    public static void main(String[] args) {
        double[] transactions = { 100.0, -20.0, 50.0 };

        double finalBalance = applyTransactions(_____);
        System.out.printf("Final balance: %.2f%n", finalBalance);

        if (_____ == 115.0) {
            System.out.println("✅ All good — correct balance.");
        } else {
            System.err.printf("❌ Error: fee logic wrong (balance=%.2f)%n", _____);
        }
    }
}
