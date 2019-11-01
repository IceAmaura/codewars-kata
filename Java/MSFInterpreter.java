public class MSFInterpreter {
  private String _cleanedCode = "";
  
  public MSFInterpreter(String code) {
    for (char c : code.toCharArray()) {
      if (c == '+' || c == '.') _cleanedCode += c;
    }
  }
  
  public String interpret() {
    int memory = 0;
    String outputBuffer = "";

    for (char c : _cleanedCode.toCharArray()) {
      if (c == '.') {
        outputBuffer += (char)memory;
      } else if (c == '+' && memory < 255) {
        memory++;
      } else if (c == '+' && memory == 255) {
        memory = 0;
      }
    }

    return outputBuffer;
  }
}