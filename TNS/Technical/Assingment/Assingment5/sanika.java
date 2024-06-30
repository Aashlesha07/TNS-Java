public class sanika extends TaxPayer {

    public sanika(double salary) {
        super(salary);
    }

    public double calculateTax() {
        return salary * 0.15;
    }
}
