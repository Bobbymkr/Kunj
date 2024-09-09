public class pr12 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Doe", 50000);
        Employee employee2 = new Employee("Jane", "Doe", 60000);

        System.out.println("Employee 1 yearly salary: " + employee1.getYearlySalary());
        System.out.println("Employee 2 yearly salary: " + employee2.getYearlySalary());

        employee1.setSalary(employee1.getSalary() * 1.1);
        employee2.setSalary(employee2.getSalary() * 1.1);

        System.out.println("Employee 1 yearly salary after raise: " + employee1.getYearlySalary());
        System.out.println("Employee 2 yearly salary after raise: " + employee2.getYearlySalary());
    }
}

class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            this.salary = 0;
        }
    }

    public double getYearlySalary() {
        return salary * 12;
    }
}