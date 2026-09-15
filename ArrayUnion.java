package Demo;

import java.util.*;

public class ArrayUnion {

    public static Set<Integer> union(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : a) {
            set.add(num);
        }

        for (int num : b) {
            set.add(num);
        }

        return set;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};

        System.out.println(union(a, b));
    }
}


   
