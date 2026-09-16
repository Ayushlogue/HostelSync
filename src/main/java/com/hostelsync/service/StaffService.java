package com.hostelsync.service;

import com.hostelsync.model.Staff;

import java.util.ArrayList;
import java.util.List;

public class StaffService {

    private final List<Staff> staffMembers = new ArrayList<>();

    public void addStaff(Staff staff) {
        staffMembers.add(staff);
    }

    public Staff findById(int id) {
        for (Staff staff : staffMembers) {
            if (staff.getId() == id) {
                return staff;
            }
        }
        return null;
    }

    public List<Staff> getStaffMembers() {
        return new ArrayList<>(staffMembers);
    }

    public List<Staff> getStaffByDepartment(String department) {
        List<Staff> result = new ArrayList<>();

        for (Staff staff : staffMembers) {
            if (staff.getDepartment().equalsIgnoreCase(department)) {
                result.add(staff);
            }
        }

        return result;
    }
}