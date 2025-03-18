import java.util.*;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee {" + "name='" + name + '\'' + ", age=" + age + ", salary=" + salary + '}';
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Aksh", 25, 50000),
                new Employee("Bhavya", 30, 60000),
                new Employee("Rishu", 22, 40000),
                new Employee("Hardik", 35, 70000)
        );

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose sorting criteria: 1. Salary 2. Age 3. Name");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                employees.sort(Comparator.comparingDouble(Employee::getSalary));
                break;
            case 2:
                employees.sort(Comparator.comparingInt(Employee::getAge));
                break;
            case 3:
                employees.sort(Comparator.comparing(Employee::getName));
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("Sorted Employees: " + employees);
    }
}