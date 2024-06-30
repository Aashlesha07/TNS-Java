import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Bank class to demonstrate the usage of static 
class Bank {
private static int totalAccounts = 0;
private Account[] accounts = new Account[100];
public static List<String> accountIssue = new ArrayList<>();
private int accountIndex = 0;
private Scanner sc = new Scanner(System.in);

public static int getTotalAccounts() {
   return totalAccounts;
}

public void createAccount() {
   System.out.println("ENTER YOUR NAME");
   String name = sc.next();
   System.out.println("ENTER YOUR PASSWORD");
   int password = sc.nextInt();
   System.out.println("ENTER YOUR AGE");
   int age = sc.nextInt();
   System.out.println("ENTER GENDER ");
   String gender = sc.next();
   System.out.println("ENTER PHONE NUMBER");
   long phone = sc.nextLong();
   System.out.println("ENTER INITIAL AMOUNT TO DEPOSIT");
   int balance = sc.nextInt();

   System.out.println("SELECT ACCOUNT TYPE (1: Savings, 2: Checking)");
   int type = sc.nextInt();
   Account account;
   if (type == 1) {
       account = new SavingsAccount(name, password, age, gender, phone, balance);
   } else {
       account = new CheckingAccount(name, password, age, gender, phone, balance);
   }

   accounts[accountIndex] = account;
   account.transactionId = accountIndex;
   totalAccounts++;
   accountIndex++;
   System.out.println("YOUR TRANSACTION ID is " + account.transactionId);
   System.out.println("YOUR ACCOUNT HAS BEEN SUCCESSFULLY CREATED");
}

public void login() {
   System.out.println("ENTER YOUR USERNAME");
   String name = sc.next();
   System.out.println("ENTER YOUR PASSWORD");
   int password = sc.nextInt();
   System.out.println("ENTER YOUR TRANSACTION ID");
   int transactionId = sc.nextInt();

   if (transactionId < accountIndex && accounts[transactionId] != null) {
       Account account = accounts[transactionId];
       if (account.isBlock) {
           System.out.println("IT LOOKS LIKE YOUR ACCOUNT HAS BEEN BLOCKED. CONTACT ADMIN.");
       } else if (account.getName().equals(name) && account.getPassword() == password) {
           System.out.println("CONGRATULATIONS! YOU HAVE SUCCESSFULLY LOGGED IN.");
           System.out.println("YOUR NAME IS " + account.getName());
           transaction(account);
       } else {
           System.out.println("INVALID CREDENTIALS");
       }
   } else {
       System.out.println("INVALID TRANSACTION ID");
   }
}

public void transaction(Account account) {
   Transaction transaction = new Transaction();
   int choice = 0;
   while (choice != 4) {
       System.out.println(
               "PRESS 0 TO CHECK ACCOUNT BALANCE\nPRESS 1 TO DEPOSIT\nPRESS 2 TO WITHDRAW\nPRESS 3 TO GET DETAIL\nPRESS 4 TO EXIT\nPRESS 5 TO SEND MONEY\nPRESS 6 TO CHECK MESSAGE\nPRESS 7 TO REGISTER ISSUE RELATED TO YOUR ACCOUNT");
       choice = sc.nextInt();
       switch (choice) {
           case 0:
               System.out.println("ACCOUNT BALANCE IS " + account.getBalance());
               break;
           case 1:
               System.out.println("ENTER AMOUNT TO BE DEPOSITED");
               int depositAmount = sc.nextInt();
               account.deposit(depositAmount);
               System.out.println("ACCOUNT BALANCE IS " + account.getBalance());
               break;
           case 2:
               System.out.println("ENTER THE AMOUNT TO WITHDRAW");
               int withdrawAmount = sc.nextInt();
               account.withdraw(withdrawAmount);
               System.out.println("ACCOUNT BALANCE IS " + account.getBalance());
               break;
           case 3:
               account.getDetail();
               break;
           case 4:
               System.out.println("THANK YOU FOR USING OUR SERVICES");
               break;
           case 5:
               sendMoney(account, transaction);
               break;
           case 6:
               messageReader(account);
               break;
           case 7:
               transactionIssues(account);
               break;
       }
   }
}

public void showUserIssues() {
	 if(accountIssue.isEmpty()) 
		 System.out.println("NO ISSUES REPORTED");
	 else{
		 System.out.println("THE FOLLOWING IS THE USER ISSUES");
		 accountIssue.forEach(System.out::println);
	 }
}

public void sendMoney(Account fromAccount, Transaction transaction) {
   System.out.println("ENTER THE RECIPIENT'S TRANSACTION ID ");
   int recipientId = sc.nextInt();
   System.out.println("ENTER THE AMOUNT YOU WANT TO SEND");
   int amount = sc.nextInt();

   if (recipientId < accountIndex && accounts[recipientId] != null) {
       Account toAccount = accounts[recipientId];
       transaction.performTransaction(fromAccount, toAccount, amount);
   } else {
       System.out.println("INVALID RECIPIENT TRANSACTION ID");
   }
}

public void messageReader(Account account) {
   if (account.messageReader == 0) {
       System.out.println("NO NEW MESSAGES TO SHOW");
   } else {
       System.out.println(account.message);
   }
   account.messageReader = 0;
}

public void transactionIssues(Account account) {
   System.out.println("WHAT'S YOUR ISSUE?");
   sc.nextLine();
   String issues = sc.nextLine();
   Bank.accountIssue.add("TRANSCATION ID : " + account.transactionId + "\tmessage : " +issues);
   System.out.println("WE ARE SORRY FOR THE INCONVENIENCE. WE WILL LOOK INTO YOUR ISSUE.");
}

public void adminPanel() {
   int choice = 0;
   while (choice != 5) {
       System.out.println(
               "PRESS 0 TO SEE ACCOUNT LIST\nPRESS 1 TO SEARCH ACCOUNT WITH TRANSACTION ID\nPRESS 3 TO BLOCK ACCOUNT\nPRESS 4 TO UNBLOCK BANK ACCOUNT\nPRESS 5 TO EXIT\nPRESS 6 TO CHECK CUSTOMER'S ISSUE");
       choice = sc.nextInt();
       switch (choice) {
           case 0:
               System.out.println("THE NAME OF ACCOUNT HOLDERS IN THE BANK ARE:");
               for (int i = 0; i < accountIndex; i++) {
                   System.out.println(accounts[i].getName());
               }
               break;
           case 1:
               System.out.println("ENTER THE TRANSACTION ID");
               int transactionId = sc.nextInt();
               accounts[transactionId].getDetail();
               break;
           case 3:
               System.out.println("ENTER THE TRANSACTION ID YOU WANT TO BLOCK");
               transactionId = sc.nextInt();
               accounts[transactionId].isBlock = true;
               System.out.println("SUCCESSFULLY BLOCKED");
               break;
           case 4:
               System.out.println("ENTER THE TRANSACTION ID YOU WANT TO UNBLOCK");
               transactionId = sc.nextInt();
               accounts[transactionId].isBlock = false;
               System.out.println("SUCCESSFULLY UNBLOCKED");
               break;
           case 5:
               System.out.println("BYE ADMIN, SEE YOU SOON");
               break;
           case 6:
          	 showUserIssues();
               break;
       }
   }
}

public void adminLogin() {
   System.out.println("ENTER YOUR NAME");
   String name = sc.next();
   System.out.println("ENTER SIX DIGIT ADMIN PASSWORD");
   int password = sc.nextInt();
   if (name.equals("ADMIN") && password == 123456) {
       System.out.println("WELCOME ADMIN, NICE TO SEE YOU BACK.");
       adminPanel();
   } else {
       System.out.println("ADMIN CREDENTIALS MISMATCH. TRY AGAIN.");
   }
}
}
