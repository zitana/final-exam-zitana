import java.util.Arrays;

public class ExerciseEleven {

  public static void main(String[] args) {
    System.out.println(isAnagram("I am a weakish speller", "William Shakespeare"));
    System.out.println(isAnagram("Gyomorrontás", "toronymorgás"));

  }

  public static boolean isAnagram(String one, String two) {
    one = one.replaceAll("\\s+","");
    two = two.replaceAll("\\s+","");

    char[] s1Array = one.toLowerCase().toCharArray();
    char[] s2Array = two.toLowerCase().toCharArray();

    Arrays.sort(s1Array);
    Arrays.sort(s2Array);

    return Arrays.equals(s1Array , s2Array);
  }

  public ExerciseEleven() {
  }
}
