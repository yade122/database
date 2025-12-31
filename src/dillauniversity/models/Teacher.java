package dillauniversity.models;

public class Teacher {
    private String teacherId;
    private String username;
    private String password;
    private String fullName;
    private String email;
    private String phone;
    private String department;
    private String qualification;
    private String officeNumber;
    private String officeHours;
    private String employmentDate;
    private String profileImagePath;
    private byte[] profilePhotoBytes;
    
    // Getters and Setters
    public String getTeacherId() { return teacherId; }
    public void setTeacherId(String teacherId) { this.teacherId = teacherId; }
    
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    
    public String getQualification() { return qualification; }
    public void setQualification(String qualification) { this.qualification = qualification; }
    
    public String getOfficeNumber() { return officeNumber; }
    public void setOfficeNumber(String officeNumber) { this.officeNumber = officeNumber; }
    
    public String getOfficeHours() { return officeHours; }
    public void setOfficeHours(String officeHours) { this.officeHours = officeHours; }
    
    public String getEmploymentDate() { return employmentDate; }
    public void setEmploymentDate(String employmentDate) { this.employmentDate = employmentDate; }
    
    public String getProfileImagePath() { return profileImagePath; }
    public void setProfileImagePath(String profileImagePath) { this.profileImagePath = profileImagePath; }

    public void setProfilePhotoBytes(byte[] photoBytes) {
        this.profilePhotoBytes = photoBytes;
    }

    public byte[] getProfilePhotoBytes() {
        return profilePhotoBytes;
    }

    public void setFirstName(String string) {
        if (string == null) {
            return;
        }
        String last = getLastName();
        if (last == null || last.isBlank()) {
            setFullName(string);
        } else {
            setFullName(string + " " + last);
        }
    }

    public void setLastName(String string) {
        if (string == null) {
            return;
        }
        String first = getFirstName();
        if (first == null || first.isBlank()) {
            setFullName(string);
        } else {
            setFullName(first + " " + string);
        }
    }

    public String getFirstName() {
        if (fullName == null) {
            return null;
        }
        String trimmed = fullName.trim();
        if (trimmed.isEmpty()) {
            return "";
        }
        int idx = trimmed.indexOf(' ');
        return idx == -1 ? trimmed : trimmed.substring(0, idx);
    }

    public String getLastName() {
        if (fullName == null) {
            return null;
        }
        String trimmed = fullName.trim();
        int idx = trimmed.indexOf(' ');
        return idx == -1 ? "" : trimmed.substring(idx + 1).trim();
    }
}