import java.util.Date;

public class Attendance {
    //define attributes
    private int attendanceId;
    private int employeeId;
    private Date date;
    private String status;

    //Getter and Setter Method

    // Getter Method
    public String getAttendanceId() {
        return String.valueOf(attendanceId);
    }
    public String getEmployeeID() {
        return String.valueOf(employeeId);
    }
    public Date getDate() {
        return date;
    }
    public String getStatus() {
        return status;
    }

    //Setter
    public void setAttendanceId(int attendanceId){
        this.attendanceId = attendanceId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    //Setter method using parameterized constructor
    public Attendance(int attendanceId, int employeeId, Date date, String status){
        this.attendanceId = attendanceId;
        this.employeeId = employeeId;
        this.date = date;
        this.status = status;
    }
}