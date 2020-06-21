package com.company;

public class MyList {

    public static void main(String[] args) {
	    // testing the list functionalities
        List<String, String> L = new List<String, String>();
	    ListElem<String, String> e;
	    e = new ListElem<String, String>("A", "H");
	    L.insert(e);
	    System.out.println(L);

        ListElem<String, String> e2 = new ListElem<String, String>("B", "e");
        L.insert(e);
        System.out.println(L);

        ListElem<String, String> e3 = new ListElem<String, String>("C", "f");
        L.insert(e);
        System.out.println(L);

        ListElem<String, String> e4 = new ListElem<String, String>("D", "d");
        L.insert(e);
        System.out.println(L);

        ListElem<String, String> e5 = new ListElem<String, String>("E", "e");
        L.insert(e);
        System.out.println(L);

        System.out.println("List after 5 insertions >> ");
        System.out.println(L);

        L.delete(L.head.next.next);
        System.out.println("After delete middle >> ");
        System.out.println(L);

        L.delete(L.head);
        System.out.println("After delete head >> ");
        System.out.println(L);
    }
}
