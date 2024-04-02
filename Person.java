/**
 * this class will hold all the data for a person in one place.
 */
public class Person {
    
    /**
     * their first name.
     */
    private String firstName;
    /**
     * their last name.
     */
    private String lastName;
    /**
     * their age in years
     */
    private int age;
    /**
     * their weight in lbs.
     */
    private int weight;
    /**
     * the number of feet of how tall they are.
     */
    private int feet;
    /**
     * the amount of inches remaining from feet.
     */
    private int inches;
    /**
     * the gender of the person.
     */
    private Gender gender;

    /**
     * the calories of the person.
     */
    private double calories;

    /**
     * a constructor that builds off of all individual characteristics.
     * @param firstName the person first name
     * @param lastName  the persons last name
     * @param age       the person age in years
     * @param weight    the person weight in lbs
     * @param feet      the persons feet 
     * @param inches    the remainder of the persons height from feet
     * @param gender    the gender of the Person
     * 
     */
    public Person(String firstName, String lastName, int age, int weight, int feet, int inches, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
        this.gender = gender;
        if(gender == Gender.MALE) {
            this.calories = (double)(66.0 + (6.23 * weight) + (12.7 * this.getHeight()) - (6.8 * age));
        } else { //female
            this.calories = (double)(655 + (4.35 * weight) + (4.7 * this.getHeight()) - (4.7 * age));
        }
    }


    /**
     * a constructor that builds off a relative file.
     * @param file this constructor will build a person object using a string that is the location of a file
     */
    public Person(String file) {
        this.firstName = Ourfile.getFirstName(file);
        this.lastName = Ourfile.getLastName(file);
        this.age = Ourfile.getAge(file);
        this.weight = Ourfile.getWeight(file);
        this.feet = Ourfile.getFeet(file);
        this.inches = Ourfile.getInches(file);
        this.gender = Ourfile.getGender(file);
        if(gender == Gender.MALE) {
            this.calories = (double)(66.0 + (6.23 * weight) + (12.7 * this.getHeight()) - (6.8 * age));
        } else { //female
            this.calories = (double)(655 + (4.35 * weight) + (4.7 * this.getHeight()) - (4.7 * age));
        }
    }

    /**
     * a getter for the persons first name.
     * @return the persons first name
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * a getter for the last name.
     * @return the persons last name
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * a getter for the full name.
     * @return the persons first name + last name
     */
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    /**
     * a getter for  the persons age.
     * @return  the persons age
     */
    public int getAge() {
        return this.age;
    }

    /**
     * a getter for the persons age in months.
     * @return  the amount of months of a persons age
     */
    public int getAgeMonths() {
        return this.age * 12;
    }

    /**
     * a getter for the weight.
     * @return  the weight of the individual in lbs
     */
    public int getWeight() {
        return this.weight;
    }

    /**
     * a getter for feet.
     * @return  the feet of the persons height
     */
    public int getFeet() {
        return this.feet;
    }

    /***
     * a getter for the persons remainder inches after feet.
     * @return  the number of inches not in the persons feet
     */
    public int getInches() {
        return this.inches;
    }

    /**
     * a getter that adds the feet to the total num of inches.
     * @return  an int of the persons total height
     */
    public int getHeight() {
        return this.feet * 12 + this.inches;
    }

    /**
     * a getter for the persons gender.
     * @return  the gender of the individual
     */
    public Gender getGender() {
        return this.gender;
    }

    /**
     * a getter for this persons claories.
     * @return  the calories the person needs to eat daily.
     */
    public double getCalories() {
        return this.calories;
    }

    /**
     * a setter for the firstname.
     * @param firstName the first name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * a setter for the last name.
     * @param lastName  the last name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * a setter for the full name.
     * @param fullName  the full name "FirstName Lastname" to set
     */
    public void setFullName(String fullName) {
        this.firstName = fullName.substring(0, fullName.indexOf(' '));//searchs for the space between first name and lastname
        this.lastName = fullName.substring(fullName.indexOf(' ') + 1);//adds so it doesnnt include the space in the lastname
    }
    
    /**
     * a setter for the age.
     * @param age   the age of the individual in years
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * a setter for the weight.
     * @param weight the weight to set in lbs
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * a setter for the number of feet.
     * @param feet  the feet to set for the individual
     */
    public void setFeet(int feet) {
        this.feet = feet;
    }

    /**
     * a setter for the number of remainder inches in the persons height.
     * @param inches    the inches to set for the individual
     */
    public void setInches(int inches) {
        this.inches = inches;
    }

    /**
     * a setter for the persons total height in inches.
     * @param inches    the total height to set for the person
     */
    public void setHeight(int inches) {
        this.feet = inches / 12;
        this.inches = inches % 12;
    }

    /**
     * a setter for the persons gender.
     * @param gender    the gender to set
     */
    public void setGender(Gender gender) {
        this.gender = gender;       
    }

    /**
     * a setter for the persons calorie count.
     * @param gender    the gender to set
     */
    public void setCalories(int calories) {
        this.calories = calories;       
    }

    /**
     * a to string override method is how the person will be used to write to files.
     * @return the string of the person
     */
    @Override
    public String toString() {
        return "FIRST_NAME: " + this.firstName + "\n" +
                "LAST_NAME: " + this.lastName + "\n" +
                "AGE: " + this.age + "\n" +
                "WEIGHT: " + this.weight + "\n" +
                "HEIGHT_FEET: " + this.feet + "\n" +
                "HEIGHT_INCHES: " + this.inches + "\n" +
                "GENDER: " + this.gender;
    }
    
    /***
     * an equals method to check if one person is equal to another.
     * @param other another object to check if it is a person and equal to this
     * @return  a boolean if the object is a person and equal to this persons
     */
    @Override
    public boolean equals(Object other) {
        if(other == this)
            return true;
        if(!(other instanceof Person))
            return false;
        if(this.firstName.equals(((Person) other).firstName) &&
        this.lastName.equals(((Person) other).lastName) &&
        this.age == ((Person) other).age &&
        this.weight == ((Person) other).weight &&
        this.feet == ((Person) other).feet &&
        this.inches == ((Person) other).inches &&
        this.gender == ((Person) other).gender)
            return true;
        return false;
    }
}