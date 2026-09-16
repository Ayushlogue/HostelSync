package com.hostelsync.model;

public class Student {

    private int id;
    private String name;
    private String email;
    private String phone;
    private int roomId;

    public Student(int id, String name, String email, String phone, int roomId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.roomId = roomId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getRoomId() {
        return roomId;
    }
}