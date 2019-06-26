package main.java.task3;

import java.util.ArrayList;

public class ArrayListReplace {
    public static void main(String[] args) {
        ArrayList<String> values = new ArrayList();
        values.add("One");
        values.add("Two");
        values.add("Tree");
        values.add("Four");
        System.out.println("Before: " + values);
        System.out.println("After: " + replace("Tree", "Three", values));
    }

    private static ArrayList replace(String what, String forWhat, ArrayList arrayList) {
        int i = arrayList.indexOf(what);
        arrayList.set(i, forWhat);
        return arrayList;
    }
}
