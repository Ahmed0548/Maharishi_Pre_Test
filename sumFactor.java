class Solution {
	static int sumFactor(int[] a) {
        int count = 0;
        int sum = 0;
       for(int x: a) {
           sum += x;
       }
       for(int x: a) {
           if(x == sum) {
               count++;
           }
       }
       return count;
    }
}
