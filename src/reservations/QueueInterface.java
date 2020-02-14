/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

/**
 *
 * @author givani.yousif
 */
public interface QueueInterface<E> {
    
    // Goodrich text, Ch. 6, pg.229
    
    // returns the number of elements in the stack
    int size();
    
    // tests whether the stack is empty
    boolean isEmpty();
    
    // inserts an element at the top of the stack
    void enqueue(E e);
    
    // returns, but does not remove, the element at the top of the stack
    E first();
    
    // removes and returns the top element from the stack
    E dequeue();  
}
