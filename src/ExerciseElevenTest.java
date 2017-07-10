import static org.junit.Assert.*;

import org.junit.Test;

public class ExerciseElevenTest {

  @Test
  public void isAnagramTrue() throws Exception {
    AnagramFinder anagramFinder = new AnagramFinder();
    assertTrue(anagramFinder.isAnagram("I am a weakish speller", "William Shakespeare"));
  }

  @Test
  public void isAnagramFalse() throws Exception {
    AnagramFinder anagramFinder = new AnagramFinder();
    assertFalse(anagramFinder.isAnagram("hello", "szia"));
  }

}