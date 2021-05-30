import junit.framework.TestCase;
import moodanalyzer.MoodAnalysisException;
import moodanalyzer.MoodAnalyzer;
import org.junit.Test;


public class MoodAnalyzerTest {
    private TestCase Assertions;
    private Object ENTERED_NULL;

    @Test
    public void givenSadMessageShouldReturnSadMessage() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Hello am in sad mood");
        String mood = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("SAD", mood);
    }
    @Test
    public void givenHappyMassageShouldReturnHappyMessage() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Hello am in happy mood");
        String mood = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenAnyMassageShouldReturnHappyMessage() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Hello am not in mood");
        String mood = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenNullMassageShouldReturnHappyMessage(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try {
            moodAnalyzer.analyzeMood(null);
        } catch (MoodAnalysisException e) {
            Assertions.assertEquals(ENTERED_NULL, e.getMessage());
        }
    }
    @Test
    public void givenEmptyMessageShouldReturnThrowCustomException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(" ");
        try {
            moodAnalyzer.analyzeMood(" ");
        } catch (MoodAnalysisException e) {
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.getMessage());
            System.out.println(e.type);
            System.out.print(e.getMessage());

        }
    }

}
