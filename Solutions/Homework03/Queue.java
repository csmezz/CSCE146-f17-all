/**
 * 
 */
package rpncalc;

/**
 * @author brady
 *
 */
public class Queue <T> {
    private class Node {
        public Node next;
        public T data;
        public Node(T aData, Node nextNode) {
            data = aData;
            next = nextNode;
        }
    }
    private Node head, tail, tailPrev;
    
    public Queue() {
        head = tail = tailPrev = null;
    }
    // New things go on tail
    public void push(T data) {
        if (head == null) {
            head = tail = new Node(data, null);
            return;
        }
        tail.next = new Node(data, null);
        tail = tail.next;
    }
    
    public T pop() {
        if (head == null) return null;
        T toReturn = head.data;
         head = head.next;
        return toReturn;
    }
    public T peek() {
        if (head == null) return null;
        T toReturn = head.data;
        return toReturn;
    }
    public int size() {
        if (head == null) return 0;
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }
}
