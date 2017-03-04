import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Controller extends JFrame implements KeyListener {
	
    JLabel label;

    public Controller(String s) {
        super(s);
        JPanel p = new JPanel();
        label = new JLabel("Key Listener!");
        p.add(label);
        add(p);
        addKeyListener(this);
        setSize(200, 100);
        setVisible(true);

    }
	
	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	
	@Override
	public void keyPressed (KeyEvent e) {
		int key = e.getKeyCode();
		
	    if (key == KeyEvent.VK_H) {
	    	int[] left = {-1,0};
	    	System.out.println("left");
	    	//Level.moveUnit(left);
	    }         
	
	    if (key == KeyEvent.VK_L) {
	        int[] right = {1,0};
	        System.out.println("right");
	        //Level.moveUnit(right);
	    }
	
	    if (key == KeyEvent.VK_J) {
	        int[] up = {0,-1};
	        System.out.println("up");
	        //Level.moveUnit(up);
	    }
	
	    if (key == KeyEvent.VK_K) {
	        int[] down = {0,1};
	        System.out.println("down");
	        //Level.moveUnit(down);
	    }
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
	}
	
	public static void main(String[] args) {
		new Controller("hello world!");
	}
}
