package main.java.task2;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortrer {
    public static void main(String[] args) {

        Integer [] arr = new Integer[]{2,3,1,7,11};
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i: arr) {
            System.out.print(i+" ");
        }

    }

}
