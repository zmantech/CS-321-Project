import java.io.*;
import java.util.*; 

/**
 * all methods should be static.
 * should be a reader and writer class.
 */
public class File {
    
    /**
     * a getter that opens a file and gets the first name
     * @param file  the file to check for the first name
     * @return      "" if an error otherwise the first name
     */
    public static String getFirstName(String file) {

        try {
            File myFile = new File(file);
            Scanner myScanner = new Scanner(myFile);

            while(myScanner.hasNextLine()) {
                String line = myScanner.nextLine();
                
                if(line.substring(line.charAt(' ')).equals("FIRST_NAME: "))
                    return line.substring(line.charAt(' ') + 1);

            }

        } catch (Exception e) {
            return "";
        }
    }

    /**
     * a getter that opens a file and gets the last name
     * @param file  the file to check for the last name
     * @return      "" if an error otherwise the last name
     */
    public static String getLastName(String file) {

        try {
            File myFile = new File(file);
            Scanner myScanner = new Scanner(myFile);

            while(myScanner.hasNextLine()) {
                String line = myScanner.nextLine();
                
                if(line.substring(line.charAt(' ')).equals("LAST_NAME: "))
                    return line.substring(line.charAt(' ') + 1);

            }

        } catch (Exception e) {
            return "";
        }
    }

    /**
     * a method to get the weight out of a file.
     * @param file  the file to check for the WEIGHT
     * @return      -1 if an error the weight in lbs otherwise
     */
    public static int getWeight(String file) {

        try {
            File myFile = new File(file);
            Scanner myScanner = new Scanner(myFile);

            while(myScanner.hasNextLine()) {
                String line = myScanner.nextLine();
                
                if(line.substring(line.charAt(' ')).equals("WEIGHT: "))
                    return Integer.parseInt(line.substring(line.charAt(' ') + 1));

            }

        } catch (Exception e) {
            return -1;
        }
    }

    /**
     * a method to get the age of a file.
     * @param file  the file to check for the age
     * @return      -1 if an error the age in years otherwise
     */
    public static int getAge(String file) {

        try {
            File myFile = new File(file);
            Scanner myScanner = new Scanner(myFile);

            while(myScanner.hasNextLine()) {
                String line = myScanner.nextLine();
                
                if(line.substring(line.charAt(' ')).equals("AGE: "))
                    return Integer.parseInt(line.substring(line.charAt(' ') + 1));

            }

        } catch (Exception e) {
            return -1;
        }
    }

    /**
     * a method to open a file and get the feet out of that file.
     * @param file  the file to check for the feet
     * @return      -1 if an error the feet otherwise
     */
    public static int getFeet(String file) {

        try {
            File myFile = new File(file);
            Scanner myScanner = new Scanner(myFile);

            while(myScanner.hasNextLine()) {
                String line = myScanner.nextLine();
                
                if(line.substring(line.charAt(' ')).equals("FEET: "))
                    return Integer.parseInt(line.substring(line.charAt(' ') + 1));

            }

        } catch (Exception e) {
            return -1;
        }
    }

    /**
     * opens a file and gets the inches from that file.
     * @param file  the file to check for the inches
     * @return      -1 if an error the inches otherwise remaning from the feet.
     */
    public static int getInches(String file) {

        try {
            File myFile = new File(file);
            Scanner myScanner = new Scanner(myFile);

            while(myScanner.hasNextLine()) {
                String line = myScanner.nextLine();
                
                if(line.substring(line.charAt(' ')).equals("INCHES: "))
                    return Integer.parseInt(line.substring(line.charAt(' ') + 1));

            }

        } catch (Exception e) {
            return -1;
        }
    }

    /**
     * a getter that opens a file and gets the gender
     * @param file  the file to check for the gender
     * @return      the gender otherwise male default
     */
    public static Gender getGender(String file) {

        try {
            File myFile = new File(file);
            Scanner myScanner = new Scanner(myFile);

            while(myScanner.hasNextLine()) {
                String line = myScanner.nextLine();
                
                if(line.substring(line.charAt(' ')).equals("GENDER: ")) {
                    if(line.substring(line.charAt(' ') + 1).equals("MALE"))
                        return Gender.MALE;
                    else
                        return Gender.FEMALE;
                }

            }

        } catch (Exception e) {
            return Gender.MALE;
        }
    }

    /**
     * takes in a person and filename and saves the person to string to that file.
     * @param person    the person to write to the file uses toString method
     * @param file      the file name to write to
     * @return true if the write was successful false otherwise
     */
    public static boolean savePerson(Person person, String file) {
        try {
            FileWriter writer = new FileWrite(file);//creates writer
            writer.write(person.toString());//uses to string to put person info in file
            writer.close();//closes the pointer
            return true;//ends
        } catch (Exception e) {
            return false;//writing failed
        }
        return false;
    }

}