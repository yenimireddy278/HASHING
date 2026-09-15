package Demo;

import java.util.*;

public class ArrayIntersection {

    public static List<Integer> intersection(int[] a, int[] b) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count elements in the first array
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> result = new ArrayList<>();
        
        // Find intersections in the second array
        for (int num : b) {
            if (map.getOrDefault(num, 0) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        
        return result;
    }
	public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 2, 4, 5};
        
        List<Integer> result = intersection(a, b);
        System.out.println("Intersection: " + result);
        // Output: Intersection: [2, 2, 4]
    }
}
	

    
