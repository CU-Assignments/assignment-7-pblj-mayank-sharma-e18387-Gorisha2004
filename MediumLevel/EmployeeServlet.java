import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class EmployeeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String employeeId = request.getParameter("id");
        
        if(employeeId != null && !employeeId.isEmpty()) {
            // Simulate fetching employee by ID from the database
            Employee employee = EmployeeDAO.getEmployeeById(employeeId);
            if(employee != null) {
                request.setAttribute("employees", employee);
            } else {
                request.setAttribute("message", "Employee not found.");
            }
        } else {
            List<Employee> employeeList = EmployeeDAO.getAllEmployees();
            request.setAttribute("employees", employeeList);
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("employeeList.html");
        dispatcher.forward(request, response);
    }
}
