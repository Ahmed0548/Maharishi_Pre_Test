class Solution {
	 static int repsEqual(int[] arr, int n) {
        for(int i = arr.length-1; i >0; i--) {
            if(arr[i] != n%10) {
                return 0;
            }
           n/=10; 
        }
        return 1;
    }
}
