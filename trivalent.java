class Solution {
public static int trivalent(int[] arr) {
        if(arr == null || arr.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int x: arr) {
            set.add(x);
        }
        if(set.size() == 3) {
            return 1;
        } 
        return 0;
    }
}
