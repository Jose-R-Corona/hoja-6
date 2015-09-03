/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashSet;
/**
 *
 * @author Admin
 */
public class Hash_Set<E> implements Set<E>{
    
    HashSet<E> hset = new HashSet<E>();
   
    public boolean add(E e){
        return hset.add(e);
    }
    public void clear(){
        hset.clear();
    }           
    public boolean remove(Object o){   
        return hset.remove(o);
    }
    public boolean contains(Object o){
        return hset.contains(o);
    }
    public boolean equals(Object o){      
        return hset.equals(o);
    }
    
    public int 	hashCode(){
        return hset.hashCode();
    }
        
    public boolean isEmpty(){
        return hset.isEmpty();
    }
    
    public int 	size(){
        return hset.size();
    }
}
