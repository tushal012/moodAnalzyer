package moodanalyzer;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }


    public String analyzeMood(String message) {
        this.message = message;
        return analyzeMood();
    }

    public String analyzeMood() {
        if (message.contains("sad"))
            return "SAD";
        return "HAPPY";
    }
}
