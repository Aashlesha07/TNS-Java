class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.04; // 4% annual interest rate
    
    public SavingsAccount(String name, int password, int age, String gender, long phone, int balance) {
       super(name, password, age, gender, phone, balance);
    }
    
    @Override
    public void deposit(int amount) {
       balance += amount;
       System.out.println("Amount deposited: " + amount);
    }
    
    @Override
    public void withdraw(int amount) {
       if (balance >= amount) {
           balance -= amount;
           System.out.println("Amount withdrawn: " + amount);
       } else {
           System.out.println("Insufficient balance");
       }
    }
    
    @Override
    public int getBalance() {
       return balance;
    }
    
    public void applyYearlyInterest() {
       balance += balance * INTEREST_RATE;
       System.out.println("Yearly interest applied. New balance: " + balance);
    }
    }
