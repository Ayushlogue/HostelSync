package com.hostelsync.repository;

import com.hostelsync.model.Hostel;

import java.util.ArrayList;
import java.util.List;

public class HostelRepository {

    private final List<Hostel> hostels = new ArrayList<>();

    public void save(Hostel hostel) {
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

    public List<Hostel> findAll() {
        return new ArrayList<>(hostels);
    }
}