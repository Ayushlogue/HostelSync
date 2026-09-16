package com.hostelsync.ai;

public class PriorityPredictor {

    public String predict(String description) {

        String text = description.toLowerCase();

        if (text.contains("fire")
                || text.contains("smoke")
                || text.contains("danger")
                || text.contains("emergency")) {
            return "CRITICAL";
        }

        if (text.contains("water")
                || text.contains("leak")
                || text.contains("broken")) {
            return "HIGH";
        }

        if (text.contains("light")
                || text.contains("fan")
                || text.contains("wifi")) {
            return "MEDIUM";
        }

        return "LOW";
    }
}