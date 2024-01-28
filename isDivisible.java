class Solution {
	public static int isdivisible(int[] arr, int n) {
        for(int x: arr) {
            if(x % n != 0) {
                return 0;
            }
        }
        return 1;
    }
}
