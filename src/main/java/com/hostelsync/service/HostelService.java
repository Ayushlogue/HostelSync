package com.hostelsync.service;

import com.hostelsync.model.Hostel;

import java.util.ArrayList;
import java.util.List;

public class HostelService {

    private final List<Hostel> hostels = new ArrayList<>();

    public void addHostel(Hostel hostel) {
        hostels.add(hostel);
    }

    public Hostel findById(int id) {
        for (Hostel hostel : hostels) {
            if (hostel.getId() == id) {
                return hostel;
            }
        }
        return null;
    }

    public List<Hostel> getHostels() {
        return new ArrayList<>(hostels);
    }
}