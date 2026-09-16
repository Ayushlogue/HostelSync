package com.hostelsync.repository;

import com.hostelsync.model.MaintenanceRequest;

import java.util.ArrayList;
import java.util.List;

public class MaintenanceRepository {

    private final List<MaintenanceRequest> requests = new ArrayList<>();

    public void save(MaintenanceRequest request) {
        requests.add(request);
    }

    public MaintenanceRequest findById(int id) {
        for (MaintenanceRequest request : requests) {
            if (request.getId() == id) {
                return request;
            }
        }
        return null;
    }

    public List<MaintenanceRequest> findAll() {
        return new ArrayList<>(requests);
    }

    public List<MaintenanceRequest> findByStaff(int staffId) {
        List<MaintenanceRequest> result = new ArrayList<>();

        for (MaintenanceRequest request : requests) {
            if (request.getStaffId() == staffId) {
                result.add(request);
            }
        }

        return result;
    }
}