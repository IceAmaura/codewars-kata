#include <vector>

int positive_sum (const std::vector<int> arr){
  int sum = 0;
  for (int i = 0; i < arr.size(); i++) {
    if (arr.at(i) > -1) {sum = sum + arr.at(i);}
  }
  return sum;
}