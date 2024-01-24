class Solution {
static int isCentered15(int[] a) {
        int sum = 0;
        int isCentered = 0;
        int startIndex = 0;
        int endIndex = 0;
        if(a.length % 2 == 0) {
            startIndex = (a.length / 2) - 1;
            endIndex = a.length / 2;
        }else{
            startIndex = (a.length-1) / 2;
            endIndex = startIndex;
        }
        while(startIndex >= 0 && endIndex < a.length) {
            sum = 0;
            for(int i = startIndex; i <= endIndex; i++) {
             sum += a[i];   
            }
            if(sum == 15) {
            isCentered = 1;
            break;
        }
        startIndex--;
        endIndex++;
        }
        return isCentered;
    }
}
