/**
 * class will be called with weight etc other data needed and pass in BSA etc all methods should be static.
 */
public class Nutrition {

    /**
     * this function gets the Basal Metabolic Rate (BMR) of the person who is passed in.
     * @param person    the person to get the bmr of.
     * @return          The bmr of the person.
     */
    public static float getCalories(Person person) {
        if(person.getGender() == gender.MALE) {
            return 66.0 + (6.23 * person.getWeight()) + (12.7 * person.getHeight()) - (6.8 * person.getAge());
        } else { //female
            return 655 + (4.35 * person.getWeight()) + (4.7 * person.getHeight()) - (4.7 * person.getAge());
        }
    }

    /**
     * this class will get the amount of protein a person should eat per day.
     * @param person    the person to check their protein.
     * @return          the amount of protein in grams they should eat per day.
     */
    public static float getProtein(Person person) {
        return person.getWeight() * .36;
    }


}