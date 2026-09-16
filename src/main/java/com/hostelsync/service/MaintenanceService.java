package com.hostelsync.service;

import com.hostelsync.model.MaintenanceRequest;

import java.util.ArrayList;
import java.util.List;

public class MaintenanceService {

    private final List<MaintenanceRequest> requests = new ArrayList<>();

    public void addRequest(MaintenanceRequest request) {
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

    public List<MaintenanceRequest> getRequests() {
        return new ArrayList<>(requests);
    }

    public List<MaintenanceRequest> getRequestsByStaff(int staffId) {
        List<MaintenanceRequest> result = new ArrayList<>();

        for (MaintenanceRequest request : requests) {
            if (request.getStaffId() == staffId) {
                result.add(request);
            }
        }

        return result;
    }
}