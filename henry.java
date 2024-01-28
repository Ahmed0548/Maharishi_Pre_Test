class Solution {
public static boolean isPerfect(int n) {
  int sum = 0;
  for (int i = 1; i <= n/2; i++) {
    if (n % i == 0) {
      sum += i;
    }
  }
  return sum == n;
}

public static int getPerfect(int k) {
  int count = 0;
  int num = 1;
  while (count < k) {
    if (isPerfect(num)) {
      count++;
    }
    num++;
  }
  return num - 1;
}

public static int henry(int i, int j) {
  int ith = getPerfect(i);
  int jth = getPerfect(j);
  return ith + jth;
    }
}
