package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import People.OnePerson;

import java.util.*;

public class PersonCreatorPanel {
    
    /**
     * Frame
     */
    public static JFrame frame;

    /**
     * Panel
     */
    public static JPanel panel;

    public PersonCreatorPanel() {
        // Does nothing and we dont need it.
    }

    public static class confirmationFrame {

        public static void confirmation() {
            JFrame confirm = new JFrame("Confirmation.");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel temp = new JPanel();
            JLabel msg = new JLabel("You have saved your information!");
            temp.add(msg);

            confirm.add(temp);

            confirm.pack();
            confirm.setVisible(true);
        }

    }
    
        

    public static void createAndShowPersonCreator() {
        frame = new JFrame("Create a Person.");
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(720, 500);

        JPanel base = new JPanel();
        base.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setPreferredSize(new Dimension(frame.getWidth(), 150));
        JPanel leftPanel = new JPanel();
        leftPanel.setPreferredSize(new Dimension(150, frame.getHeight()));
        JPanel rightPanel = new JPanel();
        rightPanel.setPreferredSize(new Dimension(150, frame.getHeight()));
        JPanel bottomPanel = new JPanel();
        bottomPanel.setPreferredSize(new Dimension(frame.getWidth(), 150));

        base.add(topPanel, BorderLayout.NORTH);
        base.add(leftPanel, BorderLayout.WEST);
        base.add(rightPanel, BorderLayout.EAST);
        base.add(bottomPanel, BorderLayout.SOUTH);


        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel intro = new JLabel("Please enter in your information below. The textfields below each line of text correspond to the question above.");
        panel.add(intro);

        /*
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
        this.gender = gender;
         */
        JLabel firstNameLabel = new JLabel("Enter your first name:");
        JTextField firstNameField = new JTextField(10); // Adjust the size as needed
        JLabel lastNameLabel = new JLabel("Enter your last name:");
        JTextField lastNameField = new JTextField(10);
        JLabel ageLabel = new JLabel("Enter your age:");
        JTextField ageField = new JTextField(5);
        JLabel weightLabel = new JLabel("Enter your weight (lbs):");
        JTextField weightField = new JTextField(5);
        JLabel heightLabel = new JLabel("Enter your height, Feet first:");
        JTextField feetField = new JTextField(3);
        JLabel inchesLabel = new JLabel("Inches");
        JTextField inchesField = new JTextField(3);
        JLabel genderLabel = new JLabel("Select your gender:");
        JComboBox<String> genderComboBox = new JComboBox<>(new String[]{"Male", "Female"});

        panel.add(firstNameLabel);
        panel.add(firstNameField);
        panel.add(lastNameLabel);
        panel.add(lastNameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(weightLabel);
        panel.add(weightField);
        panel.add(heightLabel);
        panel.add(feetField);
        panel.add(inchesLabel);
        panel.add(inchesField);
        panel.add(genderLabel);
        panel.add(genderComboBox);

        

        JButton savePerson = new JButton("Save Data");
        savePerson.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel confirmation = new JLabel("You have saved your information!");
        confirmation.setAlignmentX(Component.CENTER_ALIGNMENT);
        savePerson.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OnePerson.person.setFirstName(firstNameField.getText());
                OnePerson.person.setLastName(lastNameField.getText());
                OnePerson.person.setWeight( (int) Double.parseDouble(weightField.getText()));
                OnePerson.person.setInches((int) Double.parseDouble(inchesField.getText()));
                OnePerson.person.setFeet((int) Double.parseDouble(feetField.getText()));
                OnePerson.person.setAge((int) Double.parseDouble(ageField.getText()));
                People.Ourfile.savePerson(OnePerson.person);
                // Confirmation message here.
                /*
                panel.add(confirmation);
                frame.repaint();
                */
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                    confirmationFrame.confirmation();
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

        panel.add(savePerson);
        base.add(back, BorderLayout.NORTH);

        base.add(panel, BorderLayout.CENTER);

        frame.add(base);

        frame.pack();
        frame.setVisible(true);

        /*

        weightField.addMouseListener(new MouseAdapter() {
            @Override
             public void mousePressed(MouseEvent evt) {
                if(evt.getSource() == weightField){
                    int data = Integer.parseInt(weightField.getText());
                    OnePerson.person.setWeight(data);
                }
            }
        });
        inchesField.addMouseListener(new MouseAdapter() {
            @Override
             public void mousePressed(MouseEvent evt) {
                if(evt.getSource() == inchesField){
                    int data = Integer.parseInt(inchesField.getText());
                    OnePerson.person.setInches(data);
                }
            }
        });
        feetField.addMouseListener(new MouseAdapter() {
            @Override
             public void mousePressed(MouseEvent evt) {
                if(evt.getSource() == feetField){
                    int data = Integer.parseInt(feetField.getText());
                    OnePerson.person.setFeet(data);
                }
            }
        });
        ageField.addMouseListener(new MouseAdapter() {
            @Override
             public void mousePressed(MouseEvent evt) {
                if(evt.getSource() == ageField){
                    int data = Integer.parseInt(ageField.getText());
                    OnePerson.person.setAge(data);
                }
            }
        });
        */

        /*
        OnePerson.person.setFirstName(firstNameField.getText());
        OnePerson.person.setLastName(lastNameField.getText());
        OnePerson.person.setWeight( (int) Double.parseDouble(weightField.getText()));
        OnePerson.person.setInches((int) Double.parseDouble(inchesField.getText()));
        OnePerson.person.setFeet((int) Double.parseDouble(feetField.getText()));
        OnePerson.person.setAge((int) Double.parseDouble(ageField.getText()));
        */
        
    }

    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                PersonCreatorPanel.createAndShowPersonCreator();
            }
        }
    );}

}
