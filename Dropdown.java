import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Dropdown implements ItemListener {

    /**
     * The panel to put the dropdown.
     */
    private JPanel jpanel;

    /**
     * This is all of the choices for this dropdown.
     */
    public String[] choices;

    /**
     * The Width and Height of the dropdown, will be 0 for default constructor.
     */
    public int width, height;

    /**
     * This is the actual drop down item.
     */
    public static JComboBox<String> data_dropDown;

    /**
     * The alignment of the dropdown.
     */
    private final float alignment = Component.CENTER_ALIGNMENT;

    /**
     * This is the ItemListener that will state where you are within the dropdown.
     */
    public ItemListener listener;


    /**
     * This is the constructor for the dropdown. This sets and creates the data_dropDown variable.
     * @param list A string list of each choice in the dropdown.
     * @param panel The JPanel this dropdown will be added to.
     * @see data_dropDown
     */
    public Dropdown(String[] list, JPanel panel) {
        choices = list;
        data_dropDown = new JComboBox<String>(choices);
        width = 0;
        height = 0;
        createDropdown();
        jpanel = panel;
    }
    /**
     * This is the constructor for the dropdown. This sets and creates the data_dropDown variable.
     * @param list A string list of each choice in the dropdown.
     * @see data_dropDown
     */
    public Dropdown(String[] list, JPanel panel, int width, int height) {
        choices = list;
        data_dropDown = new JComboBox<String>(choices);
        this.width = width;
        this.height = height;
        createDropdownWidthHeight();
        jpanel = panel;
    }

    /**
     * Inate method called by the constructor to create the JComboBox.
     */
    private void createDropdown() {
        data_dropDown.setMaximumSize(data_dropDown.getPreferredSize());
        data_dropDown.setAlignmentX(alignment);
        data_dropDown.setVisible(true);
        data_dropDown.addItemListener(listener);
    }

    private void createDropdownWidthHeight() {
        data_dropDown.setPreferredSize(new Dimension(width,height));
        data_dropDown.setAlignmentX(alignment);
        data_dropDown.setVisible(true);
        data_dropDown.addItemListener(listener);
    }

    /**
     * Add the Dropdown to the JPanel
     * @see panel The JPanel this Dropdown is being added to.
     * @see javax.swing.JPanel.add
     */
    public void addDropdown() {
        jpanel.add(data_dropDown);
    }

    /**
     * This code will need to be in the larger GUI class, as it will listen for all item events
     */
    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'itemStateChanged'");
    }

    

    public static void main(String[] args) {

    JFrame frame = new JFrame("A Simple GUI");
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1000, 1000);
    frame.setLocation(430, 100);

    JPanel panel = new JPanel();

    frame.add(panel);
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

    JLabel lbl = new JLabel("Select one of the possible choices and click OK");
    lbl.setAlignmentX(Component.CENTER_ALIGNMENT);
    lbl.setVisible(true);

    panel.add(lbl);

    String[] choicesTest = { "CHOICE 1","CHOICE 2", "CHOICE 3","CHOICE 4","CHOICE 5","CHOICE 6"};

    /*JComboBox<String> cb = new JComboBox<String>(choices);
    cb.setMaximumSize(cb.getPreferredSize()); // added code
    cb.setAlignmentX(Component.CENTER_ALIGNMENT);
    cb.setVisible(true);*/

    // BELOW IS TEST OF DROPDOWN CLASS

    Dropdown test = new Dropdown(choicesTest, panel);
    Dropdown test2 = new Dropdown(choicesTest, panel, 20, 10);

    test2.addDropdown();
    

    // END TEST

    JButton btn = new JButton("OK");
    btn.setAlignmentX(Component.CENTER_ALIGNMENT);
    panel.add(btn);

    }

    
}
