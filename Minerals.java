import java.util.Hashtable;
public class Minerals {
    /**
     * Essential Minerals per the NCCIH standards: Calcium, Phosphorus, Potassium, Sodium, Chloride, Magnesium, Iron, Zinc, Iodine, Sulfur, Cobalt, Copper, Fluoride, Magnessium, Selenium, etc.
     * New ones: Boron, Vanadium, Molybendium, Chromium, etc. Add more if found.
     */
    private final String[] AllMinerals = {"calcium", "phosphorus", "potassium", "sodium", "chloride", "magnesium", "iron", "zinc", "iodine", "sulfur", "cobalt", "copper", 
    "fluoride", "magnessium", "selenium", "boron", "vanadium", "molybendium", "chromium"};

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
    public String[] getAllMineralStrings() {
        return this.AllMinerals;
    }
}
