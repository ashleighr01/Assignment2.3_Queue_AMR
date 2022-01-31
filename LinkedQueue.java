/**
 * The LinkedQueue class creates methods enqueue, dequeue, and
 * print that will be applied. The generic LinkedList and
 * GenericNode classes are used to implement each method
 * 
 * @author Ashleigh Rufus
 * CS215-ON: Assignment 2.3
 */
import linkedlist.copy.*;

public class LinkedQueue<T> {

	GenericLinkedList<T> queue = new GenericLinkedList<T> ();
	private int count;
	private GenericNode<T> head, tail;
	
	/*
	 *Constructor with count, head, and tail 
	 */
	public LinkedQueue() {
		
		count = 0;
		head = null;
		tail = null;
	} //end constructor
	
	/*
	 * Getters & Setters
	 */
	public GenericNode<T> getHead() {
		return head;
	} //end getHead

	public void setHead(GenericNode<T> head) {
		this.head = head;
	} //end setHead

	public GenericNode<T> getTail() {
		return tail;
	} //end getTail

	public void setTail(GenericNode<T> tail) {
		this.tail = tail;
	} //end setTail

	/**
	 * Method used to add items to the queue using portions
	 * of GenericNode class and GenericLinkedList queue
	 * @param newEntry
	 */
	public void enqueue(T newEntry) {
		GenericNode<T> node = new GenericNode<T> ();
		node.setData(newEntry);
		queue.addNode(node);
		
		if (isEmpty()) {
			head = node.getNode();
		} else {
			tail.setNextNode(node);
		}
		tail = node;
		count++;
	} //end enqueue
	
	/**
	 * Method used to remove items from the queue using
	 * portions of GenericLinkedList and GenericNode classes.
	 * As items are removed, the queue changes size
	 * @return T front (the first item in the queue)
	 */
	public T dequeue() {
		T front = getFront();
		head.setData(null);
		head = head.getNextNode();
		queue.removeNode(head);
		count--;
		
		if (isEmpty()) {
			return null;
		} else {
			return front;
		}
		
	} //end dequeue
	
	/**
	 * Decipher if the queue is empty or not
	 * @return true, if the queue is empty or count is less
	 * than or equal to 0. Return false, if queue has items
	 * or count is greater than 0
	 */
	public boolean isEmpty() {
		if (count <= 0 ) {
			return true;
		} else {
			return false;
		}
	} //end isEmpty
	
	/**
	 * Remove all items from the queue
	 */
	public void clear() {
		head = null;
		tail = null;
	} //end clear
	
	/**
	 * Show the first item in the queue without removing it
	 * @return the head or front of queue
	 */
	public T getFront() {
		if (isEmpty()) {
			throw new EmptyQueueException();
		} else
			return head.getData();
	} //end getFront

	/**
	 * Print out the queue with current items
	 */
	public void print() {
	
		GenericNode <T> node = queue.getList();
		do {
			System.out.println(node.getData());
			node = node.getNextNode();
		} while (node != null);
	} //end print
	
} //end LinkedQueue
