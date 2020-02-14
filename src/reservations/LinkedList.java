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
public class LinkedList<E> {
    private int size;
    private Node<E> head;
    private Node<E> tail;
    
    // default constructor
    public LinkedList() {
        size = 0;
        head = null;
        tail = null;
    }
    
    public int getSize() {
        return size;
    }
  
    public boolean isEmpty() {
        return (size == 0);
    }
    
    public E first() {
        if ( isEmpty() ) {
            return null;
        }
        else {
            return head.getElement();
        }
    }
    
    public E last() {
        if ( isEmpty() ) {
            return null;
        }
        else {
            return tail.getElement();
        }
    }
    
    public void addFirst(E e) {
        head = new Node<>(e, head);
        
        if (size == 0) {
            tail = head;
        }
        
        size++;
    }
    
public void addLast(E e) {
    Node<E> newest = new Node<>(e, null);
    if (size == 0) {
        head = newest;
    }
    else {
        tail.setNext(newest);
    }

    tail = newest;
    size++;
}
    
    public E removeFirst() {
        if (isEmpty() ) {
            return null;
        }
        else {
            E test = head.getElement();
            head = head.getNext();
            size--;
            if (size == 0) {
                tail = null;
            }
            return test;
        }
    }
    
    
    public class Node<E> {
        private E element;
        private Node<E> next;
        
        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }
        
        public E getElement() {
            return element;
        }
        
        public Node<E> getNext() {
            return next;
        }
        
        public void setNext(Node<E> n) {
            next = n;
        }
    } // end nested node class
     
} // end LinkedList
