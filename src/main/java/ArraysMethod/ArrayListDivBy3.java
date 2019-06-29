package main.java.ArraysMethod;

        import java.util.ArrayList;
        import java.util.Iterator;

public class ArrayListDivBy3 {


    public static ArrayList removeDiv(int value, ArrayList arrayList) {
        for (Iterator<Integer> iterator = arrayList.iterator(); iterator.hasNext(); ) {
            Integer number = iterator.next();
            if (number % value == 0) {
                iterator.remove();
            }
        }
        return arrayList;
    }

}

