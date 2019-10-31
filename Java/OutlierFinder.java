//Finds the only even or odd number out of an array of integers at least 3 integers long.

public class OutlierFinder{

  static int find(int[] integers) {
    //If even, return first odd
    if (integers[0] % 2 == 0 && integers[1] % 2 == 0) {
      for (int i : integers) {
        if (i % 2 != 0) return i; 
      }
    //If odd, return first even
    } else if (integers[0] % 2 != 0 && integers[1] % 2 != 0) {
      for (int i : integers) {
        if (i % 2 == 0) return i; 
      }
    //If outlier is in first two numbers, figure out which one
    } else {
      if (integers[0] % 2 == integers[2] % 2) return integers[1]; else return integers[0];
    }
    //This will never be reached but java doesn't parse the else return two lines above as closing
    return -1;
  }

}