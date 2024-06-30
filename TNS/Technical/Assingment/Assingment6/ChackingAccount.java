class CheckingAccount extends Account {
    private static final int OVERDRAFT_LIMIT = -500; // Overdraft limit of 500
    
    public CheckingAccount(String name, int password, int age, String gender, long phone, int balance) {
       super(name, password, age, gender, phone, balance);
    }
    
    @Override
    public void deposit(int amount) {
       balance += amount;
       System.out.println("Amount deposited: " + amount);
    }
    
    @Override
    public void withdraw(int amount) {
       if (balance - amount >= OVERDRAFT_LIMIT) {
           balance -= amount;
           System.out.println("Amount withdrawn: " + amount);
       } else {
           System.out.println("Overdraft limit reached");
       }
    }
    
    @Override
    public int getBalance() {
       return balance;
    }
    }
