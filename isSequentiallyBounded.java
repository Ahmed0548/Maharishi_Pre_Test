class Solution {
 public static int isSequentiallyBounded(int[] a) {
        if (a.length == 0) {
            return 1;
        }
        int elementToCompare = a[0];
         for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) return 0;
            if (elementToCompare > a[i]) {
                return 0;
            }
            elementToCompare = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            int allowedCount = a[i] - 1;
            int actualCount = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == a[i]) {
                    actualCount++;
                }
            }
            if (actualCount > allowedCount) {
                return 0;
            }
        }
        return 1;
    }
}
