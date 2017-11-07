/**
 * 
 */
package lab08;

import java.util.ArrayList;

/**
 * @author Brady
 *
 */
public class Graph {
    private boolean adjMatrix[][]; // From, To
    private ArrayList<Integer> marked;
    
    public Graph(int size) {
        adjMatrix = new boolean[size][size];
        marked = new ArrayList<Integer>(size);
    }
    
    //Int represents the node, going from to
    public void addLink(int from, int to) {
        if (from >= adjMatrix.length || to >= adjMatrix.length) {
            return;
        }
        adjMatrix[from][to] = true;
    }
    
    public void printDFS() {
        marked.clear();
        printDFS(0);
    }
    
    private void printDFS(int node) {
        System.out.print(node + " ");
        marked.add(node);
        // Mark this.
        for (int i = 0; i < adjMatrix.length; i++) {
            if (adjMatrix[node][i] && !marked.contains(i)) {
                printDFS(i);
            }
        }
        //System.out.println();
        return;
    }
    
    public void findCycles() {
        marked.clear();
        ArrayList<Integer> visited = new ArrayList<Integer>();
        for (int i = 0; i < adjMatrix.length; i++) {
            findCycles(i, visited);
        }
        
    }
    
    private void findCycles(int node, ArrayList<Integer> visited) {
        //System.out.println("Node:" + node);
        ArrayList<Integer> list = cloneList(visited);
        list.add(node);
        // Mark this.
        for (int i = 0; i < adjMatrix.length; i++) {
            if (adjMatrix[node][i] && !list.contains(i)) {
                findCycles(i, list);
            }
            if (adjMatrix[node][i] && list.contains(i)) {
                //Found a cycle, so print the list
                printList(list);
                return;
            }
        }
        //System.out.println();
        return;
    }
    
    private void printList(ArrayList<Integer> visited) {
        for (int i : visited) {
            System.out.print((i + 1) + " ");// Added one so that it is the same as the assignment
        }
        System.out.print((visited.get(0) + 1));
        System.out.println();
    }
    
    private ArrayList<Integer> cloneList(ArrayList<Integer> visited) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : visited) list.add(i);
        return list;
    }
    
    
}
