class Solution {
 public static int isSumSafe(int[] arr) {
        int sum = 0;
        for(int x: arr) {
            sum += x;
        }
        for(int x: arr) {
            if(x == sum) return 0;
        }
        return 1;
    }
}
