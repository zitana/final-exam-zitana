import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

  public boolean isAnagramWithoutSort(String string1, String string2) {
    string1 = string1.replaceAll("\\s+","");
    string2 = string2.replaceAll("\\s+","");

    char[] s1Array = string1.toLowerCase().toCharArray();
    char[] s2Array = string2.toLowerCase().toCharArray();

    Map<Character, Integer> occurrenceMap = new HashMap<>();

    for (char c : s1Array) {
      int count = 1;
      if (occurrenceMap.containsKey(c)) {
        count = occurrenceMap.get(c) + 1;
      }
      occurrenceMap.put(c, count);
    }

    for (char c : s2Array) {
      int count = -1;
      if (occurrenceMap.containsKey(c)) {
        count = occurrenceMap.get(c) - 1;
      }
      occurrenceMap.put(c, count);
    }

    for (char c : occurrenceMap.keySet()) {
      if (occurrenceMap.get(c) != 0) {
        return false;
      }
    }

    return true;
    }

}
