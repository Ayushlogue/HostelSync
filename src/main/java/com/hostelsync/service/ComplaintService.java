package com.hostelsync.service;

import com.hostelsync.model.Complaint;
import com.hostelsync.model.ComplaintStatus;

import java.util.ArrayList;
import java.util.List;

public class ComplaintService {

    private final List<Complaint> complaints = new ArrayList<>();

    public void addComplaint(Complaint complaint) {
        complaints.add(complaint);
    }

    public Complaint findById(int id) {
        for (Complaint complaint : complaints) {
            if (complaint.getId() == id) {
                return complaint;
            }
        }
        return null;
    }

    public List<Complaint> getComplaints() {
        return new ArrayList<>(complaints);
    }

    public List<Complaint> getComplaintsByStatus(ComplaintStatus status) {
        List<Complaint> result = new ArrayList<>();

        for (Complaint complaint : complaints) {
            if (complaint.getStatus() == status) {
                result.add(complaint);
            }
        }

        return result;
    }

    public boolean updateStatus(int id, ComplaintStatus status) {
        Complaint complaint = findById(id);

        if (complaint == null) {
            return false;
        }

        complaint.setStatus(status);
        return true;
    }
}