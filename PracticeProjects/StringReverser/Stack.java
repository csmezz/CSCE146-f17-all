/**
 * 
 */
package stringReverser;

/**
 * @author Brady
 *
 */
public class Stack <T> {
    private class Node {
        public Node next;
        public T data;
        public Node(T aData, Node nextNode) {
            data = aData;
            next = nextNode;
        }
    }
    private Node head;
    
    public Stack() {
        head  = null;
    }
    
    public void push(T data) {
        if (head == null) {
            head = new Node(data, null);
            return;
        }
        Node temp = new Node(data, head);
        head = temp;
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
