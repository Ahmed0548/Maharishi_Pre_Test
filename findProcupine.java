class Solution {
	static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    static boolean endWithNine(int n) {
        return n % 10 == 9;
    }
    static int findProcupine(int n) {
        while(!(isPrime(n) && endWithNine(n))) {
            n++;
        }
        int procupineNumber = n;
        do{
            n++;
        }while(!(isPrime(n) && endWithNine(n)));
        return n;
    }
}
