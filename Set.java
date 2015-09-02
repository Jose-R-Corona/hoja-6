/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public interface Set<E>{
    boolean 	add(E e);           //Adds the specified element to this set if it is not already present (optional operation).
    
    void 	clear();            //Removes all of the elements from this set (optional operation).
    boolean 	contains(Object o); //Returns true if this set contains the specified element.

    boolean 	equals(Object o);   //Compares the specified object with this set for equality.
    int 	hashCode();         //Returns the hash code value for this set.
    boolean 	isEmpty();          //Returns true if this set contains no elements.
    boolean 	remove(Object o);   //Removes the specified element from this set if it is present (optional operation).
    int 	size();             //Returns the number of elements in this set (its cardinality).
    //Object[] 	toArray();          //Returns an array containing all of the elements in this set.
    
}
