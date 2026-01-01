package dillauniversity.models;

import java.time.LocalDate;

public class Dean {
    private String deanId;
    private int userId;
    private String teacherId;
    private String departmentCode;
    private String departmentName;
    private String fullName;
    private String email;
    private String phone;
    private LocalDate appointmentDate;
    private LocalDate termEndDate;
    private String officeLocation;
    private String deanType; // "College Dean", "Department Dean", "Academic Dean"
    private String status; // "Active", "On Leave", "Retired"
    
    // Constructors
    public Dean() {}
    
    public Dean(String deanId, int userId, String teacherId, String departmentCode, 
                String fullName, String email, String phone) {
        this.deanId = deanId;
        this.userId = userId;
        this.teacherId = teacherId;
        this.departmentCode = departmentCode;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.appointmentDate = LocalDate.now();
        this.status = "Active";
        this.deanType = "Department Dean";
    }
    
    // Getters and Setters
    public String getDeanId() { return deanId; }
    public void setDeanId(String deanId) { this.deanId = deanId; }
    
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    
    public String getTeacherId() { return teacherId; }
    public void setTeacherId(String teacherId) { this.teacherId = teacherId; }
    
    public String getDepartmentCode() { return departmentCode; }
    public void setDepartmentCode(String departmentCode) { this.departmentCode = departmentCode; }
    
    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }
    
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    
    public LocalDate getAppointmentDate() { return appointmentDate; }
    public void setAppointmentDate(LocalDate appointmentDate) { this.appointmentDate = appointmentDate; }
    
    public LocalDate getTermEndDate() { return termEndDate; }
    public void setTermEndDate(LocalDate termEndDate) { this.termEndDate = termEndDate; }
    
    public String getOfficeLocation() { return officeLocation; }
    public void setOfficeLocation(String officeLocation) { this.officeLocation = officeLocation; }
    
    public String getDeanType() { return deanType; }
    public void setDeanType(String deanType) { this.deanType = deanType; }
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public byte[] getProfilePhotoBytes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setUsername(String username) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setProfilePhotoBytes(byte[] photoBytes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}