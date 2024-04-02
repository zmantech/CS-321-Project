import java.io.*;
import java.util.*; 

/**
 * class to handle writing and saving a Person object.
 * everything is static and requires either a file string or person object.
 */
public class Ourfile {
    
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
                
                if(line.substring(0,line.indexOf(' ')).equals("FIRST_NAME: ")) {
                    myScanner.close();
                    return line.substring(line.indexOf(' ') + 1);
                }
                    

            }
            myScanner.close();
        } catch (Exception e) {
            return "";
        }
        return "";
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
                
                if(line.substring(0,line.indexOf(' ')).equals("LAST_NAME: ")) {
                    myScanner.close();
                    return line.substring(line.indexOf(' ') + 1);
                }
            }
            myScanner.close();
        } catch (Exception e) {
            return "";
        }
        return "";
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
                
                if(line.substring(0,line.indexOf(' ')).equals("WEIGHT: ")) {
                    myScanner.close();
                    return Integer.parseInt(line.substring(line.indexOf(' ') + 1));
                }
                    

            }
            myScanner.close();
        } catch (Exception e) {
            return -1;
        }
        return -1;
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
                
                if(line.substring(0,line.indexOf(' ')).equals("AGE: ")) {
                    myScanner.close();
                    return Integer.parseInt(line.substring(line.indexOf(' ') + 1));
                }

            }
            myScanner.close();
        } catch (Exception e) {
            return -1;
        }
        return -1;
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
                
                if(line.substring(0,line.indexOf(' ')).equals("FEET: ")) {
                    myScanner.close();
                    return Integer.parseInt(line.substring(line.indexOf(' ') + 1));
                }

            }
            myScanner.close();
        } catch (Exception e) {
            return -1;
        }
        return -1;
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
                
                if(line.substring(0,line.indexOf(' ')).equals("INCHES: ")) {
                    myScanner.close();
                    return Integer.parseInt(line.substring(line.indexOf(' ') + 1));
                }

            }
            myScanner.close();
        } catch (Exception e) {
            return -1;
        }
        return -1;
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
                
                if(line.substring(0,line.indexOf(' ')).equals("GENDER: ")) {
                    if(line.substring(line.indexOf(' ') + 1).equals("MALE")) {
                        myScanner.close();
                        return Gender.MALE;
                    } else {
                        myScanner.close();
                        return Gender.FEMALE;
                    }
                }

            }
            myScanner.close();
        } catch (Exception e) {
            return Gender.MALE;
        }
        return Gender.MALE;
    }

    /**
     * takes in a person and filename and saves the person to string to that file.
     * @param person    the person to write to the file uses toString method
     * @param file      the file name to write to
     * @return true if the write was successful false otherwise
     */
    public static boolean savePerson(Person person, String file) {
        try {
            FileWriter writer = new FileWriter(file);//creates writer
            writer.write(person.toString());//uses to string to put person info in file
            writer.close();//closes the pointer
            return true;//ends
        } catch (Exception e) {
            return false;//writing failed
        }
    }

}