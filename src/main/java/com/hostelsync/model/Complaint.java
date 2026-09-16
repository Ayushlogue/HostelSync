package com.hostelsync.model;

public class Complaint {

    private int id;
    private int studentId;
    private String title;
    private String description;
    private String category;
    private String priority;
    private ComplaintStatus status;

    public Complaint(int id, int studentId, String title,
                     String description, String category,
                     String priority, ComplaintStatus status) {
        this.id = id;
        this.studentId = studentId;
        this.title = title;
        this.description = description;
        this.category = category;
        this.priority = priority;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getPriority() {
        return priority;
    }

    public ComplaintStatus getStatus() {
        return status;
    }

    public void setStatus(ComplaintStatus status) {
        this.status = status;
    }
}