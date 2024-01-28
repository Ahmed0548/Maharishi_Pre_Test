class Solution {
public static int n-unique(int[] arr, int n) {
    int count = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == n) {
                    count++;
                }
            }
        }
        return count == 1 ? 1 : 0;
    }
}
