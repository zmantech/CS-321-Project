import java.io.*;
import java.util.*; 

/**
 * all methods should be static.
 * should be a reader and writer class.
 */
public class File {
    //create methods to call which save edit read weight etc
    //this will be what other methods call
    public static int getWeight(String file) {

        try {
            File myFile = new File(file);
            Scanner myScanner = new Scanner(myFile);

            while(myScanner.hasNextLine()) {
                
            }

        } catch (Exception e) {
            return -1;
        }
    }
    /**
     * takes in a person and filename and saves the person to string to that file.
     * @param person    the person to write to the file uses toString method
     * @param file      the file name to write to
     * @return true if the write was successful false otherwise
     */
    public static boolean writePerson(Person person, String file) {
        return true;
    }

}