public class Department {
    //define attributes
    private int departmentId;
    private String name;
    private String manager;
    private String employees;

    //Getter and Setter Method

    //Getter
    public String getDepartmentId() {
        return String.valueOf(departmentId);
    }
    public String getName() {
        return name;
    }
    public String getManager() {
        return manager;
    }
    public String getEmployees() {
        return employees;
    }

    //Setter
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setManager(String manager) {
        this.manager = manager;
    }
    public void setEmployees(String employees) {
        this.employees = employees;
    }

    //parameterized constructor of Setter Method
    /*
    public Department(int departmentID, String name, String manager, String employees) {
        this.departmentId = departmentID;
        this.name = name;
        this.manager = manager;
        this.employees = employees;
    }*/
}