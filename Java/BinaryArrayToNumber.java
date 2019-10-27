import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int finalInt = 0;
        for (int i = 0; i < binary.size(); i++) {
          if (binary.get(i) == 1) {
            finalInt += Math.pow(2, binary.size() - i - 1);
          }
        }
        return finalInt;
    }
}