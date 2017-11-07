/**
 * 
 */
package lab08;

/**
 * @author Brady
 *
 */
public class Main {
    
    public static void main(String args[]) {
        Graph g = new Graph(7);
        g.addLink(0, 4);
        g.addLink(1, 0);
        g.addLink(2, 0);
        g.addLink(3, 1);
        g.addLink(4, 1);
        g.addLink(4, 2);
        g.addLink(4, 6);
        g.addLink(5, 2);
        g.addLink(6, 3);
        g.addLink(6, 5);
        
        g.findCycles();
    }
}
