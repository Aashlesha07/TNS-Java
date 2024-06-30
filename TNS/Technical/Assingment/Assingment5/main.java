import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary for sanika: ");
        double sanikaSalary = scanner.nextDouble();
        TaxPayer sanika = new sanika(sanikaSalary);
        
        System.out.print("Enter your salary for sankalp: ");
        double sankalpSalary = scanner.nextDouble();
        TaxPayer sankalp = new sankalp(sankalpSalary);

        System.out.println("Tax calculation by sanika:");
        sanika.displayTax();

        System.out.println("Tax calculation by sankalp:");
        sankalp.displayTax();

        scanner.close();
    }
}
