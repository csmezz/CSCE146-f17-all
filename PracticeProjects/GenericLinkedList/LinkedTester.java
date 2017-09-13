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
        
    }
    
}
