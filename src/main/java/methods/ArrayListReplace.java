package main.java.methods;

import java.util.ArrayList;
import java.util.List;

public class ArrayListReplace {


    public static List replace(String what, String forWhat, List arrayList) {
        int i = arrayList.indexOf(what);
        arrayList.set(i, forWhat);
        return arrayList;
    }
}