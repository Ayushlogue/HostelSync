package com.hostelsync.model;

public class Staff {

    private int id;
    private String name;
    private String phone;
    private String department;

    public Staff(int id, String name, String phone, String department) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getDepartment() {
        return department;
    }
}