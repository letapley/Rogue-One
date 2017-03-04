
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Controller {
	
public void keyPressed(KeyEvent e) {

	int key = e.getKeyCode();

    if (key == KeyEvent.VK_H) {
    	int[] left = {-1,0};
    	Level.moveUnit(left);

    }
          

    if (key == KeyEvent.VK_L) {
        int[] right = {1,0};
        Level.moveUnit(right);
    }

    if (key == KeyEvent.VK_J) {
        int[] up = {0,1};
        Level.moveUnit(up);
    }

    if (key == KeyEvent.VK_K) {
        int[] down = {0,-1};
        Level.moveUnit(down);
    }

}
