public class StudentAttendance {
    private String studentId;
    private String attendanceStatus;

    public StudentAttendance(String studentId, String attendanceStatus) {
        this.studentId = studentId;
        this.attendanceStatus = attendanceStatus;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getAttendanceStatus() {
        return attendanceStatus;
    }
}
