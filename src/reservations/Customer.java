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
public class Customer<E> implements QueueInterface<E> {

    private LinkedList<E> list = new LinkedList<>();

    public Customer() {
    } 

    public int size() {
        return list.getSize();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void enqueue(E element) {
        list.addLast(element);
    }

    public E first() {
        return list.first();
    }

    public E dequeue() {
        return list.removeFirst();
    }
}
