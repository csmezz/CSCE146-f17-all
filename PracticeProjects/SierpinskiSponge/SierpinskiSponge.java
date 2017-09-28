/**
 * 
 */
package fractalSponge;

import java.applet.*;//Window
import java.awt.*;//Draw things with this
import java.util.*;

/**
 * @author Brady
 *
 */
public class SierpinskiSponge extends Applet {
    private Image display; //Frame
    private Graphics drawingArea; //Canvas
    
    public static final int MINSIZE = 3;
    
    public void init() {
        int height = getSize().height;
        int width = getSize().width;
        display = createImage(width, height);
        drawingArea = display.getGraphics();
        
        drawGasket(0, 0, height, drawingArea);
        
    }
    
    public void paint(Graphics g) {
        g.drawImage(display,  0,  0,  null);
    }
    
    public static void drawGasket(int x, int y, int side, Graphics g) {
        int sub = side / 3;
        //Draw the Middle Square
        g.fillRect(x + sub, y + sub, sub, sub);
        if (sub >= MINSIZE) {
            drawGasket(x, y, sub, g);
            drawGasket(x + sub, y, sub, g);
            drawGasket(x + sub * 2, y, sub, g);
            drawGasket(x, y + sub, sub, g);
            drawGasket(x+ sub * 2, y + sub, sub, g);
            drawGasket(x, y + sub * 2, sub, g);
            drawGasket(x+ sub, y + sub * 2, sub, g);
            drawGasket(x+ sub * 2, y + sub * 2, sub, g);
        }
    }
}
