import java.util.Arrays;

public class AnagramFinder {

  public AnagramFinder() {
  }

  public boolean isAnagram(String string1, String string2) {
    string1 = string1.replaceAll("\\s+","");
    string2 = string2.replaceAll("\\s+","");

    char[] s1Array = string1.toLowerCase().toCharArray();
    char[] s2Array = string2.toLowerCase().toCharArray();

    Arrays.sort(s1Array);
    Arrays.sort(s2Array);

    return Arrays.equals(s1Array , s2Array);
  }

}
