import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;
public class ButtonToNewFrame {

	private JFrame f = new JFrame("Login");
	private JButton bok = new JButton("OK");
	
	public ButtonToNewFrame() {
	
		f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		f.getContentPane().add(bok);
		
		bok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				f.dispose();
				new SecondFrame();
			}
		});

		f.setSize(100,100);
		f.setVisible(true);
    }

    public static class SecondFrame {
        private JFrame f = new JFrame("Second");
        
        public SecondFrame() {
        
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(300,300);
            f.setVisible(true);
        }
    }

	public static void main(String[] args) {
		new ButtonToNewFrame();
	}
}

// SecondFrame.java

