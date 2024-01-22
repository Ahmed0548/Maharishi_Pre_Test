class Solution {
	static int isGuthrieSequence(int[] a) {
        if(a.length == 0 || a[a.length-1] != 1) return 0;
        for(int i =1; i < a.length; i++) {
            if(a[i-1] %  2 == 0 && a[i] != a[i-1] / 2) return 0;
            if(a[i-1] % 2 == 1 && a[i] != (a[i-1] * 3) +1) return 0;
        }
        return 1;
    }
}
