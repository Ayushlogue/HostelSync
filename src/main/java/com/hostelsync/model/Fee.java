package com.hostelsync.model;

public class Fee {

    private int id;
    private int studentId;
    private double amount;
    private boolean paid;

    public Fee(int id, int studentId, double amount, boolean paid) {
        this.id = id;
        this.studentId = studentId;
        this.amount = amount;
        this.paid = paid;
    }

    public int getId() {
        return id;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}