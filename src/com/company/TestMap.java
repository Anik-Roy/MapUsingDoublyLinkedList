package com.company;

public class TestMap {
    public static void main(String[] args) {
        // testing the map functionalities with doubly linked list
        Map<String, String> myMap = new Map<String, String>();
        String r = myMap.put("anik", "24");
        System.out.println(myMap);

        myMap.put("akash", "27");
        System.out.println(myMap);

        myMap.put("sagar", "27");
        System.out.println(myMap);

        myMap.put("sourav", "25");
        System.out.println(myMap);

        myMap.put("rajesh", "26");
        System.out.println(myMap);

        System.out.println("After inserting 5 elements >> ");
        System.out.println(myMap);

        String removed = myMap.remove("anik");
        System.out.println("After removed "+removed+" >> ");
        System.out.println(myMap);

        Iterable it = myMap.keySet();
        System.out.println(it);

        it = myMap.values();
        System.out.println(it);

        it = myMap.entrySet();
        System.out.println(it);
    }
}
