public class Employee {
    //define attributes
    private int employeeId;
    private String name;
    private String address;
    private double salary;

    //Getter and Setter Method

    //Getter
    public String getEmployeeId() {
        return String.valueOf(employeeId);
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getSalary() {
        return String.valueOf(salary);
    }

    //Setter Method
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    //setter method using parameterized constructor
    public Employee(int employeeId, String name, String address, double salary){
        this.employeeId = employeeId;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
}