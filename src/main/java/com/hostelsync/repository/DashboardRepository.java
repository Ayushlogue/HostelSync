package com.hostelsync.repository;

public class DashboardRepository {

    public int getTotalRecords(int... counts) {
        int total = 0;

        for (int count : counts) {
            total += count;
        }

        return total;
    }
}