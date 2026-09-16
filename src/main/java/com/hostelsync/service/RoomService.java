package com.hostelsync.service;

import com.hostelsync.model.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomService {

    private final List<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Room findById(int id) {
        for (Room room : rooms) {
            if (room.getId() == id) {
                return room;
            }
        }
        return null;
    }

    public List<Room> getRooms() {
        return new ArrayList<>(rooms);
    }

    public List<Room> getAvailableRooms() {
        List<Room> availableRooms = new ArrayList<>();

        for (Room room : rooms) {
            if (room.isAvailable()) {
                availableRooms.add(room);
            }
        }

        return availableRooms;
    }
}