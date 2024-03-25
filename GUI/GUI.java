package GUI;

// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;
// import java.util.*;
/**
 * the class that starts and is the interface with the user and all other code.
 * this should be the only thing with main.
 */
public class GUI extends StartMenu {

    public static void createGUI() {
        doStartMenu();
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