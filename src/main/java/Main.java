package main.java;

import main.java.ArraysMethod.ArrayListReplace;
import main.java.ArraysMethod.ArrayPositiveOnes;
import main.java.ArraysMethod.ArrayAverageList;
import main.java.ArraysMethod.ArrayListDivBy3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        //ArraySorter (2 task)
        System.out.println("2 task");
        Integer[] arr = new Integer[]{2, 3, 1, 7, 11};
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i : arr) {
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println();


        //ArrayListReplace (3 task)
        System.out.println("3 task");

        ArrayList<String> values = new ArrayList<>();
        values.add("One");
        values.add("Two");
        values.add("Tree");
        values.add("Four");
        System.out.println("Before: " + values);
        System.out.println("After: " + ArrayListReplace.replace("Tree", "Three", values));
        System.out.println();

        //ArrayPositiveOnes (4 task)
        System.out.println("4 task");
        int arrSize = 15;
        int min = -20;
        int max = 20;
        int[] randomArray = new int[arrSize];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = min + (int) (Math.random() * (max - (min)) + 1);
            System.out.print(randomArray[i] + " ");
        }
        System.out.println();
        System.out.println("Sum of positive numbers = "+ArrayPositiveOnes.positiveOnes(randomArray));
        System.out.println();

        //ArrayAverageList (5 task)
        System.out.println("5 task");
        System.out.println(ArrayAverageList.getAverage(randomArray, 1));
        System.out.println();

        //ArrayListDivBy3 (6 task)
        System.out.println("6 task");
        ArrayList<Integer> numbList = new ArrayList<>();
        numbList.add(3);
        numbList.add(9);
        numbList.add(11);
        numbList.add(18);
        numbList.add(20);
        numbList.add(22);
        System.out.println("Before: " + numbList);
        System.out.println("After: " + ArrayListDivBy3.removeDiv(3, numbList));
    }


}
