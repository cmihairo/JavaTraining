package problem3;

public class EmployeeTest {
    public static void main(String []args) {

        Employee employee1 = new Employee("Dumitriu", "Claudia", 100.562);
        Employee employee2 = new Employee("Stan", "Vlad", 50.458);
        double raiseEmployee1 = (0.1 * employee1.getMonthlySalary()) + employee1.getMonthlySalary();
        double raiseEmployee2 = (0.1 * employee2.getMonthlySalary()) + employee2.getMonthlySalary();

        System.out.println("Monthly salary for employee1 = " + employee1.getMonthlySalary());
        System.out.println("Monthly salary for employee2 = " + employee2.getMonthlySalary());

        System.out.println("10 % raise for employee1 = " + raiseEmployee1);
        System.out.println("10 % raise for employee2 = " + raiseEmployee2);
    }
}
