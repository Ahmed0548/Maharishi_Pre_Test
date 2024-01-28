class Solution {
public static int isSquare( int n) {
    if(n == 0) return 1;
    for(int i = 1; i < n/2; i++) {
        if(i * i == n) {
            return 1;
        }
    }
    return 0;
    }
}
