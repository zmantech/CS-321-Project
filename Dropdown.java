import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BoxLayout; 
import java.awt.Component; 



public class Dropdown {

    /**
     * The panel to put the dropdown.
     */
    JPanel panel;

    /**
     * This is all of the choices for this dropdown.
     */
    public String[] choices;

    /**
     * This is the actual drop down item.
     */
    public static JComboBox<String> data_dropDown;

    /**
     * The alignment of the dropdown.
     */
    private final float alignment = Component.CENTER_ALIGNMENT;

    /**
     * This is the constructor for the dropdown. This sets and creates the data_dropDown variable.
     * @param choices A string list of each choice in the dropdown.
     * @see data_dropDown
     */
    public Dropdown(String[] list, JPanel panel) {
        choices = list;
        data_dropDown = new JComboBox<String>(choices);
        createDropdown(data_dropDown);
        this.panel = panel;
    }

    /**
     * Inate method called by the constructor to create the JComboBox
     * @param data_dropDown Used to create the JComboBox
     */
    private void createDropdown(JComboBox<String> data_dropDown) {
        data_dropDown.setMaximumSize(data_dropDown.getPreferredSize());
        data_dropDown.setAlignmentX(alignment);
        data_dropDown.setVisible(true);
    }

    /**
     * Add the Dropdown to the JPanel
     * @param data_dropDown Used with the add function from JPanel
     * @see javax.swing.JPanel.add
     */
    public void addDropdown() {
        
        // Code here from alternate class to insert the dropdown to a JPanel.
        panel.add(data_dropDown);
        // Above code used for main testing.
    }

    /**
     * Change the size of the Dropdown.
     * @param data_dropDown Used to change the size variable.
     */
    public void changeSizeDropdown( /* Put variables here. */) {

    }


    

    public static void main(String[] args) {

    JFrame frame = new JFrame("A Simple GUI");
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setLocation(430, 100);

    JPanel panel = new JPanel();

    frame.add(panel);
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

    JLabel lbl = new JLabel("Select one of the possible choices and click OK");
    lbl.setAlignmentX(Component.CENTER_ALIGNMENT);
    lbl.setVisible(true);

    panel.add(lbl);

    String[] choicesTest = { "CHOICE 1","CHOICE 2", "CHOICE 3","CHOICE 4","CHOICE 5","CHOICE 6"};

    /*final JComboBox<String> cb = new JComboBox<String>(choices);
    cb.setMaximumSize(cb.getPreferredSize()); // added code
    cb.setAlignmentX(Component.CENTER_ALIGNMENT);
    cb.setVisible(true);*/

    // BELOW IS TEST OF DROPDOWN CLASS

    Dropdown test = new Dropdown(choicesTest, panel);

    test.addDropdown();

    // END TEST

    JButton btn = new JButton("OK");
    btn.setAlignmentX(Component.CENTER_ALIGNMENT);
    panel.add(btn);

    }
}
