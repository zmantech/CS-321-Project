import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ComboLayoutTest extends JFrame {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Testing out multiple frames");
        //frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocation(0, 0);

        JPanel master = new JPanel();
        master.setLayout(new BorderLayout());

        JPanel centerM = new JPanel();
        centerM.setLayout(new BoxLayout(centerM, BoxLayout.Y_AXIS));

        JPanel topM = new JPanel();

        JPanel leftM = new JPanel();
        JPanel rightM = new JPanel();
        JPanel bottomM = new JPanel();
        

        //frame.add(centerM, BorderLayout.CENTER);
        //frame.add(topM, BorderLayout.PAGE_START);

        JLabel tLabel = new JLabel("Label at the top with a help button to the right");
        tLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        topM.add(tLabel);

        JButton tButton = new JButton("Im a button, rn I do nothing on the top after the label.");
        tButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        topM.add(tButton);

        JLabel mLabel = new JLabel("Imagine there is a dropdown here using the top down layout.");
        mLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        centerM.add(mLabel);

        JButton mButton = new JButton("Im a button, rn I do nothing in the middle.");
        mButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        centerM.add(mButton);
       
        JButton lButton = new JButton("Im a button, rn I do nothing on the left.");
        lButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        leftM.add(lButton);

        JButton rButton = new JButton("Im a button, rn I do nothing on the right.");
        rButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        rightM.add(rButton);

        JButton bButton = new JButton("Im a button, rn I do nothing on the bottom.");
        bButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        bottomM.add(bButton);

        topM.setBackground(Color.red);
        centerM.setBackground(Color.blue);
        leftM.setBackground(Color.green);
        rightM.setBackground(Color.green);
        bottomM.setBackground(Color.red);

        master.add(centerM, BorderLayout.CENTER);
        master.add(topM, BorderLayout.PAGE_START);
        
        master.add(bottomM, BorderLayout.SOUTH); 
        master.add(rightM, BorderLayout.EAST); 
        master.add(leftM, BorderLayout.WEST);

        frame.add(master);
    }
}
