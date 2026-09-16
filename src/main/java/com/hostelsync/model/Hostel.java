package com.hostelsync.model;

public class Hostel {

    private int id;
    private String name;
    private String block;
    private int totalRooms;

    public Hostel(int id, String name, String block, int totalRooms) {
        this.id = id;
        this.name = name;
        this.block = block;
        this.totalRooms = totalRooms;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBlock() {
        return block;
    }

    public int getTotalRooms() {
        return totalRooms;
    }
}