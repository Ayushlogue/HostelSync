package com.hostelsync.model;

public class Room {

    private int id;
    private String roomNumber;
    private int capacity;
    private int occupied;

    public Room(int id, String roomNumber, int capacity, int occupied) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.occupied = occupied;
    }

    public int getId() {
        return id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getOccupied() {
        return occupied;
    }

    public boolean isAvailable() {
        return occupied < capacity;
    }
}