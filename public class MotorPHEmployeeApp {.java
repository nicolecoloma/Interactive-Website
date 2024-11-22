public class MotorPHEmployeeApp {
    private String instance;
    private String employees;
    private String departments;
    private String payrolls;
    private String attendance;

    //Getter and Setter

    //Getter Method
    public String getInstance() {
        return instance;
    }
    public String getEmployees() {
        return employees;
    }
    public String getDepartments() {
        return departments;
    }
    public String getPayrolls() {
        return payrolls;
    }
    public String getAttendance() {
        return attendance;
    }

    //Setter
    public void setInstance(String instance) {
        this.instance = instance;
    }
    public void setEmployees(String employees) {
        this.employees = employees;
    }
    public void setDepartments(String departments) {
        this.departments = departments;
    }
    public void setPayrolls(String payrolls) {
        this.payrolls = payrolls;
    }
    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    //Setter method using parameterized constructor
    public MotorPHEmployeeApp (String instance, String employees, String departments, String payrolls, String attendance){
        this.instance = instance;
        this.employees = employees;
        this.departments = departments;
        this.payrolls = payrolls;
        this.attendance = attendance;
    }

}
