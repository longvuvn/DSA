import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // int n = 10;

        // 0(n) - Linear Time Complexity
        // for (int i = 0; i < n; i++) {
        // System.out.println("Big O là: 0(n)");
        // }

        // 0(n^2) - Quadratic Time Complexity
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.println("Big O là: 0(n^2)");
        // }
        // }

        // 0(n^3) - Cubic Time Complexity
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // for (int k = 0; k < n; k++) {
        // System.out.println("Big O là: 0(n^3)");
        // }
        // }
        // }

        // step 1: Brute Force
        int[] arr = { 1, 2, 1, 1, 3 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }

        System.out.println("Count: " + count);

        // Step 2: Optimized Approach with HashMap
        // output: [0, 2], [0, 3], [2, 3]
        int[] a = { 1, 2, 1, 1, 3 };
        Map<Integer, Integer> map = new HashMap<>();
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                c += map.get(a[i]);
            }
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        System.out.println("Count: " + c);
        /*
         * arr = [1, 2, 1, 1, 3]
         * int i = 0, arr[i] = 1
         * map.put(1, map.getOrDefault(1, 0) + 1) => map.put(1, 0 + 1) => map.put(1, 1)
         * map = {1: 1}
         * 
         * int i = 1, arr[i] = 2
         * map.put(2, map.getOrDefault(2, 0) + 1) => map.put(2, 0 + 1) => map.put(2, 1)
         * map = {1: 1, 2: 1}
         * 
         * int i = 2, arr[i] = 1
         * map.containsKey(1) = true
         * c += map.get(1) => c = 0 + 1 = 1
         * map.put(1, map.getOrDefault(1, 0) + 1) => map.put(1, 1 + 1) => map.put(1, 2)
         * map = {1: 2, 2: 1}
         * 
         * int i = 3, arr[i] = 1
         * map.containsKey(1) = true
         * c += map.get(1) => c = 1 + 2 = 3
         * map.put(1, map.getOrDefault(1, 0) + 1) => map.put(1, 2 + 1) => map.put(1, 3)
         * map = {1: 3, 2: 1}
         * 
         * int i = 4, arr[i] = 3
         * map.containsKey(3) = false
         * map.put(3, map.getOrDefault(3, 0) + 1) => map.put(3, 0 + 1) => map.put(3, 1)
         * map = {1: 3, 2: 1, 3: 1}
         * 
         * Output: Count: 3
         * 
         */
    }
}
