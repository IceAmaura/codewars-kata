class GetMiddleCharacter {
  //Gets middle letter(s) of a string
  public static String getMiddle(String word) {
    if (word.length() % 2 == 0) {
      return Character.toString(word.charAt(Math.round(word.length() / 2) - 1)) + Character.toString(word.charAt(Math.round(word.length() / 2)));
    } else {
      return Character.toString(word.charAt(word.length() / 2));
    }
  }
}