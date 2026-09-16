package com.hostelsync.model;

public class MaintenanceRequest {

    private int id;
    private int complaintId;
    private int staffId;
    private String assignedDate;

    public MaintenanceRequest(int id, int complaintId, int staffId, String assignedDate) {
        this.id = id;
        this.complaintId = complaintId;
        this.staffId = staffId;
        this.assignedDate = assignedDate;
    }

    public int getId() {
        return id;
    }

    public int getComplaintId() {
        return complaintId;
    }

    public int getStaffId() {
        return staffId;
    }

    public String getAssignedDate() {
        return assignedDate;
    }
}