public abstract class TaxPayer {
    protected double salary;

    public TaxPayer(double salary) {
        this.salary = salary;
    }

    public abstract double calculateTax();

    public void displayTax() {
        System.out.println("The tax to be paid is: " + calculateTax());
    }
}
