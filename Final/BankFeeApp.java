package Final;

/**
 * BankFeeApp applies each transaction, then charges a fee _per day_.
 * 
 * AOC2 is used in this program
 */
public class BankFeeApp {
    private static final double FEE_PER_TRANSACTION = 5.0;

    /**
     * Apply fees based on the number of transactions.
     * @param balance the initial balance before fees
     * @param transactionCount the number of transactions made
     * @return the balance after applying fees
     */
    public static double applyFees(double balance, int transactionCount) {
        return balance - (FEE_PER_TRANSACTION * transactionCount);
    }

    /**
     * Applies all transactions, then deducts fee per transaction.
     * @param transactions array of transaction amounts
     * @return final balance after applying all transactions and fees
     */
    public static double applyTransactions(double[] transactions) {
        double balance = 0.0;

        for (double amount : transactions) 
            _____
            
        return balance;
    }

    public static void main(String[] args) {
        double[] transactions = { 100.0, -20.0, 50.0 };

        double finalBalance = applyTransactions(transactions);
        System.out.printf("Final balance: %.2f%n", finalBalance);

        if (finalBalance == 115.0) {
            System.out.println("✅ All good — correct balance.");
        } else {
            System.err.printf("❌ Error: fee logic wrong (balance=%.2f)%n", finalBalance);
        }
    }
}
