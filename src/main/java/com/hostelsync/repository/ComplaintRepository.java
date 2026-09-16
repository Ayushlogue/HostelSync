package com.hostelsync.repository;

import com.hostelsync.model.Complaint;
import com.hostelsync.model.ComplaintStatus;

import java.util.ArrayList;
import java.util.List;

public class ComplaintRepository {

    private final List<Complaint> complaints = new ArrayList<>();

    public void save(Complaint complaint) {
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

    public List<Complaint> findAll() {
        return new ArrayList<>(complaints);
    }

    public List<Complaint> findByStatus(ComplaintStatus status) {
        List<Complaint> result = new ArrayList<>();

        for (Complaint complaint : complaints) {
            if (complaint.getStatus() == status) {
                result.add(complaint);
            }
        }

        return result;
    }
}