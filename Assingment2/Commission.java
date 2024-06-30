import java.util.Scanner;

public class Commission {
    private String Name;
    private String Address;
    private String Phone;
    private double Sales_amount;

    // Method to accept details of the sales employee
    public void acceptDetails() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Name: ");
            Name = scanner.nextLine();
            System.out.print("Enter Address: ");
            Address = scanner.nextLine();
            System.out.print("Enter Phone: ");
            Phone = scanner.nextLine();
            System.out.print("Enter Sales Amount: ");
            Sales_amount = scanner.nextDouble();
        }
    }

    // Method to calculate the commission
    public void calculateCommission() {
        double commission = 0;
        if (Sales_amount >= 100000) {
            commission = 0.10 * Sales_amount;
        } else if (Sales_amount >= 50000 && Sales_amount < 100000) {
            commission = 0.05 * Sales_amount;
        } else if (Sales_amount >= 30000 && Sales_amount < 50000) {
            commission = 0.03 * Sales_amount;
        } else {
            commission = 0;
        }
        System.out.println("The commission is: " + commission);
    }

    // Method to display employee details and commission
    public void displayDetails() {
        System.out.println("Sales Employee Details:");
        System.out.println("Name: " + Name);
        System.out.println("Address: " + Address);
        System.out.println("Phone: " + Phone);
        System.out.println("Sales Amount: " + Sales_amount);
        calculateCommission();
    }
}