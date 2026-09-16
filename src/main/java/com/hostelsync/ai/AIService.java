package com.hostelsync.ai;

public class AIService {

    private final ComplaintClassifier classifier;
    private final PriorityPredictor priorityPredictor;

    public AIService() {
        classifier = new ComplaintClassifier();
        priorityPredictor = new PriorityPredictor();
    }

    public PredictionResult analyzeComplaint(String description) {

        PredictionResult categoryResult = classifier.classify(description);
        String priority = priorityPredictor.predict(description);

        return new PredictionResult(
                categoryResult.getCategory(),
                priority,
                categoryResult.getConfidence()
        );
    }
}