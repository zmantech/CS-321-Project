package GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import People.*;

public class PersonFileCreatorPanel {

    /**
     * Frame
     */
    public static JFrame frame;

    /**
     * Panel
     */
    public static JPanel panel;

    public static void createPersonFileCreatorPanel() {

        frame = new JFrame("Create a Person.");
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        //frame.setSize(720, 500);

        JPanel base = new JPanel();
        base.setLayout(new BoxLayout(base, BoxLayout.Y_AXIS));

        JLabel info = new JLabel("Please enter the full or relative path of where the file is located on your machine in the text field below.");
        JLabel info2 = new JLabel("Example: ...C:\\...\\Documents\\GitHub\\CS-321-Project\\SavedPeople or SavedPeople\\Zachcanter21.txt");
        JLabel info3 = new JLabel("If there are no files inside of the folder mentioned above, please head back to the main menu using the button at the top and click on the button labeled: Create a Person");

        JTextField path = new JTextField("Replace text here");

        JButton savePerson = new JButton("Save Data");
        //savePerson.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel confirmation = new JLabel("You have saved your information!");
        //confirmation.setAlignmentX(Component.CENTER_ALIGNMENT);
        savePerson.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*
                 * Implement how to get data for the Person.
                 */
                // Reference the item listener, this adds the gender.
                String file = path.getText();
                OnePerson.person = new Person(file);

                // Confirmation message here.
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                    PersonCreatorPanel.confirmationFrame.confirmation();
                }});
            }
        });

        JButton back = new JButton("Main menu");
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        frame.dispose();
                        StartMenu.MenuPanel menu = new StartMenu.MenuPanel();
                        menu.MenuPane();
                    }
                });
            }
        });

        base.add(back);

        base.add(info);
        base.add(info2);
        base.add(info3);

        base.add(path);

        base.add(savePerson);

        frame.add(base);

        frame.pack();
        frame.setVisible(true);

    }
}
