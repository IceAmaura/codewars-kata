public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    for (char c : str.toCharArray()) {
      switch (c) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
          vowelsCount++;
          break;
        default:
          break;
      }
    }
    return vowelsCount; 
  }
}