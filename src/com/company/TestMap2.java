package com.company;

public class TestMap2 {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new Map<String, Integer>();

        Integer r;

        Iterable<String> it1;
        Iterable<Integer> it2;
        Iterable<ListElem<String,Integer>> it3;


        r = myMap.put("A", 124);
        System.out.println(myMap);
        r = myMap.put("B", 243);
        System.out.println(myMap);
        r = myMap.put("C", 273);
        System.out.println(myMap);
        r = myMap.put("D", 172);
        System.out.println(myMap);
        r = myMap.put("E", 111);
        System.out.println(myMap);

        System.out.print("Map after 5 insertions >> ");
        System.out.println(myMap);
        System.out.println();


        r = myMap.get("D");
        System.out.println("key = D , value = " + r);
        System.out.println();

        it1 = myMap.keySet();
        System.out.println("keySet():");
        System.out.println(it1);
        System.out.println();

        it2 = myMap.values();
        System.out.println("valueSet():");
        System.out.println(it2);
        System.out.println();

        it3 = myMap.entrySet();
        System.out.println("entrySet():");
        System.out.println(it3);
        System.out.println();

        myMap.remove("D");
        System.out.print("After delete `D'>> ");
        System.out.println(myMap);

        System.out.println();
    }
}
