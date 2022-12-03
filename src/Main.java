public class Main {
    public static final Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {
        EMPLOYEES[0] = new Employee("Ivanov Ivan Ivanovich", 1, 100_000);
        EMPLOYEES[1] = new Employee("Ivanov Igor Ivanovich", 2, 110_000);
        EMPLOYEES[2] = new Employee("Ivanov Petr Ivanovich", 3, 120_000);
        EMPLOYEES[3] = new Employee("Ivanov Afanasiy Ivanovich", 4, 100_000);
        //EMPLOYEES[9] = new Employee("Ivanov Sergey Ivanovich", 5, 110_000);
        //EMPLOYEES[5] = new Employee("Ivanov Viktor Ivanovich", 1, 120_000);
        //EMPLOYEES[6] = new Employee("Ivanova Mariya Ivanovna", 2, 100_000);
        //EMPLOYEES[7] = new Employee("Ivanov Pavel Ivanovich", 3, 110_000);
        EMPLOYEES[8] = new Employee("Ivanov Mikhail Ivanovich", 4, 120_000);
        EMPLOYEES[4] = new Employee("Ivanov Igor Ivanovich", 5, 130_000);
        printFullinfo();
        System.out.println("ЗП всех сотрудников в месяц: " + salarySumm());
        Employee employeeWithMinSalary = findEmployeeWithMinSalary();
        System.out.println("Сотрудник c минимальной ЗП: " + employeeWithMinSalary);
        Employee employeeWithMaxSalary = findEmployeeWithMaxSalary();
        System.out.println("Сотрудник c максимальной ЗП: " + employeeWithMaxSalary);
        System.out.println("Средняя зарплата в компании: " + salaryMedium());
        printFullNames();
    }

    private static void printFullinfo() {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    private static Employee findEmployeeWithMinSalary() {
        int minSalary = Integer.MAX_VALUE;
        Employee employeeWithMinSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    private static Employee findEmployeeWithMaxSalary() {
        int maxSalary = Integer.MIN_VALUE;
        Employee employeeWithMaxSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    private static int salarySumm() {
        int summ = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                summ = summ + employee.getSalary();
            }
        }
        return summ;
    }

    private static float salaryMedium() {
        int people = 0;
        float salaryMed;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                people++;
            }
        }
        if (people != 0) {
            salaryMed = salarySumm() / people;
        } else {
            salaryMed = 0;

        }
        return salaryMed;
    }
    private static void printFullNames() {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}