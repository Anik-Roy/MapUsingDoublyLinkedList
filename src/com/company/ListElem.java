package com.company;

public class ListElem<keyType, valueType> { // List class with two parameters
    public keyType key;
    public valueType value;

    public ListElem<keyType, valueType> prev;   // Double linked list for easy deletion
    public ListElem<keyType, valueType> next;

    public ListElem(keyType k, valueType v) {
        key = k;
        value = v;

        prev = null;
        next = null;
    }

    public String toString() {
        return ("("+key+","+value+")");
    }
}
