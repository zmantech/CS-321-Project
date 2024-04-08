package GUI;

import Nutrition.*;
import People.*;
import Exercise.Exercise;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import GUI.StartMenu.MenuPanel;

import java.util.*;

public class SportsPanel extends JFrame implements ItemListener {
    /**
     * Master frame.
     */
    public static JFrame frame;

    /**
     * Master panel, layout will always be a Border Layout.
     */
    public static JPanel master;

    /**
     * Below are all of the panels that fit in each section of the Border Layout, they correspond to where they will be by their name.
     * centerM is a cardLayout.
     */
    public static JPanel centerM, topM, leftM, rightM, bottomM;

    /**
     * Constructor for the Exercise panel. This will essentially call all methods and create the panel to be put into the nutrition side.
     * There will be a larger outside panel with the Border Layout.
     * Each section of the Border layout will have a panel based on what information should go there.
     * Finally, there will be added capability to swap between this panel and the intro panel.
     * All sections can be added and changed as needed.
     */
    public SportsPanel(int sport) {
        

        master = new JPanel();
        master.setLayout(new BorderLayout());
        centerM = new JPanel(new CardLayout());
        initializeCenter(sport);
        topM = new JPanel();
        initializeTop();
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
     * This will create the panels for the cardLayout centerM. This will be more specific later on.
     */
    public void initializeCenter(int exercise) {
        // Maintaining Weight
        JPanel card1 = new JPanel();
        card1.setLayout(new BoxLayout(card1, BoxLayout.Y_AXIS));
        /*
        card1.add(new JButton("Button 1"));
        card1.add(new JButton("Button 2"));
        card1.add(new JButton("Button 3"));
        */
        //means it is a sport and should call sports methods
        if(exercise >= 0 && exercise <= 7) {
            addTextToCard(card1, "Beginner:");
            String[] strings = Exercise.SportsBeginner(exercise).split(",");
            for(String str: strings)
                addTextToCard(card1, str);

            addTextToCard(card1, "Intermediate:");
            strings = Exercise.SportsIntermediate(exercise).split(",");
            for(String str: strings)
                addTextToCard(card1, str);

            addTextToCard(card1, "Advanced:");
            strings = Exercise.SportsAdvanced(exercise).split(",");
            for(String str: strings)
                addTextToCard(card1, str);
        }
    }
    /**
     * this method will add the string text to the card and make it center alligned.
     * @param card  the card you wish to add the text to.
     * @param text  the string to add to the card.
     */
    private void addTextToCard(JPanel card, String text) {
        JLabel lab = new  JLabel(text);
        lab.setAlignmentX(CENTER_ALIGNMENT);
        card.add(lab);
    }

    public void initializeTop() {
        //String[] dList = {"Sports", "Weight Lifting", "Cardio"};

        //Dropdown d = new Dropdown(dList);

        //d.getData().addItemListener(this);

        //topM.add(d.getData());

        // Add button to go back.
        JButton back = new JButton("Main menu");
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        frame.dispose();
                        StartMenu.MenuPanel menu = new MenuPanel();
                        menu.MenuPane();
                    }
                });
            }
        });

        topM.add(back);
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

    /**
     * Change the center panel based upon a given panel name.
     * @return
     */

    public JPanel getMasterPanel() {
        return master;
    }
    public JPanel getTopPanel() {
        return topM;
    }

    /**
     * Helps switch the "cards" for centerM.
     * @param evt
     */
    public void itemStateChanged(ItemEvent evt) {
        CardLayout cl = (CardLayout)(centerM.getLayout());
        cl.show(centerM, (String)evt.getItem());
    }

    /**
     * Used with main.
     */
    public static void createAndShowExercise() {
        frame = new JFrame("Testing out Nutrition Panel.");
        //frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        //frame.setSize(500, 500);
        //frame.setLocation(0, 0);

        ExercisePanel nutrition = new ExercisePanel();

        //nutrition.setColor('C', Color.blue);
        nutrition.setColor('T', Color.red);
        nutrition.setColor('L', Color.blue);
        nutrition.setColor('R', Color.blue);
        nutrition.setColor('B', Color.red);

        nutrition.setDimension('T', frame.getWidth(), 100);
        nutrition.setDimension('L', 150, frame.getHeight());
        nutrition.setDimension('R', 150, frame.getHeight());
        nutrition.setDimension('B', frame.getWidth(), 100);
        
        frame.add(nutrition.getMasterPanel());

        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Used with main.
     */
    public static void createAndShowExercise(int sport) {
        frame = new JFrame("Testing out Nutrition Panel.");
        //frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        //frame.setSize(500, 500);
        //frame.setLocation(0, 0);

        SportsPanel nutrition = new SportsPanel(sport);

        //nutrition.setColor('C', Color.blue);
        nutrition.setColor('T', Color.red);
        nutrition.setColor('L', Color.blue);
        nutrition.setColor('R', Color.blue);
        nutrition.setColor('B', Color.red);

        nutrition.setDimension('T', frame.getWidth(), 100);
        nutrition.setDimension('L', 150, frame.getHeight());
        nutrition.setDimension('R', 150, frame.getHeight());
        nutrition.setDimension('B', frame.getWidth(), 100);
        
        frame.add(nutrition.getMasterPanel());

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
            new Runnable() {
                public void run() {
                    createAndShowExercise();
                }
            }
        );

    }
}
