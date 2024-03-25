import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
/**
 * the class that starts and is the interface with the user and all other code.
 * this should be the only thing with main.
 */
public class GUI extends NutritionPanel {

    public static void createGUI() {
        yourButtonName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //f.dispose();
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        createAndShowNutrition();
                    }
                });
            }
        });
    }

    /**
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        //create gui etc here
        //meow
        createGUI();
    }
}