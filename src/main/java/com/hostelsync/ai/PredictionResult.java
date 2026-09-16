package com.hostelsync.ai;

public class PredictionResult {

    private String category;
    private String priority;
    private double confidence;

    public PredictionResult(String category, String priority, double confidence) {
        this.category = category;
        this.priority = priority;
        this.confidence = confidence;
    }

    public String getCategory() {
        return category;
    }

    public String getPriority() {
        return priority;
    }

    public double getConfidence() {
        return confidence;
    }
}