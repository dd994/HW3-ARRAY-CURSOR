package main.java.task4;

import java.lang.reflect.Array;

public class ArrayPositiveOnes {
    public static void main(String[] args) {

        int[] randomArray = new int[15];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i]= +(int) (Math.random()*100);
            System.out.print(randomArray[i]+ " ");
        }


        System.out.println(positiveOnes(randomArray));

    }

    private static int positiveOnes (int [] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

}



