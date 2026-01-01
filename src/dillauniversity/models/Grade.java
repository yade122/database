package dillauniversity.models;

import java.time.LocalDate;

public class Grade {
    private int gradeId;
    private String studentId;
    private String studentName;
    private String departmentCode;
    private String departmentName;
    private String courseCode;
    private String courseName;
    private String teacherId;
    private String teacherName;
    private String grade;
    private double totalMarks;
    private int assignmentMarks;
    private int midExamMarks;
    private int labExamMarks;
    private int finalExamMarks;
    private String semester;
    private String academicYear;
    private String comments;
    private LocalDate submissionDate;
    private boolean approvedByDean;
    
    // Getters and setters
    public int getGradeId() { return gradeId; }
    public void setGradeId(int gradeId) { this.gradeId = gradeId; }
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }
    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }
    public String getDepartmentCode() { return departmentCode; }
    public void setDepartmentCode(String departmentCode) { this.departmentCode = departmentCode; }
    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }
    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }
    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }
    public String getTeacherId() { return teacherId; }
    public void setTeacherId(String teacherId) { this.teacherId = teacherId; }
    public String getTeacherName() { return teacherName; }
    public void setTeacherName(String teacherName) { this.teacherName = teacherName; }
    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }
    public double getTotalMarks() { return totalMarks; }
    public void setTotalMarks(double totalMarks) { this.totalMarks = totalMarks; }
    public int getAssignmentMarks() { return assignmentMarks; }
    public void setAssignmentMarks(int assignmentMarks) { this.assignmentMarks = assignmentMarks; }
    public int getMidExamMarks() { return midExamMarks; }
    public void setMidExamMarks(int midExamMarks) { this.midExamMarks = midExamMarks; }
    public int getLabExamMarks() { return labExamMarks; }
    public void setLabExamMarks(int labExamMarks) { this.labExamMarks = labExamMarks; }
    public int getFinalExamMarks() { return finalExamMarks; }
    public void setFinalExamMarks(int finalExamMarks) { this.finalExamMarks = finalExamMarks; }
    public String getSemester() { return semester; }
    public void setSemester(String semester) { this.semester = semester; }
    public String getAcademicYear() { return academicYear; }
    public void setAcademicYear(String academicYear) { this.academicYear = academicYear; }
    public String getComments() { return comments; }
    public void setComments(String comments) { this.comments = comments; }
    public LocalDate getSubmissionDate() { return submissionDate; }
    public void setSubmissionDate(LocalDate submissionDate) { this.submissionDate = submissionDate; }
    public boolean isApprovedByDean() { return approvedByDean; }
    public void setApprovedByDean(boolean approvedByDean) { this.approvedByDean = approvedByDean; }
}