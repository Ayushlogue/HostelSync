package com.hostelsync.service;

import com.hostelsync.model.ComplaintStatus;

public class DashboardService {

    private final ComplaintService complaintService;
    private final FeeService feeService;
    private final RoomService roomService;

    public DashboardService(ComplaintService complaintService,
                            FeeService feeService,
                            RoomService roomService) {
        this.complaintService = complaintService;
        this.feeService = feeService;
        this.roomService = roomService;
    }

    public void displaySummary() {
        int totalComplaints = complaintService.getComplaints().size();
        int pendingComplaints =
                complaintService.getComplaintsByStatus(ComplaintStatus.PENDING).size();
        int resolvedComplaints =
                complaintService.getComplaintsByStatus(ComplaintStatus.RESOLVED).size();
        int unpaidFees = feeService.getUnpaidFees().size();
        int availableRooms = roomService.getAvailableRooms().size();

        System.out.println("\n===== HOSTELSYNC DASHBOARD =====");
        System.out.println("Total complaints : " + totalComplaints);
        System.out.println("Pending complaints : " + pendingComplaints);
        System.out.println("Resolved complaints : " + resolvedComplaints);
        System.out.println("Unpaid fee records : " + unpaidFees);
        System.out.println("Available rooms : " + availableRooms);
        System.out.println("================================");
    }
}