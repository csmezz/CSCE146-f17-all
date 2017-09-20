/**
 * 
 */
package stringReverser;

/**
 * @author Brady
 *
 */
public class StringReverser {
    public static final String DEF_STRING = "potatoes";
    public static void main (String[] args) {
        Stack<String> stk = new Stack<String>();
        for (int i = 0; i < DEF_STRING.length(); i++) {
            stk.push(DEF_STRING.substring(i,i+1));
        }
        
        while(stk.size() > 0) {
            System.out.print(stk.pop());
        }
        
    }
}
