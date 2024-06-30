import java.util.Scanner;

public class BankingSystem {
 public static void main(String[] args) {
     try (Scanner input = new Scanner(System.in)) {
		Bank bank = new Bank();
		 int choice = 0;

		 while (choice != 2) {
		     System.out.println("----- WELCOME TO THE BANK -----");
		     System.out.println("PRESS 0 TO LOGIN");
		     System.out.println("PRESS 1 TO CREATE ACCOUNT");
		     System.out.println("PRESS 2 TO EXIT");
		     System.out.println("PRESS 3 TO LOGIN [ADMIN PANEL]");
		     choice = input.nextInt();
		     if (choice == 0) {
		         bank.login();
		     } else if (choice == 1) {
		         bank.createAccount();
		     } else if (choice == 3) {
		         bank.adminLogin();
		     } else if (choice == 2) {
		         System.out.println("HAVE A NICE DAY");
		         break;
		     }
		 }
	}
 }
}
