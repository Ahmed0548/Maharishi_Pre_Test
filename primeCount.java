class solutions {
    public static int primeCount(int start, int end) {
    int count = 0;
        for(int i = start; i <= end; i++) {
            if(i <= 1) continue;
            if(isPerfect(i)) {
                count++;
            }
        }
        return count;
    }
    static boolean isPerfect(int num) {
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
