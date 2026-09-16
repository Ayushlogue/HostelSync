package com.hostelsync;

import com.hostelsync.model.Role;

public class RoleMenu {

    public static void show(Role role) {

        System.out.println("\n========== " + role + " MENU ==========");

        switch (role) {

            case STUDENT -> {
                System.out.println("1. View Room");
                System.out.println("2. Submit Complaint");
                System.out.println("3. Check Fees");
            }

            case WARDEN -> {
                System.out.println("1. View Students");
                System.out.println("2. View Rooms");
                System.out.println("3. View Complaints");
                System.out.println("4. Update Complaint Status");
                System.out.println("5. View Dashboard");
            }

            case MAINTENANCE -> {
                System.out.println("1. View Assigned Complaints");
                System.out.println("2. Update Complaint Status");
            }

            case ADMIN -> {
                System.out.println("1. View Dashboard");
                System.out.println("2. View Students");
                System.out.println("3. View Rooms");
                System.out.println("4. View Complaints");
                System.out.println("5. View Fees");
            }
        }

        System.out.println("0. Logout");
        System.out.println("=================================");
    }
}