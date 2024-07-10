package HMS;

public class Employee {
    // Attributes
    private String employeeId;
    private static int idIndex = 100;

    private String name;
    private String position;
    private String department;
    private int salary;

    // Constructor
    public Employee(String name, String position, String department, int salary) {
        employeeId = generateEmployeeID();
        this.name = name;
        this.position = position;
        this.department = department;
        this.salary = salary;

        idIndex++;
    }

    // Associated methods
    // (EMPL)(3 digit)
    private String generateEmployeeID() {
        return "EMPL" + idIndex;
    }

    // Getters and setters
    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Display
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
