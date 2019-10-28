public class NumberFun {
  public static long findNextSquare(long sq) {
      if (!(Math.sqrt(sq) % 1 == 0)) {
        return -1;
      }
      return ((long)Math.sqrt(sq) + 1) * ((long)Math.sqrt(sq) + 1); 
  }
}