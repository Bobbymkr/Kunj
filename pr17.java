public class pr17 {
    public static void main(String[] args) {
        Member member = new Member("John", 30, "1234567890", "New York", 50000);
        Employee employee = new Employee("John", 30, "1234567890", "New York", 50000, "Software Engineer");
        Manager manager = new Manager("John", 30, "1234567890", "New York", 50000, "IT");

        member.printSalary();
        employee.printSalary();
        manager.printSalary();
    }
}

class Member {
    protected String name;
    protected int age;
    protected String phoneNumber;
    protected String address;
    protected double salary;

    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    private String specialization;

    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Member {
    private String department;

    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}