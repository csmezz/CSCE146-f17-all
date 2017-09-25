/**
 * 
 */
package GenericLinkedList;

/**
 * @author brady
 *
 */
public class LinkedList<T> {
    private class Node {
        public Node next;
        public T data;
        public Node(T aData, Node nextNode) {
            data = aData;
            next = nextNode;
        }
    }
    
    private Node head, curr, prev;
    
    public LinkedList() {
        head = curr = prev = null;
    }
    
    //Adding to end of the Linked List
    public void append(T aData) {
        if (head == null) {
            head = new Node(aData, null);
            curr = head;
            prev = null;
            return;
        }
        Node iter = head;
        while (iter.next != null) {
            iter = iter.next;
        }
        iter.next = new Node(aData, null);
    }
    //Resets Current Node to beginning (head)
    public void reset() {
        curr = head;
        prev = null;
    }
    
    //Iterate through the list, pull next node
    public void iterate() {
        if (curr == null) { // removed curr.next == null
            System.out.println("Head or NExt is null");
            return;
        }
        prev = curr;
        curr = curr.next;
    }
    
    //Checks to see if there is another node after the current.
    public boolean hasNextNode() {
        return curr != null;
    }
    
    //get Data from current position in List
    public T get() {
        if (curr != null) return curr.data;
        System.out.println("CURRENT IS NULL!!");
        return null;
    }
    
    //Replaces the current's data
    public void replace(T item) {
        if (curr == null) {
            System.err.println("Current is NULL");
            return;
        }
        curr.data = item;
        
    }
    
    //Removes the Current Node
    public void remove() {
        if (curr == null) return; //Current is NULL
        //If Current is at the head
        if (prev == null && head == curr) {
            //Head needs to be set, since its being deleted
            head = head.next;
            curr = head;
            return;
        }
        prev.next = curr.next;
        curr = curr.next;
    }
    
    //Inserts a new Node after the Current
    public void insert(T item) {
        if (curr == null) return;
        Node temp = new Node(item, curr.next);
        curr.next = temp;
    }
    
    //Shifts the HEad up one
    public void prepend(T item) {
        Node temp = new Node(item, head);
        head = temp;
    }    
}






