package com.stackroute.others;

import java.util.Hashtable;
import java.util.Vector;

public class CollectionsAndGenerics {
  public static void main(String[] args) {
    // Creating instances of array, vector and hashtable
    Vector<Integer> v = new Vector();
    Hashtable<Integer, String> h = new Hashtable();
    v.addElement(1);
    v.addElement(2);
    h.put(1, "keer");
    h.put(2, "sru");

    // Array instance creation requires [], while Vector
    // and hastable require ()
    // Vector element insertion requires addElement(), but
    // hashtable element insertion requires put()

    // Accessing first element of array, vector and hashtable
    System.out.println(v.elementAt(0));
    System.out.println(h.get(1));

    // Array elements are accessed using [], vector elements
    // using elementAt() and hashtable elements using get()
  }

}
