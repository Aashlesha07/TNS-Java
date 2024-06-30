public class Main {
    public static void main(String[] args) {
        // Creating an object of Student to trigger the default constructor
        Student student = new Student();

        // Creating an object of Commission
        Commission commission = new Commission();

        // Accepting details of the sales employee
        commission.acceptDetails();

        // Displaying the details and commission
        commission.displayDetails();
    }
}
