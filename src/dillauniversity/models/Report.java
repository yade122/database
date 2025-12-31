package dillauniversity.models;

public class Report {
    private String date;
    private String type;
    private String title;
    private String status;
    private String response;
    
    public Report(String date, String type, String title, String status, String response) {
        this.date = date;
        this.type = type;
        this.title = title;
        this.status = status;
        this.response = response;
    }
    
    // Getters
    public String getDate() { return date; }
    public String getType() { return type; }
    public String getTitle() { return title; }
    public String getStatus() { return status; }
    public String getResponse() { return response; }
    
    // Setters
    public void setDate(String date) { this.date = date; }
    public void setType(String type) { this.type = type; }
    public void setTitle(String title) { this.title = title; }
    public void setStatus(String status) { this.status = status; }
    public void setResponse(String response) { this.response = response; }
}