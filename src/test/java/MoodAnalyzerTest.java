import junit.framework.TestCase;
import moodanalyzer.MoodAnalyzer;
import org.junit.Test;


public class MoodAnalyzerTest {
    private TestCase Assertions;

    @Test
    public void givenSadMessage() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Hello am in sad mood");
        String mood = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("SAD", mood);
    }
    @Test
    public void givenHappyMassage(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Hello am in happy mood");
        String mood = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenAnyMassage() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Hello am not in mood");
        String mood = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("HAPPY", mood);
    }
}
