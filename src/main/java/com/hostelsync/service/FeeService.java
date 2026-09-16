package com.hostelsync.service;

import com.hostelsync.model.Fee;

import java.util.ArrayList;
import java.util.List;

public class FeeService {

    private final List<Fee> fees = new ArrayList<>();

    public void addFee(Fee fee) {
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

    public List<Fee> getFees() {
        return new ArrayList<>(fees);
    }

    public List<Fee> getUnpaidFees() {
        List<Fee> result = new ArrayList<>();

        for (Fee fee : fees) {
            if (!fee.isPaid()) {
                result.add(fee);
            }
        }

        return result;
    }

    public boolean markAsPaid(int id) {
        Fee fee = findById(id);

        if (fee == null) {
            return false;
        }

        fee.setPaid(true);
        return true;
    }
}