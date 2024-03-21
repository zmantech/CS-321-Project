import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class NutritionPanel extends JFrame {

    /**
     * Master panel, layout will always be a Border Layout.
     */
    public JPanel master;

    /**
     * Below are all of the panels that fit in each section of the Border Layout, they correspond to where they will be by their name.
     */
    public static JPanel centerM, topM, leftM, rightM, bottomM;

    /**
     * Constructor for the nutrition panel. This will essentially call all methods and create the panel to be put into the nutrition side.
     * There will be a larger outside panel with the Border Layout.
     * Each section of the Border layout will have a panel based on what information should go there.
     * Finally, there will be added capability to swap between this panel and the intro panel.
     * All sections can be added and changed as needed.
     */
    public NutritionPanel() {
        master = new JPanel();
        master.setLayout(new BorderLayout());
        centerM = new JPanel();
        topM = new JPanel();
        leftM = new JPanel();
        rightM = new JPanel();
        bottomM = new JPanel();

        master.add(centerM, BorderLayout.CENTER);
        master.add(topM, BorderLayout.PAGE_START);
        master.add(bottomM, BorderLayout.SOUTH); 
        master.add(rightM, BorderLayout.EAST); 
        master.add(leftM, BorderLayout.WEST);
    }

    /**
     * The following methods will add something to a panel, button, label, etc.
     * According to the name of the method, it will go to that panel.
     * Since the second argument is an JComponent to be added to the panel of that given char.
     * @param panel A char character that is C, T, L, R, B. This references Center, Top, Left, Right, and Bottom panels.
     */
    public <T extends JComponent> void addtoPanel(char panel, T component) {
        switch(panel) {
            case 'C':
            centerM.add(component);
            break;
            case 'T':
            topM.add(component);
            break;
            case 'L':
            leftM.add(component);
            break;
            case 'R':
            rightM.add(component);
            break;
            case 'B':
            bottomM.add(component);
            break;
            default:
            System.out.println("Use only: C, T, L, R, B. This references Center, Top, Left, Right, and Bottom panels.");
            break;
        }
        
    }
    /**
     * Set the Dimension of one of the nested panels of this panel to change the look overall.
     * @param panel A char character that is C, T, L, R, B. This references Center, Top, Left, Right, and Bottom panels. 
     * @param width,height These are the sizing coordinates for the dimension.
     */
    public void setDimension(char panel, int width, int height) {
        Dimension d = new Dimension(width, height);
        switch(panel) {
            case 'C':
            centerM.setPreferredSize(d);
            break;
            case 'T':
            topM.setPreferredSize(d);
            break;
            case 'L':
            leftM.setPreferredSize(d);
            break;
            case 'R':
            rightM.setPreferredSize(d);
            break;
            case 'B':
            bottomM.setPreferredSize(d);
            break;
            default:
            System.out.println("Use only: C, T, L, R, B. This references Center, Top, Left, Right, and Bottom panels.");
            break;
        }
    }

    public void setColor(char panel, Color c) {
        switch(panel) {
            case 'C':
            centerM.setBackground(c);
            break;
            case 'T':
            topM.setBackground(c);
            break;
            case 'L':
            leftM.setBackground(c);
            break;
            case 'R':
            rightM.setBackground(c);
            break;
            case 'B':
            bottomM.setBackground(c);
            break;
            default:
            System.out.println("Use only: C, T, L, R, B. This references Center, Top, Left, Right, and Bottom panels.");
            break;
        }
    }

    public JPanel getMasterPanel() {
        return master;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Testing out Nutrition Panel.");
        //frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocation(0, 0);

        NutritionPanel nutrition = new NutritionPanel();

        nutrition.setColor('C', Color.blue);
        nutrition.setColor('T', Color.red);
        nutrition.setColor('L', Color.green);
        nutrition.setColor('R', Color.green);
        nutrition.setColor('B', Color.red);

        nutrition.setDimension('T', frame.getWidth(), 150);
        nutrition.setDimension('L', 200, frame.getHeight());
        nutrition.setDimension('R', 200, frame.getHeight());
        nutrition.setDimension('B', frame.getWidth(), 150);
        
        frame.add(nutrition.getMasterPanel());
    }

}
