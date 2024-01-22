class Solution {
	static int stanton(int[] a) {
        int count = 0;
        int stanon = 0;
       for(int x: a) {
           if(x == 1) {
               count++;
           }
       }
       for(int x: a) {
           if(x == count) {
               stanon++;
           }
       }
       return stanon;
    }
}
