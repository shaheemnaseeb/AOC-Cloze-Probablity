package v3;

/**
 * BankFeeApp applies each transaction, then charges a fee _per transaction_.
 * 
 * AOC2 is used in this program
 */
public class BankFeeApp {
    public static void main(String[] args) {
        ______ fee = 5.0;
        double[] transactions = { 100.0, -20.0, 50.0 };
        double ______ = 0.0;

        // apply each transaction
        for (double amount : ______)
        ______
        
        // deduct fee for each transaction
        for (int i = 0; i < ______; i++) {
            balance -= ______
        }

        System.out.printf("Final balance: %.2f%n", balance);

        if (______ == 115.0) {
            System.out.println("✅ All good — correct balance.");
        } else {
            System.err.printf("❌ Error: fee logic wrong (balance=%.2f)%n", balance);
        }
    }
}
