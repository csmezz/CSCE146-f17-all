// Linked List

//Add, Remove, size

public class LinkedList<T> {
  private class Node {
    T data;
    Node next;
    Node (T data, Node next) {
      this.data = data;
      this.next = next;
    }
  }
  
  private Node head, curr, prev;
  private int size = 0;
  
  public LinkedList() {
    head = curr = prev = null;
    size = 0;
  }
  
  public void add(T data) {
    size++;
    Node temp = new Node(data, null);
    if (head == null) {
      head = temp;
    } else {
      Node end = head;
      while (end.next != null) {
        end = end.next;
      }
      end.next = temp;
    }
  }
  
  public void insert(T insertAfter, T data) {
    Node node = new Node(data, null);
    if (head == null) {
      head = node;
    } else {
      Node iter = head;
      while (iter.next != null && !iter.data.equals(data)) {
        iter = iter.next;
      }
      node.next = iter.next;
      iter.next = node;
    }
  }
  
  public void remove(T data) {
    if (head == null) return;
    size--;
    Node toRemove = head;
    while (toRemove != null && !toRemove.data.equals(data)) {
      prev = toRemove;
      toRemove = toRemove.next;
    }
    if (toRemove == null) return;
    prev.next = toRemove.next;
    toRemove = null;
  }
}

public int size() {
  /*if (head == null) return 0;
  Node iter = head;
  for (int sum = 0; iter != null; sum++) {
    if (iter.next == null) return sum;
    iter = iter.next;
  }*/
  return size;
}