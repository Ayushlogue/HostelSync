package com.hostelsync.repository;

import com.hostelsync.model.Fee;

import java.util.ArrayList;
import java.util.List;

public class FeeRepository {

    private final List<Fee> fees = new ArrayList<>();

    public void save(Fee fee) {
        fees.add(fee);
    }

    public Fee findById(int id) {
        for (Fee fee : fees) {
            if (fee.getId() == id) {
                return fee;
            }
        }
        return null;
    }

    public List<Fee> findAll() {
        return new ArrayList<>(fees);
    }

    public List<Fee> findUnpaid() {
        List<Fee> result = new ArrayList<>();

        for (Fee fee : fees) {
            if (!fee.isPaid()) {
                result.add(fee);
            }
        }

        return result;
    }
}