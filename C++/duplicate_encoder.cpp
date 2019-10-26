#include <string>
#include <vector>
#include <algorithm>
#include <ctype.h>

//Scan word for duplicate letters that aren't the same letter
bool duplicate_finder(char c, std::string word, int loc) {
  for (int i = 0; i < word.length(); i++) {
      char currentChar = toupper(word[i]);
      if (i != loc && currentChar == c) {
        return true;
      }
  }
  return false;
}

std::string duplicate_encoder(const std::string& word){
  std::vector<char> duplicatedChars;
  
  for (int i = 0; i < word.length(); i++) {
    char currentChar = toupper(word[i]);
    //If current letter isn't in the duplicated chars vector, check if it is duplicated
    if(std::find(duplicatedChars.begin(), duplicatedChars.end(), currentChar) == duplicatedChars.end()) {
      if (duplicate_finder(currentChar, word, i)) {
        duplicatedChars.push_back(currentChar);
      }
    }
  }
  
  std::string encodedWord = "";
  for (int i = 0; i < word.length(); i++) {
    char currentChar = toupper(word[i]);
    if(std::find(duplicatedChars.begin(), duplicatedChars.end(), currentChar) != duplicatedChars.end()) {
      encodedWord.push_back(')');
    } else {
      encodedWord.push_back('(');
    }
  }
  
  return encodedWord;
}