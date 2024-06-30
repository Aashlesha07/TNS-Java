abstract class Account {
    protected int balance;
    protected long phone;
    protected String gender;
    protected String name;
    protected int password;
    protected int age;
    protected boolean isBlock = false;
    protected String message;
    protected byte messageReader = 0;
    protected int transactionId;
    
    public Account(String name, int password, int age, String gender, long phone, int balance) {
       this.name = name;
       this.password = password;
       this.age = age;
       this.gender = gender;
       this.phone = phone;
       this.balance = balance;
    }
    
    public abstract void deposit(int amount);
    public abstract void withdraw(int amount);
    public abstract int getBalance();
    
    public void getDetail() {
       System.out.println("ACCOUNT HOLDER NAME : " + name + "\nAGE : " + age + "\nGENDER : " + gender + "\nPHONE NUMBER : " + phone);
    }
    
    public String getName() {
       return name;
    }
    
    public int getPassword() {
       return password;
    }
    }