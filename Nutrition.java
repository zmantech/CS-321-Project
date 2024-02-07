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
        if(person.getGender() == Gender.MALE) {
            return (float)(66.0 + (6.23 * person.getWeight()) + (12.7 * person.getHeight()) - (6.8 * person.getAge()));
        } else { //female
            return (float)(655 + (4.35 * person.getWeight()) + (4.7 * person.getHeight()) - (4.7 * person.getAge()));
        }
    }

    /**
     * this class will get the amount of protein a person should eat per day.
     * @param person    the person to check their protein.
     * @return          the amount of protein in grams they should eat per day.
     */
    public static float getProtein(Person person) {
        return (float)(person.getWeight() * 0.36);
    }

    /**
     * this class will get the amount of carbohydrates a person should eat per day.
     * @param person    the person to check their carbohydrates.
     * @return          the amount of carbohydrates in grams they should eat per day. 
     */
    public static float getCarbohydrates(Person person) {
        return 0; //placeholder
    }

    /**
     * this class will get the amount of Fat a person should eat per day.
     * @param person    the person to check their Fat.
     * @return          the amount of Fat in grams they should eat per day.
     */
    public static float getFat(Person person) {
        return 0; //placeholder
    }

    /**
     * this class will get the amount of Water a person should drink per day.
     * @param person    the person to check their Hydration.
     * @return          the amount of Water in grams they should drink per day.
     */
    public static float getHydration(Person person) {
        return 0; //placeholder
    }

    /**
     * this class will get the amount of Fiber a person should eat per day.
     * @param person    the person to check their Fiber.
     * @return          the amount of Fiber in grams they should eat per day.
     */
    public static float getFiber(Person person) {
        return 0; //placeholder
    }

    /**
     * this class will get the list of Vitamins a person should eat in a day.
     * @param person    the person to check their Vitamins. *Placeholder to later replace with a structure.
     * @return          the list of Vitamins in grams-micrograms they should eat per day.
     */
    public static Vitamin weightMaintainVitamins(Person person) {  //A double datatype structure(class or list) is needed for all 13+ essential vitamins
        return new Vitamin(); //placeholder
    } //Essential Vitamins per the NCCIH standards: Vitamins A, B(Thiamin, Riboflavin, Niacin, Pantothenic acid, Pyridoxine, Cobalamin, Biotin, Folate Acid), C, D, E, K 

    /**
     * this class will get the list of Minerals a person should eat in a day.
     * @param person    the person to check their Minerals. *Placeholder to later replace with a structure.
     * @return          the amount of Minerals in grams-micrograms they should eat per day.
     */
    public static Minerals weightMaintainMinerals(Person person) { //A double datatype structure(class or list) is needed for all 15+ essential minerals
        return new Minerals(); //placeholder
    } //Essential Minerals per the NCCIH standards: Calcium, Phosphorus, Potassium, Sodium, Chloride, Magnesium, Iron, Zinc, Iodine, Sulfur, Cobalt, Copper, Fluoride, Magnessium, Selenium
}