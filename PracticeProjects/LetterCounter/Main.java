/**Project Information:

Letter Statistics, augments HW1

Takes a dictionary of words and shows the most common letters
 * 
 */
package lettercounter;

import java.io.File;
import java.util.Scanner;
/**
 * @author Brady
 *
 */
public class Main {
    private int[] letters = new int[26]; //Letters
    private int numOfLines = 0;
    
    public Main() {}; //This is implied in Java, don't actually need this.
    
    public void readLetters(String fileName) {
        if (fileName == null || fileName.equals("")) return;
        
        Scanner dict = null;
        try {
            dict = new Scanner (new File (fileName));
            while (dict.hasNextLine()) {
                String line = dict.nextLine();
                line = line.toLowerCase();
                numOfLines++;
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) >= 'a' && line.charAt(i) <= 'z') {
                        letters[(int) line.charAt(i) - 'a']++;
                    }
                }
            }

        } catch (Exception e) {
            //FileNot Found Exception
            System.err.println(e);
        }
    }
    
    public void printResults() {
        char ch = ' ';
        System.out.println("Number of Lines: " + numOfLines);
        for (int i = 0; i < letters.length; i++) {
            ch = (char) ('a' + i);
            System.out.println(ch  + ":" + letters[i]);
        }
    }
    
    public String convertCharacters(String orig, char[] toModify, char replace) {
        char[] arr = new char[orig.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = orig.charAt(i);
            for (int j = 0; j < toModify.length; j++) {
                if (arr[i] == toModify[j]) {
                    arr[i] = replace;
                    break;
                }
            }
        }
        return new String(arr);
    }
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        //if ('b' > 'a') System.out.println("True");
        Main main = new Main();
        main.readLetters("dict.txt");
        main.printResults();
        char[] temp = {'a', 'e', 'i'};
        System.out.println(main.convertCharacters("mathematics", temp, '*'));
    }
    
}
