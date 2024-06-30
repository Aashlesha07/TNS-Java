public class sankalp extends TaxPayer {

    public sankalp(double salary) {
        super(salary);
    }

    public double calculateTax() {
        if (salary <= 50000) {
            return salary * 0.10;
        } else {
            return salary * 0.20;
        }
    }
}
