<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Attendance</title>
</head>
<body>
    <h2>Student Attendance</h2>
    <form action="AttendanceServlet" method="post">
        <label for="studentId">Student ID:</label>
        <input type="text" id="studentId" name="studentId" required><br><br>
        
        <label for="attendanceStatus">Attendance Status:</label>
        <select id="attendanceStatus" name="attendanceStatus" required>
            <option value="Present">Present</option>
            <option value="Absent">Absent</option>
        </select><br><br>
        
        <input type="submit" value="Submit Attendance">
    </form>
</body>
</html>
