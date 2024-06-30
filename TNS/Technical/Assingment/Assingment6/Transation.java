final class Transaction {
private static final int transactionFee = 50; // Fixed fee for each transaction

public final void performTransaction(Account from, Account to, int amount) {
   if (from.getBalance() >= amount + transactionFee) {
       from.withdraw(amount + transactionFee);
       to.deposit(amount);
       System.out.println("Transaction successful. Fee applied: " + transactionFee);
   } else {
       System.out.println("Insufficient balance for the transaction including fee.");
   }
}
}
