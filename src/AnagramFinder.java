import java.util.Arrays;

public class AnagramFinder {

  public AnagramFinder() {
  }

  public boolean isAnagram(String one, String two) {
    one = one.replaceAll("\\s+","");
    two = two.replaceAll("\\s+","");

    char[] s1Array = one.toLowerCase().toCharArray();
    char[] s2Array = two.toLowerCase().toCharArray();

    Arrays.sort(s1Array);
    Arrays.sort(s2Array);

    return Arrays.equals(s1Array , s2Array);
  }

}
