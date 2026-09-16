package com.hostelsync;

import com.hostelsync.ai.AIService;
import com.hostelsync.ai.PredictionResult;
import com.hostelsync.model.*;
import com.hostelsync.service.*;
import com.hostelsync.util.ConsoleUtil;

public class HostelSyncApp {
    private static final int TOTAL_STUDENTS = 15000;
    private static final int TOTAL_ROOMS = 2000;
    private static final int OCCUPIED_ROOMS = 1800;
    private final StudentService studentService = new StudentService();
    private final RoomService roomService = new RoomService();
    private final ComplaintService complaintService = new ComplaintService();
    private final FeeService feeService = new FeeService();
    private final StaffService staffService = new StaffService();
    private final HostelService hostelService = new HostelService();
    private final AIService aiService = new AIService();

    public void start() {

        loadSampleData();

        while (true) {

            System.out.println("\n=================================");
            System.out.println("          HOSTELSYNC");
            System.out.println("   Smart Hostel Management");
            System.out.println("=================================");
            System.out.println("1. Login");
            System.out.println("2. Demo");
            System.out.println("0. Exit");
            System.out.println("=================================");

            int choice = ConsoleUtil.readInt("Enter choice: ");

            switch (choice) {
                case 1 -> login();
                case 2 -> showMainMenu();
                case 0 -> {
                    System.out.println("Thank you for using HostelSync!");
                    ConsoleUtil.close();
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
    private void login() {

        String loginInput = ConsoleUtil.readString("Enter email or phone: ");

        System.out.println("\n1. Student");
        System.out.println("2. Faculty");
        System.out.println("3. Keyless Entry");

        int choice = ConsoleUtil.readInt("Select option: ");

        switch (choice) {
            case 1, 2, 3 -> showMainMenu();
            default -> System.out.println("Invalid choice.");
        }
    }

    private void showMainMenu() {

        while (true) {

            System.out.println("\n=================================");
            System.out.println("          HOSTELSYNC");
            System.out.println("   Smart Hostel Management");
            System.out.println("=================================");
            System.out.println("1. View Students");
            System.out.println("2. View Rooms");
            System.out.println("3. Submit Complaint");
            System.out.println("4. View Complaints");
            System.out.println("5. Check Fees");
            System.out.println("6. AI Complaint Analysis");
            System.out.println("7. View Dashboard");
            System.out.println("8. Update Complaint Status");
            System.out.println("0. Logout");
            System.out.println("=================================");

            int choice = ConsoleUtil.readInt("Enter choice: ");

            switch (choice) {
                case 1 -> viewStudents();
                case 2 -> viewRooms();
                case 3 -> submitComplaint();
                case 4 -> viewComplaints();
                case 5 -> viewFees();
                case 6 -> analyzeComplaint();
                case 7 -> showDashboard();
                case 8 -> updateComplaintStatus();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
    private void loadSampleData() {

        studentService.addStudent(
                new Student(1, "Ayush", "ayush@email.com",
                        "9876543210", 101));

        studentService.addStudent(
                new Student(2, "Rahul", "rahul@email.com",
                        "9876543211", 102));

        roomService.addRoom(new Room(1, "101", 2, 1));
        roomService.addRoom(new Room(2, "102", 2, 2));

        feeService.addFee(new Fee(1, 1, 25000, false));
        feeService.addFee(new Fee(2, 2, 25000, true));

        staffService.addStaff(
                new Staff(1, "Maintenance Team",
                        "9876500000", "Maintenance"));

        hostelService.addHostel(
                new Hostel(1, "Hostel A", "Block A", 50));
        complaintService.addComplaint(
                new Complaint(
                        1,
                        1,
                        "Hostel Complaint",
                        "The fan in my room is not working",
                        "Electrical",
                        "MEDIUM",
                        ComplaintStatus.PENDING
                )
        );
    }

    private void viewStudents() {

        System.out.println("\n--- STUDENTS ---");

        for (Student student : studentService.getStudents()) {
            System.out.println(
                    student.getId() + " | " +
                            student.getName() + " | Room " +
                            student.getRoomId());
        }
    }

    private void viewRooms() {

        System.out.println("\n--- ROOMS ---");

        for (Room room : roomService.getRooms()) {
            System.out.println(
                    "Room " + room.getRoomNumber() +
                            " | Capacity: " + room.getCapacity() +
                            " | Occupied: " + room.getOccupied() +
                            " | Available: " + room.isAvailable());
        }
    }

    private void submitComplaint() {

        String description =
                ConsoleUtil.readString("Describe your complaint: ");

        PredictionResult result =
                aiService.analyzeComplaint(description);

        int id = complaintService.getComplaints().size() + 1;

        Complaint complaint = new Complaint(
                id,
                1,
                "Hostel Complaint",
                description,
                result.getCategory(),
                result.getPriority(),
                ComplaintStatus.PENDING);

        complaintService.addComplaint(complaint);

        System.out.println("\nComplaint submitted successfully!");
        System.out.println("Category: " + result.getCategory());
        System.out.println("Priority: " + result.getPriority());
        System.out.println("AI Confidence: " +
                (result.getConfidence() * 100) + "%");
    }

    private void viewComplaints() {

        System.out.println("\n--- COMPLAINTS ---");

        if (complaintService.getComplaints().isEmpty()) {
            System.out.println("No complaints found.");
            return;
        }

        for (Complaint complaint :
                complaintService.getComplaints()) {

            System.out.println(
                    "#" + complaint.getId() +
                            " | " + complaint.getCategory() +
                            " | " + complaint.getPriority() +
                            " | " + complaint.getStatus());

            System.out.println(
                    "   " + complaint.getDescription());
        }
    }

    private void viewFees() {

        System.out.println("\n--- FEES ---");

        for (Fee fee : feeService.getFees()) {
            System.out.println(
                    "Student ID: " + fee.getStudentId() +
                            " | Amount: ₹" + fee.getAmount() +
                            " | Status: " +
                            (fee.isPaid() ? "PAID" : "UNPAID"));
        }
    }

    private void analyzeComplaint() {

        String description =
                ConsoleUtil.readString(
                        "Enter complaint for AI analysis: ");

        PredictionResult result =
                aiService.analyzeComplaint(description);

        System.out.println("\n--- AI ANALYSIS ---");
        System.out.println("Category: " + result.getCategory());
        System.out.println("Priority: " + result.getPriority());
        System.out.println("Confidence: " +
                (result.getConfidence() * 100) + "%");
    }

    private void showDashboard() {

        int availableRooms = TOTAL_ROOMS - OCCUPIED_ROOMS;

        double occupancyRate =
                ((double) OCCUPIED_ROOMS / TOTAL_ROOMS) * 100;

        int totalComplaints = complaintService.getComplaints().size();

        int pendingComplaints =
                complaintService.getComplaintsByStatus(
                        ComplaintStatus.PENDING).size();

        int inProgressComplaints =
                complaintService.getComplaintsByStatus(
                        ComplaintStatus.IN_PROGRESS).size();

        int resolvedComplaints =
                complaintService.getComplaintsByStatus(
                        ComplaintStatus.RESOLVED).size();

        int unpaidFees = feeService.getUnpaidFees().size();

        System.out.println("\n========== HOSTEL DASHBOARD ==========");
        System.out.println("Total Students       : " + TOTAL_STUDENTS);
        System.out.println("Total Rooms          : " + TOTAL_ROOMS);
        System.out.println("Occupied Rooms       : " + OCCUPIED_ROOMS);
        System.out.println("Available Rooms      : " + availableRooms);
        System.out.printf("Occupancy Rate       : %.1f%%%n", occupancyRate);
        System.out.println("--------------------------------------");
        System.out.println("Total Complaints     : " + totalComplaints);
        System.out.println("Pending Complaints   : " + pendingComplaints);
        System.out.println("In Progress          : " + inProgressComplaints);
        System.out.println("Resolved Complaints  : " + resolvedComplaints);
        System.out.println("--------------------------------------");
        System.out.println("Unpaid Fees          : " + unpaidFees);
        System.out.println("======================================");
    }
    private void updateComplaintStatus() {

        int id = ConsoleUtil.readInt("Enter complaint ID: ");

        Complaint complaint = complaintService.findById(id);

        if (complaint == null) {
            System.out.println("Complaint not found.");
            return;
        }

        System.out.println("\nCurrent Status: " + complaint.getStatus());
        System.out.println("1. ASSIGNED");
        System.out.println("2. IN_PROGRESS");
        System.out.println("3. RESOLVED");
        System.out.println("4. CLOSED");

        int choice = ConsoleUtil.readInt("Select new status: ");

        ComplaintStatus newStatus;

        switch (choice) {
            case 1 -> newStatus = ComplaintStatus.ASSIGNED;
            case 2 -> newStatus = ComplaintStatus.IN_PROGRESS;
            case 3 -> newStatus = ComplaintStatus.RESOLVED;
            case 4 -> newStatus = ComplaintStatus.CLOSED;
            default -> {
                System.out.println("Invalid status.");
                return;
            }
        }

        complaintService.updateStatus(id, newStatus);

        System.out.println(
                "Complaint #" + id + " updated to " + newStatus
        );
    }
}