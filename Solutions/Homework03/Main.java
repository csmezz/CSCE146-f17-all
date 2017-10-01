/**Homework 3 Solution
 * 
 */
package rpncalc;
import java.io.File;
import java.util.Scanner;
/**
 * @author brady
 *
 */
public class Main {
    
    public static Queue<String> equations = new Queue<String>(); 
    public static final String FILENAME = "";
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        readFromFile(FILENAME);
        
        //Parse Data in the Queue
        while (equations.size() > 0) {
            
        }
    }
    
    public static void readFromFile(String fname) {
        try {
            Scanner file = new Scanner(new File(fname));
            while (file.hasNextLine()) {
                equations.push(file.nextLine());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public static void doRPN(String equat) {
        Stack<String> stk = new Stack<String>();
        Scanner scan = new Scanner(equat);
        String temp = "";
        int p1 = 0, p2 = 0, result; //Parameters of Equation
        while (scan.hasNext()) {
            temp = scan.next();
            System.out.println(temp);
            if (temp == "+" || temp == "-" || temp == "*" || temp == "/") {
                if (temp == "+" && stk.size() >= 2) {
                    p1 = Integer.parseInt(stk.pop());
                    p2 = Integer.parseInt(stk.pop());
                    result = p1 + p2;
                    stk.push(String.valueOf(result)); // Convert int to String
                } else if (temp == "-" && stk.size() >= 2) {
                    p1 = Integer.parseInt(stk.pop());
                    p2 = Integer.parseInt(stk.pop());
                    result = p1 - p2;
                    stk.push(String.valueOf(result)); // Convert int to String
                } else if (temp == "*" && stk.size() >= 2) {
                    p1 = Integer.parseInt(stk.pop());
                    p2 = Integer.parseInt(stk.pop());
                    result = p1 * p2;
                    stk.push(String.valueOf(result)); // Convert int to String
                } else if (temp == "/" && stk.size() >= 2) {
                    p1 = Integer.parseInt(stk.pop());
                    p2 = Integer.parseInt(stk.pop());
                    result = p1 / p2;
                    stk.push(String.valueOf(result)); // Convert int to String
                } else {
                    System.err.println("MALFORMED EXPRESSION: " + equat);
                    return;
                }
            } else { 
                stk.push(temp);
            }
        }
    }
}
