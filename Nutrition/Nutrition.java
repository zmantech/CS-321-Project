package Nutrition;

import People.*;
/**
 * class will be called with weight etc other data needed and pass in BSA etc all methods should be static.
 */
public class Nutrition {

    //note: the macronutrients follow % intake per day. notify if it needs to be changed to literal measurements.

    /**
     * method returns the amount of water a person should drink per day in liters.
     * @param person    the person to check how much water they should drink.
     * @return          the amount of water in liters person should drink per day.
     */
    public static float getWater(Person person) {
        return (float) .5 * person.getWeight();
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
        return (float)(person.getWeight() * 0.5);
    }

    /**
     * this class will get the amount of Fat a person should eat per day.
     * @param person    the person to check their Fat.
     * @return          the amount of Fat in grams they should eat per day.
     */
    public static float getFat(Person person) {
        return (float)(person.getWeight() * 0.275);
    }

    /**
     * this class will get the amount of Fiber a person should eat per day.
     * @param person    the person to check their Fiber.
     * @return          the amount of Fiber in grams they should eat per day.
     */
    public static float getFiber(Person person) {
        return (float)(person.getWeight() * 0.02);
    }

    /**
     * this class will get the list of Vitamins a person should eat in a day.
     * @param person    the person to check their Vitamins. *Placeholder to later replace with a structure.
     * @return          the list of Vitamins in milligrams they should eat per day.
     */
    public static Vitamin getVitamin(Person person) {  //A double datatype structure(class or list) is needed for all 13+ essential vitamins
        Vitamin ret = new Vitamin();
        
        //sets vitamin A depending on gender
        if(person.getGender() == Gender.FEMALE) {
            ret.setA(.7);
            ret.setB1(1.1);
            ret.setB2(1.1);
            ret.setB3(14);
            ret.setC(75);
            ret.setK(0.09);
        } else {
            ret.setA(.9);
            ret.setB1(1.2);
            ret.setB2(1.3);
            ret.setB3(16);
            ret.setC(90);
            ret.setK(0.12);
        }
            

        ret.setB5(5);

        if(person.getAge() <= 50)
            ret.setB6(1.3);
        else {
            if(person.getGender() == Gender.FEMALE)
                ret.setB6(1.5);
            else
                ret.setB6(1.7);
        }

        ret.setB7(0.03);

        ret.setB9(.4);

        ret.setB12(0.0024);

        ret.setE(15);

        return ret; //placeholder
    } //Essential Vitamins per the NCCIH standards: Vitamins A, B(Thiamin, Riboflavin, Niacin, Pantothenic acid, Pyridoxine, Cobalamin, Biotin, Folate Acid), C, D, E, K 

    /**
     * this class will get the list of Minerals a person should eat in a day.
     * @param person    the person to check their Minerals. *Placeholder to later replace with a structure.
     * @return          the amount of Minerals in milligrams they should eat per day.
     */
    public static Minerals getMinerals(Person person) { //A double datatype structure(class or list) is needed for all 15+ essential minerals
        Minerals ret = new Minerals();
        String[] minerals = Minerals.getAllMineralStrings();

        if(person.getAge() <= 50) {
            ret.setMineralValue(minerals[0], 1000);        //calcium

            if(person.getGender() == Gender.FEMALE) {
                ret.setMineralValue("chromium", 0.025);
                ret.setMineralValue("iron", 18);
            } else {//male
                ret.setMineralValue("chromium", 0.035);
                ret.setMineralValue("iron", 8);
            }
        } else {
            ret.setMineralValue(minerals[0], 1200);        //calcium

            if(person.getGender() == Gender.FEMALE) {
                ret.setMineralValue("chromium", 0.02);
            } else {//male
                ret.setMineralValue("chromium", 0.03);
            }
            ret.setMineralValue("fluoride", 4);

            ret.setMineralValue("iron", 8);
        }

        //chlroide
        if(person.getAge() <= 50) {
            ret.setMineralValue(minerals[4], 2300);
        } else if(person.getAge() <= 70) {
            ret.setMineralValue(minerals[4], 2000);
        } else {
            ret.setMineralValue(minerals[4], 1800);
        }

        ret.setMineralValue("copper", 0.9);

        ret.setMineralValue("iodine", 0.15);

        ret.setMineralValue("molybendium", 0.045);

        ret.setMineralValue("phosphorus", 700);

        ret.setMineralValue("selenium", 0.055);

        ret.setMineralValue("sodium", 1500);

        if(person.getAge() <= 30) {
            if(person.getGender() == Gender.FEMALE) {
                ret.setMineralValue("magnesium", 310);
            } else {
                ret.setMineralValue("magnesium", 400);
            }
        } else {
            if(person.getGender() == Gender.FEMALE) {
                ret.setMineralValue("magnesium", 320);
            } else {
                ret.setMineralValue("magnesium", 420);
            }
        }

        if(person.getGender() == Gender.FEMALE) {
            ret.setMineralValue("zinc", 8);
            ret.setMineralValue("manganese", 1.8);
        } else {
            ret.setMineralValue("zinc", 11);
            ret.setMineralValue("manganese", 2.3);
        }

        return ret; //placeholder
    } //Essential Minerals per the NCCIH standards: Calcium, Phosphorus, Potassium, Sodium, Chloride, Magnesium, Iron, Zinc, Iodine, Sulfur, Cobalt, Copper, Fluoride, Magnessium, Selenium

    /**
     * gets the net calorie increase or decrease for daily calorie changes.
     * @param person    persons data used to caluclate the apporximate amount of calories needed to lose weight.
     * @return          current calorie adjusted size based on calorie consumption.
     */
    public static double WeightChange(Person person) {
        double BMR;
        if(person.getGender() == Gender.MALE) {
            BMR = (double)(66.0 + (6.23 * person.getWeight()) + (12.7 * person.getHeight()) - (6.8 * person.getAge()));
        } else { //female
            BMR = (double)(655 + (4.35 * person.getWeight()) + (4.7 * person.getHeight()) - (4.7 * person.getAge()));
        }
        return (BMR + CalorieMaintenance(person));
    }

    /**
     * FEATURE: Determines the Weight loss by comparing consumption over base maintained calorie threshold
     * @param person    persons data used to caluclate the apporximate amount of calories needed to lose weight.
     * @return          true if weight was lost otherwise false meaning weight was gained(including net 0 changes)
     */
    //public static boolean WeightLoss(Person person) {
    //    if(WeightChange(person) < CalorieMaintenance(person) + person.getCalories()) return true; 
    //    return false; 
    //}

    /**
     * FEATURE: will get the number of calories needed to maintain current weight.
     * @param person    persons data used to caluclate the apporximate amount of calories needed to maintain weight.
     * @return          the amount of calories needed to intake to keep your body weight in calories.
     */
    public static double CalorieMaintenance(Person person) {
        return (person.getWeight()*6.8)/7;  // 15lbs to kilogram = 6.80389
    }

    /**
     * FEATURE: will recommend what Nutrients are required for MuscleGain(nothing for the nutrition side).
     */
    public static void MuscleGain() {
        //placeholder for the string to print or modify to return a string with text
        //text: what minerals and nutrients are needed to gain muscle weight when exercising.
        //getVitamins and getMinerals can be used in place of this method. 
        // "Dietary reference intakes suggest that adults consume 45% to 65% of their total calories from carbohydrates, 20% to 35% from fat, and 10% to 35% from protein."
    }
    
}