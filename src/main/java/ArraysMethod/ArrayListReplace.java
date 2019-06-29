package main.java.ArraysMethod;

import java.util.ArrayList;

public class ArrayListReplace {


    public static ArrayList replace(String what, String forWhat, ArrayList arrayList) {
        int i = arrayList.indexOf(what);
        arrayList.set(i, forWhat);
        return arrayList;
    }
}