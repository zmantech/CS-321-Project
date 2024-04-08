package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.util.*;

public class StartMenu {

    public static JFrame frame;
    
    public static void doStartMenu() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MenuPanel menu = new MenuPanel();
                menu.MenuPane();
            }
        });
    }

    public static void main(String[] args) {
        doStartMenu();
    }

    public static class MenuPanel extends JPanel {

        public void MenuPane() {
            frame = new JFrame("Fitnition");
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            
            JPanel panel = new JPanel(new GridBagLayout());
            panel.setBorder(new EmptyBorder(100, 100, 100, 100));

            //setBorder(new EmptyBorder(100, 100, 100, 100));
            //setLayout(new GridBagLayout());

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            gbc.anchor = GridBagConstraints.NORTH;

            panel.add(new JLabel("<html><h1><strong><i>Fitnition</i></strong></h1><hr></html>"), gbc);

            gbc.anchor = GridBagConstraints.CENTER;
            gbc.fill = GridBagConstraints.HORIZONTAL;

            //JPanel buttons = new JPanel(new GridBagLayout());
            JButton nutrition = new JButton("Nutrition");
            JButton fitness = new JButton("Fitness");
            fitness.setMargin(new Insets(10, 10, 10, 10));
            nutrition.setMargin(new Insets(10, 10, 10, 10));
            //buttons.add(fitness, gbc);
            //buttons.add(nutrition, gbc);

            JButton CreateAPerson = new JButton("Create a Person");
            JButton UploadPerson = new JButton("Upload a file");
            JButton CloseButton = new JButton("Close the Program");
            
            panel.add(Box.createRigidArea(new Dimension(0,20)), gbc);
            panel.add(CreateAPerson, gbc);
            panel.add(UploadPerson, gbc);

            panel.add(Box.createRigidArea(new Dimension(0,20)), gbc);
            panel.add(fitness, gbc);
            panel.add(Box.createRigidArea(new Dimension(0,20)), gbc);
            panel.add(nutrition, gbc);
            panel.add(Box.createRigidArea(new Dimension(0,20)), gbc);
            panel.add(CloseButton, gbc);



            fitness.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                            ExercisePanel.createAndShowExercise();
                        }
                    }
                );}
            });

            nutrition.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                            NutritionPanel.createAndShowNutrition();
                        }
                    }
                );}
            });
            /*
            UploadPerson.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                );}
            });*/

            CloseButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);  
                }
            });

            gbc.weighty = 1;
            //add(buttons, gbc);

            frame.add(panel);

            frame.pack();
            frame.setVisible(true);
        }
    }
}
