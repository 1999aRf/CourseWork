public class Main {
    public static void main(String[] args) {
        Employee.addEmployee(new Employee("Employee 1", 1, 3000), 0);
        Employee.addEmployee(new Employee("Employee 2", 2, 3500), 1);
        // Можно добавить больше сотрудников аналогичным образом

        Employee.listEmployees();
        System.out.println("Total Salary: " + Employee.totalSalaries());
        System.out.println("Employee with Min Salary: " + Employee.minSalaryEmployee());
        System.out.println("Employee with Max Salary: " + Employee.maxSalaryEmployee());
        System.out.println("Average Salary: " + Employee.averageSalary());
        Employee.listFullNames();
    }
}