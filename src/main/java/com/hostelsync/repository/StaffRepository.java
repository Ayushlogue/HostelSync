package com.hostelsync.repository;

import com.hostelsync.model.Staff;

import java.util.ArrayList;
import java.util.List;

public class StaffRepository {

    private final List<Staff> staffMembers = new ArrayList<>();

    public void save(Staff staff) {
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

    public List<Staff> findAll() {
        return new ArrayList<>(staffMembers);
    }

    public List<Staff> findByDepartment(String department) {
        List<Staff> result = new ArrayList<>();

        for (Staff staff : staffMembers) {
            if (staff.getDepartment().equalsIgnoreCase(department)) {
                result.add(staff);
            }
        }

        return result;
    }
}