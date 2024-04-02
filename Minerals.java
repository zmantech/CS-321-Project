import java.util.Hashtable;
public class Minerals {
    /**
     * Essential Minerals per the NCCIH standards: Calcium, Phosphorus, Potassium, Sodium, Chloride, Magnesium, Iron, Zinc, Iodine, Sulfur, Cobalt, Copper, Fluoride, Magnessium, Selenium, etc.
     * New ones: Boron, Vanadium, Molybendium, Chromium, etc. Add more if found.
     */
    private static final String[] AllMinerals = {"calcium", "phosphorus", "potassium", "sodium", "chloride", "magnesium", "iron", "zinc", "iodine", "sulfur", "cobalt", "copper", 
    "fluoride", "manganese", "selenium", "boron", "vanadium", "molybendium", "chromium"};

    //Key pair for Mineral types and their assocaited measurment.
    private Hashtable<String, Double> EssentialM;
    
    /**
     * Constructor that will contain an accesible list of Minerals and their associated data utilzing a hashmap.
     */
    public Minerals() //update Person to Include Minerals Object 
    {
        EssentialM = new Hashtable<>();
        for(int i = 0; i < AllMinerals.length; i++) this.EssentialM.put(AllMinerals[i], 0.0); //add all possible (key)minerals with a default (value)double of 0
    }

    /**
     * getMineralValue accesses the given minerals measurment.
     * @param MineralName is the given mineral.
     * @return the value of the mineral
     */
    public double getMineralValue(String MineralName)
    {
        if(MineralName.isEmpty()) return -1; //default return on incorrect entry
        return EssentialM.get(MineralName.toLowerCase()); //lowercase to fit key parameters
    }

    /**
     * setMineralValue will update the given minerals measurment with a new one .
     * @param MineralName is the given mineral.
     * @param New is the replacement value for the given mineral.
     * @return true if the minerals value was changed and false otherwise.
     */
    public boolean setMineralValue(String MineralName, double New)
    { 
        if(EssentialM.replace(MineralName.toLowerCase(), EssentialM.get(MineralName.toLowerCase()), (Double) New)) return true;
        return false; 
    }
    
    /**
     * this method will all users to user the mineral string so they can use the same array as this classes hashmap.
     * @return  the string array that contains the names of types of minerals.
     */
    public static String[] getAllMineralStrings() {
        return AllMinerals;
    }

    /**
     * a tostring method which returns all the minerals in one string
     * @return the string which contains all the mienrals
     */
    public String toString() {

        String str = "";

        str += "Calcium: " + EssentialM.get("calcium") + " milligrams\n";

        str += "Chloride: " + EssentialM.get("chloride") + " grams\n";

        str += "Chromium: " + EssentialM.get("chromium") + " micrograms\n";

        str += "Copper: " + EssentialM.get("copper") + " micrograms\n";

        str += "Fluoride: " + EssentialM.get("fluoride") + " milligrams\n";

        str += "Iodine: " + EssentialM.get("iodine") + " micrograms\n";

        str += "Iron: " + EssentialM.get("iron") + " milligrams\n";

        str += "Magnesium: " + EssentialM.get("magnesium") + " milligrams\n";

        str += "Manganese: " + EssentialM.get("manganese") + " milligrams\n";

        str += "Molybdenum: " + EssentialM.get("molybendium") + " micrograms\n";

        str += "Phosphorus: " + EssentialM.get("phosphorus") + " milligrams\n";

        str += "Potassium: " + EssentialM.get("potassium") + " milligrams\n";

        str += "Selenium: " + EssentialM.get("selenium") + " micrograms\n";

        str += "Sodium: " + EssentialM.get("sodium") + " milligrams\n";

        str += "Zinc: " + EssentialM.get("zinc") + " milligrams\n";

        return str;
    }
}
