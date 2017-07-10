public class Main {

  public static void main(String[] args) {
    AnagramFinder anagramFinder = new AnagramFinder();
    System.out.println(anagramFinder.isAnagram("I am a weakish speller", "William Shakespeare"));
    System.out.println(anagramFinder.isAnagram("Gyomorrontás", "toronymorgás"));
    System.out.println(anagramFinder.isAnagram("hello", "szia"));
  }

}
