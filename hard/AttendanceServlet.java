import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class AttendanceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentId = request.getParameter("studentId");
        String attendanceStatus = request.getParameter("attendanceStatus");
        
        // Save the attendance data (simulated for now)
        StudentAttendance studentAttendance = new StudentAttendance(studentId, attendanceStatus);
        boolean success = StudentAttendanceDAO.saveAttendance(studentAttendance);
        
        if(success) {
            request.setAttribute("message", "Attendance recorded successfully.");
        } else {
            request.setAttribute("message", "Error recording attendance.");
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("attendance-success.jsp");
        dispatcher.forward(request, response);
    }
}
