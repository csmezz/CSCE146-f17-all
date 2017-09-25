/**
 * 
 */
package GenericLinkedList;

/**
 * @author brady
 *
 */
public class LinkedTester {
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            ll.append(i);
        }
        
        while (ll.hasNextNode()) {
            System.out.println(ll.get());
            ll.iterate();
        }
        
        ll.reset();
        ll.iterate();
        ll.iterate();
        System.out.println("Deleting: " + ll.get());
        ll.remove();
        
        ll.reset();
        while (ll.hasNextNode()) {
            System.out.println(ll.get());
            ll.iterate();
        }
        
        System.out.println("Search for 7: " + ll.search(7));
        
    }
    
}
