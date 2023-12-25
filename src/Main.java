public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        // Добавление сотрудников напрямую в массив
        employees[0] = new Employee("Employee 1", 1, 3000);
        employees[1] = new Employee("Employee 2", 2, 3500);
        // Добавление остальных сотрудников по аналогии

        // Выполнение операций
        listEmployees();
        System.out.println("Total Salary: " + totalSalaries());
        System.out.println("Employee with Min Salary: " + minSalaryEmployee());
        System.out.println("Employee with Max Salary: " + maxSalaryEmployee());
        System.out.println("Average Salary: " + averageSalary());
        listFullNames();
    }

    public static void listEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static double totalSalaries() {
        double total = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                total += employee.getSalary();
            }
        }
        return total;
    }

    public static Employee minSalaryEmployee() {
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary())) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee maxSalaryEmployee() {
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary())) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public static double averageSalary() {
        double total = totalSalaries();
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            }
        }
        return count > 0 ? total / count : 0;
    }

    public static void listFullNames( ) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}
