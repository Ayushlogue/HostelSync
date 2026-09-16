package com.hostelsync.ai;

public class ComplaintClassifier {

    public PredictionResult classify(String description) {

        String text = description.toLowerCase();

        if (text.contains("water") || text.contains("leak")) {
            return new PredictionResult("Plumbing", "HIGH", 0.90);
        }

        if (text.contains("light") || text.contains("electricity")
                || text.contains("fan")) {
            return new PredictionResult("Electrical", "MEDIUM", 0.85);
        }

        if (text.contains("wifi") || text.contains("internet")) {
            return new PredictionResult("Internet", "MEDIUM", 0.88);
        }

        if (text.contains("clean") || text.contains("garbage")) {
            return new PredictionResult("Cleanliness", "LOW", 0.82);
        }

        return new PredictionResult("General", "MEDIUM", 0.60);
    }
}