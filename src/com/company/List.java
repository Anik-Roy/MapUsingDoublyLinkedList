package com.company;

public class List<keyType, valueType> {
    public ListElem<keyType, valueType> head;
    public int N;

    public List() {
        head = null; // start with empty list
        N = 0;
    }

    public int size() {
        return (N);
    }

    // delete list item
    public void delete(ListElem<keyType, valueType> p) {
        ListElem<keyType, valueType> prevElem, nextElem;

        if(N == 0) {
            return; // nothing to delete
        }
        else if(N == 1) {   // delete last element ==> empty
            head = null;
        }
        else if(p.prev == null) {
            System.out.println("Delete: "+p.key);
            nextElem = p.next;
            head = nextElem; // the second is the new "first element"
        }
        else if(p.next == null) {
            System.out.println("Delete: "+p.key);
            prevElem = p.prev;
            prevElem.next = null;
        }
        else {
            prevElem = p.prev;
            nextElem = p.next;
            nextElem.prev = p.prev;
            prevElem.next = p.next;
        }
        N--;
    }

    // insert(v): insert at head
    public void insert(ListElem<keyType, valueType> p) {
        if(N == 0) {
            p.next = null;
            p.prev = null;
            head = p;
        }
        else {
            p.next = head;
            p.prev = null;

            head.prev = p;
            head = p;
        }
        N++;
    }

    public String toString() {
        String r = "";
        ListElem<keyType,valueType> p;

        p = head; // Very important: start at first element
        while(p != null) {
            r = r + p + " ";
            p = p.next;
        }
        return (r);
    }
}
