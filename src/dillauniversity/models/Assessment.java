package dillauniversity.models;

public class Assessment {
    private String studentId;
    private String courseCode;
    private String assessmentType;
    private double score;
    private double maxScore;
    private String semester;
    private String academicYear;
    private String teacherId;
    
    // Constructor
    public Assessment(String studentId, String courseCode, String assessmentType, 
                     double score, double maxScore, String semester, 
                     String academicYear, String teacherId) {
        this.studentId = studentId;
        this.courseCode = courseCode;
        this.assessmentType = assessmentType;
        this.score = score;
        this.maxScore = maxScore;
        this.semester = semester;
        this.academicYear = academicYear;
        this.teacherId = teacherId;
    }
    
    // Getters and setters
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }
    
    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }
    
    public String getAssessmentType() { return assessmentType; }
    public void setAssessmentType(String assessmentType) { this.assessmentType = assessmentType; }
    
    public double getScore() { return score; }
    public void setScore(double score) { this.score = score; }
    
    public double getMaxScore() { return maxScore; }
    public void setMaxScore(double maxScore) { this.maxScore = maxScore; }
    
    public String getSemester() { return semester; }
    public void setSemester(String semester) { this.semester = semester; }
    
    public String getAcademicYear() { return academicYear; }
    public void setAcademicYear(String academicYear) { this.academicYear = academicYear; }
    
    public String getTeacherId() { return teacherId; }
    public void setTeacherId(String teacherId) { this.teacherId = teacherId; }
}