/**
 * the exercise class to find out what exercises people should do to develop a certain muscle.
 */
public class Exercise {
    /**
     * the exercises the person is gonna do.
     */
    private String exercise;

    /**
     * the amount of the exercise the person should do.
     */
    private String amount;
    /**
     * creates an exercises object which can hold a string representing the exercise itself and the amout being how much to do.
     */
    public Exercise(String exercise, String amount) {
            this.exercise = exercise;
            this.amount = amount;
    }

    /**
     * the exercise the person should do.
     * @return the exercise the person should do for that specific muscle.
     */
    public String getExercise() {
        return this.exercise;
    }

    /**
     * the amount of an exercise a person should do.
     * @return  a string to print to show how much exercise the person should do.
     */
    public String getAmount() {
        return this.amount;
    }

    //list of some sports to print. no we arent going to list every sport in history.
    //Recommend using a loop to call GetSportDifficulty(SomeSports[i], int difficulty) for group dropdowns
    private final String SomeSports[] = {"Basketball", "Baseball", "Football/Soccer", 
    "American Football", "Ice Hockey", "Volleyball", "Tennis", "MMA"};

    /**
     * Lists all sports and an overview for each of them from SomeSports[]. Feel free to adjust for Panel printing.
     * @return  a string to print to show how much exercise the person should do.
     */
    public String SportsList()
    {
    StringBuilder Listing = new StringBuilder();
       for(int i = 0; i < SomeSports.length; i++) 
        { Listing.append(SomeSports[i]); Listing.append(SportsOverview(i)); Listing.append("\n"); }
        return Listing.toString();
    }

    /**
     * Displays the Beginner description for a select sport from SomeSports[].
     * @return  a Beginner description for a sport.
     */
    public String SportsOverview(int i)
    {
        switch(i)
        {
        case 0: return "Basketball is a team based ball game in which both teams bounce a rubber leather ball and try to drain it into a suspended hoop with a net in a rectangular space. Whoever scores the most balls in hoops wins.";
        case 1: return "";
        case 2: return "";
        case 3: return "";
        case 4: return "";
        case 5: return "";
        case 6: return "";
        case 7: return "";
        default: return "Invalid sport";    
        }
    }

    /**
     * returns info based on difficulty. For each dropdown to invoke. Feel free to adjust for Panel printing.
     * @return  a string to print to show how much exercise the person should do.
     */
    public String GetSportDifficulty(String Sport, int difficulty)
    {
        for(int i = 0; i < SomeSports.length; i++)
         { 
            if(!Sport.equals(SomeSports[i])) continue;
            //1 = beginner, 2 = Intermediate, 3 = advanced
            switch(difficulty)
            {
            case 1: return SportsBeginner(i);
            case 2: return SportsIntermediate(i);
            case 3: return SportsAdvanced(i);
            }
         }
         return "Invalid sport"; //sport is not in SomeSports[]
    }


    /**
     * Displays the Beginner description for a select sport from SomeSports[].
     * @return  a Beginner description for a sport.
     */
    public String SportsBeginner(int i)
    {
        switch(i)
        {
        case 0: return "The beginner stages of Basketball usually revolve around personal practice, active learning of its rules and fundamentals, and recreational games with new and other people playing at or around your current level.";
        case 1: return "";
        case 2: return "";
        case 3: return "";
        case 4: return "";
        case 5: return "";
        case 6: return "";
        case 7: return "";
        default: return "Invalid sport";    
        }
    }

    /**
     * Displays the Intermediate description for a select sport from SomeSports[].
     * @return  an Intermediate description for a sport.
     */
    public String SportsIntermediate(int i)
    {
        switch(i)
        {
        case 0: return "The Intermediate stages of Basketball mean you as a player know all the rules and fundamentals including Role Designation, Timers, Fouls, Penalties, free point throws, etc. At this point, you are eligible for more competitive games with others around your skill level.";
        case 1: return "";
        case 2: return "";
        case 3: return "";
        case 4: return "";
        case 5: return "";
        case 6: return "";
        case 7: return "";
        default: return "Invalid sport";    
        }
    }

    /**
     * Displays the Advanced description for a select sport from SomeSports[].
     * @return  an Advanced description for a sport.
     */
    public String SportsAdvanced(int i)
    {
        switch(i)
        {
        case 0: return "At this point, you know mostly everything about Basketball including mastery of fundamentals, muscle memory for actions made during a Basketball game, playstyles, and techniques. At this point, you are in the top percentile of player based skill but still not at a pro level.";
        case 1: return "";
        case 2: return "";
        case 3: return "";
        case 4: return "";
        case 5: return "";
        case 6: return "";
        case 7: return "";
        default: return "Invalid sport";    
        }
    }
}