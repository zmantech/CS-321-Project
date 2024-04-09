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

    public static void createAndShowPersonCreator() {
        frame = new JFrame("Create a Person.");
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        JPanel base = new JPanel();
        base.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setPreferredSize(new Dimension(frame.getWidth(), 50));
        JPanel leftPanel = new JPanel();
        leftPanel.setPreferredSize(new Dimension(50, frame.getHeight()));
        JPanel rightPanel = new JPanel();
        rightPanel.setPreferredSize(new Dimension(50, frame.getHeight()));
        JPanel bottomPanel = new JPanel();
        bottomPanel.setPreferredSize(new Dimension(frame.getWidth(), 50));

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
        JLabel weightLabel = new JLabel("Enter your weight (kg):");
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

        base.add(panel, BorderLayout.CENTER);

        frame.add(base);

        frame.pack();
        frame.setVisible(true);

        OnePerson.person.setFirstName(firstNameField.getText());
        OnePerson.person.setLastName(lastNameField.getText());
        OnePerson.person.setWeight( (int) Double.parseDouble(weightField.getText()));
        OnePerson.person.setInches((int) Double.parseDouble(inchesField.getText()));
        OnePerson.person.setFeet((int) Double.parseDouble(feetField.getText()));
        OnePerson.person.setAge((int) Double.parseDouble(ageField.getText()));

        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                PersonCreatorPanel.createAndShowPersonCreator();
            }
        }
    );}

}
