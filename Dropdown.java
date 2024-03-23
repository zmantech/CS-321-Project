import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Dropdown extends JComboBox<String>  {

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
    public JComboBox<String> data_dropDown;

    /**
     * The alignment of the dropdown.
     */
    private float alignment = Component.CENTER_ALIGNMENT;

    /**
     * Location x coordinate
     */
    private int xCoord;
    /**
     * Location y coordinate
     */
    private int yCoord;

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
    public Dropdown(String[] list) {
        choices = list;
        data_dropDown = new JComboBox<String>(choices);
        width = 0;
        height = 0;
        createDropdown();
    }
    /**
     * This is the constructor for the dropdown. This sets and creates the data_dropDown variable.
     * @param list A string list of each choice in the dropdown.
     * @see data_dropDown
     */
    public Dropdown(String[] list, int width, int height, int xCoord, int yCoord) {
        choices = list;
        data_dropDown = new JComboBox<String>(choices);
        this.width = width;
        this.height = height;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        createDropdownWidthHeight();
    }

    /**
     * Inate method called by the constructor to create the JComboBox.
     */
    private void createDropdown() {
        data_dropDown.setMaximumSize(data_dropDown.getPreferredSize());
        data_dropDown.setAlignmentX(alignment);
        data_dropDown.setVisible(true);
        //data_dropDown.addItemListener(listener);
    }

    private void createDropdownWidthHeight() {
        data_dropDown.setPreferredSize(new Dimension(width,height));
        data_dropDown.setMaximumSize(data_dropDown.getPreferredSize());
        // data_dropDown.setAlignmentX(alignment);
        data_dropDown.setLocation(xCoord, yCoord);
        data_dropDown.setVisible(true);
        data_dropDown.addItemListener(listener);
    }

    /**
     * Add the Dropdown to the JPanel
     * @see panel The JPanel this Dropdown is being added to.
     * @see javax.swing.JPanel.add
     */
    public void addDropdown(JPanel panel) {
        jpanel = panel;
        jpanel.add(data_dropDown);
    }
    /**
     * Get the data_dropDown
     * @return
     */
    public JComboBox<String> getData() {
        return data_dropDown;
    }

    /**
     * Gets the selected item from the dropdown and returns it as a string.
     * @return The string from whichever spot the dropdown is on.
     */
    public String getSelectedItem() {
        return (String) data_dropDown.getSelectedItem();
    }
    

    public static void main(String[] args) {

    JFrame frame = new JFrame("A Simple GUI");
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1920, 1080);
    frame.setLocation(430, 100);

    JPanel panel = new JPanel();

    frame.add(panel);
    // panel.setLayout(new FlowLayout());
    panel.setLayout(null);

    JLabel lbl = new JLabel("Select one of the possible choices and click OK");
    // lbl.setAlignmentX(Component.CENTER_ALIGNMENT);
    lbl.setBounds(300, 0, 200, 100);
    lbl.setVisible(true);

    panel.add(lbl);

    String[] choicesTest = { "CHOICE 1","CHOICE 2", "CHOICE 3","CHOICE 4","CHOICE 5","CHOICE 6"};

    /*JComboBox<String> cb = new JComboBox<String>(choices);
    cb.setMaximumSize(cb.getPreferredSize()); // added code
    cb.setAlignmentX(Component.CENTER_ALIGNMENT);
    cb.setVisible(true);*/

    // BELOW IS TEST OF DROPDOWN CLASS

    Dropdown test = new Dropdown(choicesTest);
    Dropdown test2 = new Dropdown(choicesTest, 500, 100, 50, 50);
    
    panel.add(test.getData());

    // END TEST

    JButton btn = new JButton("OK");
    // btn.setAlignmentX(Component.CENTER_ALIGNMENT);
    btn.setBounds(100, 100, 100, 50);

    panel.add(btn);

    }

    
}
