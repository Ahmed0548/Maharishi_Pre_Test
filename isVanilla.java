class Solution {
public static int isVanilla(int[] arr) {
        int digit = arr[0] % 10;
        for(int i = 1; i < arr.length; i++) {
            int num = arr[i];
            while(num > 0) {
                if(num % 10 != digit) {
                    return 0;
                }
                num /= 10;
            }
        }
        return 1;
    }
}
