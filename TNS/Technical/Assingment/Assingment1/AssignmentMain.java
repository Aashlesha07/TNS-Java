import employees.Developer;
import employees.Manager;
import utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 1001, 95000, "HR");
        Developer developer = new Developer("Bob", 1002, 90000, "Java");

        EmployeeUtilities.printEmployeeDetails(manager);
        System.out.println();
        EmployeeUtilities.printEmployeeDetails(developer);
    }
}
