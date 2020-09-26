/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;


/**
 *
 * @author Arman
 */
public class SinglyLinkedList<T> {
    // List Implementation
    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    public Node<T> getHead() {
        return head;
    }
    public void setHead(Node<T> head){
    this.head=head;
    }

    public void fs() {

    }

    public SinglyLinkedList() {
    }

    ;

    public void setSize(int size) {
        this.size = size;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T first() {
        if (isEmpty()) {
            return null;
        }
        return head.getData();
    }

    public T last() {
        if (isEmpty()) {
            return null;
        }
        return tail.getData();
    }

    public void addFirst(T e) {
        head = new Node<>(e, head);
        if (size == 0) {
            tail = head;
        }
        size++;
        System.out.println("Added head node with '" + head.getData() + "' element.");
    }

    public void addLast(T e) {
        Node<T> newNode = new Node<>(e, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
        System.out.println("Added tail node with '" + tail.getData() + "' element.");
    }

    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }
        T answer = head.getData();
        head = head.getNext();
        size--;
        if (size == 0) {
            tail = null;
        }
        System.out.println("Removed head node with '" + answer + "' element.");
        return answer;
    }

    public void reverseList() {
        if (size <= 1) {

        } else if (size == 2) {
            tail.setNext(head);
            head = tail;
            tail = head.getNext();
            tail.setNext(null);
        } else {
            Node<T> current = head;
            Node<T> currentNext = head.getNext();
            Node<T> currentNextNext = currentNext.getNext();
            tail = head;
            while (currentNext != null) {
                currentNext.setNext(current);
                current = currentNext;
                currentNext = currentNextNext;
                if (currentNextNext != null) {
                    currentNextNext = currentNextNext.getNext();
                }
            }
            tail.setNext(null);
            head = current;
        }

    }

    public T removeElement(T e) {
        Node<T> current = head;
        Node<T> previous = head;
        int position = 0;
        while (current != null && current.getData() != e) {
            previous = current;
            current = current.getNext();
            position++;
        }
        if (current == null) {
            return null;
        } else {
            if (head == current) {
                head = current.getNext();
            } else if (tail == current) {
                tail = previous;
                tail.setNext(null);
            } else {
                previous.setNext(current.getNext());
            }
            System.out.println("Found & removed node at position " + position);
            size--;
            return current.getData();
        }
    }
    public Node getMiddle(Node head) 
    { 
        if (head == null) 
            return head; 
  
        Node slow = head, fast = head; 
  
        while (fast.next != null && fast.next.next != null) { 
            slow = slow.next; 
            fast = fast.next.next; 
        } 
        return slow; 
    } 

}
