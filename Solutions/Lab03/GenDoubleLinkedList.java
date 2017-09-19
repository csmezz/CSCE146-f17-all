/**
 * 
 */
package Lab3;

/**
 * @author brady
 *
 */
public class GenDoubleLinkedList<T> {
    private class ListNode {
        public T data;
        public ListNode nextLink, prevLink;
        
        public ListNode() {
            data = null;
            nextLink = prevLink = null;
        }
        
        public ListNode(T dat, ListNode prev, ListNode next) {
            data = dat;
            prevLink = prev;
            nextLink = next;
        }
    }
    
    private ListNode head, current, right, left; //keep track of nodes to the left and right of current
    
    public GenDoubleLinkedList() {
        head = current = null;
    }
    
    public void goToNext() {
        if (current == null) return;
        left = current;
        current = current.nextLink;
        right = current.nextLink;
        
    }
    
    public void goToPrev() {
        if (current == null) return;
        right = current;
        current = current.prevLink;
        left = current.prevLink;
    }

    /**
     * @param string
     */
    public void setDataAtCurrent(T string)
    {
        if (head == null) {
            head = new ListNode(string, null, null);
            current = head;
            left = right = null;
            return;
        }
        current.data = string;
    }

    /**
     * @param string
     */
    public void insertNodeAfterCurrent(T string)
    {
        
        //current is null
        if (current == null || head == null) {
            head = new ListNode(string, null, null);
            current = head;
            left = right = null;
            return;
        }
        //current is at head
        ListNode temp = new ListNode(string, current, right);
        current.nextLink = temp;
        if (right != null) right.prevLink = temp;
        //if (left != null) left = current.prevLink; //Will not actually Change
        right = current.nextLink;
    }

    /**
     * 
     */
    public void showList()
    {
        // TODO Auto-generated method stub
        ListNode temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.nextLink;
        }
    }

    /**
     * 
     */
    public void deleteCurrentNode()
    {
        // TODO Auto-generated method stub
        if (current == null || head == null) return;
        //current is only one in list
        if (current == head && current.prevLink == null && current.nextLink == null) {
            current = head = null;
            return;
        }
        //more than one link
        current = current.nextLink;
        right = current.nextLink;
        left.nextLink = current;
        current.prevLink = left;
    }

    /**
     * @param string
     * @return
     */
    public boolean inList(T string)
    {
        // TODO Auto-generated method stub
        ListNode temp = head;
        while (temp != null) {
            if (temp.data.equals(string)) return true;
            temp = temp.nextLink;
        }
        return false;
    }
}
