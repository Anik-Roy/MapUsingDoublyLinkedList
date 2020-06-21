package com.company;

import java.util.LinkedList;

public class Map<keyType, valueType> extends List<keyType, valueType>{
    public int size() {
        return (N);
    }

    public boolean isEmpty() {
        return (N==0);
    }

    public valueType get(keyType k) {
        ListElem<keyType, valueType> p;
        for(p = head; p != null; p = p.next) {
            if(p.key.equals(k)) {
                return (p.value);
            }
        }
        return (null);
    }

    public valueType put(keyType k, valueType v) {
        ListElem<keyType, valueType> p;
        valueType old;

        for(p = head; p != null; p = p.next) {
            if(p.key.equals(k)) {
                old = p.value;
                p.value = v; // replace old value
                return (old);
            }
        }

        // not found, insert new entry
        p = new ListElem<keyType, valueType>(k, v);
        insert(p);
        return null;
    }

    public valueType remove(keyType k) {
        ListElem<keyType, valueType> p;
        valueType old;

        for(p = head; p != null; p = p.next) {
            if(p.key.equals(k)) {
                old = p.value;
                delete(p); // Delete element
                return (old); // return old value;
            }
        }
        return (null); //return not found
    }

    public Iterable<keyType> keySet() {
        LinkedList<keyType> r = new LinkedList<keyType>();
                                    // one of the classes that implements
                                    // Iterable is linked list
        ListElem<keyType, valueType> p;
        for(p = head; p != null; p = p.next) {
            r.add(p.key);
        }
        return (r);
    }

    public Iterable<valueType> values() {
        LinkedList<valueType> r = new LinkedList<valueType>();
                                            // one of the classes that implements
                                            // collection is linked list
        ListElem<keyType, valueType> p;
        for(p = head; p != null; p = p.next) {
            r.add(p.value);
        }
        return (r);
    }

    public Iterable<ListElem<keyType, valueType>> entrySet() {
        LinkedList<ListElem<keyType, valueType>> r = new LinkedList<ListElem<keyType, valueType>>();
                                            // one of the classes that implements
                                            // collection is linked list
        ListElem<keyType, valueType> p;
        for(p = head; p != null; p = p.next) {
            r.add(p);
        }

        return (r);
    }
}
