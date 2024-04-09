package Exercise;
/**
 * the exercise class to find out what exercises people should do to develop a certain muscle.
 */
public class Exercise {

    //READ: Each int method argument needs to be unique. Add NewLines every 10-ish words: '\n'.
    //Used Ints: SomeSports[0-7].

    //list of some sports to print. no we arent going to list every sport in history.
    //Recommend using a loop to call GetSportDifficulty(SomeSports[i], int difficulty) for group dropdowns
    private static final String SomeSports[] = {"Basketball", "Baseball", "Football/Soccer", 
    "American Football", "Ice Hockey", "Volleyball", "Tennis", "MMA"};

    /**
     * Lists all sports and an overview for each of them from SomeSports[]. Feel free to adjust for Panel printing.
     * @return  a string to print to show how much exercise the person should do.
     */
    public static String SportsList()
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
    public static String SportsOverview(int i)
    {
        switch(i)
        {
        case 0: return "Basketball is a team based ball game in which both teams bounce a rubber leather ball and try to drain it into\n a suspended hoop with a net in a rectangular space. Whoever scores the most balls in hoops wins.";
        case 1: return "Baseball is a team based ball game in which both teams hit a ball made of leather and cork with a hollow bat.\n The goal is to either hit the ball really hard so it lands in a crowd of people or try to run circles around a diamond in a tactical game of tag. ";
        case 2: return "Football/Soccer is a team based ball game in which both teams hit a rubber leather ball into a tiny net cage \nwithout using hands(unless you’re the goalie). Whichever team scores the most balls in the cage wins with the side objective to fake injuries for free points.";
        case 3: return "American Football is a team based ball game in which both teams hit and throw an oblate spheroid rubber leather\n ball until it successfully enters the opposing team's side of the rectangular field. Whoever can score the most points wins. ";
        case 4: return "Ice Hockey is a team based game in which both teams try to fling a rubber puck into a tiny net cage while \nmaneuvering on an icy field with occasional brawls. Whichever team scores the most is the winner.";
        case 5: return "Volleyball is a team based ball game in which both teams hit a rubber ball into the opposing teams quadrant \nwithin the rectangular play field. Quadrants are split into two spaces by a net like banner or barrier. Whoever can hit the opposing team's floor the most is the winner.";
        case 6: return "Tennis is a small team based ball game in which both try to smack a small fiber rubber ball into the opposing \nteams quadrant and have it bounce twice or bounce out of bounds. Quadrants are split into two spaces by a net like banner or barrier. Whoever scores the most points wins.";
        case 7: return "MMA or Mixed Martial Arts is a brutal sport consisting of one on one duels between two fighters using multiple \nfighting techniques and styles. Whoever can knock out their opponent in the caged arena is the victor.";
        default: return "Invalid sport";    
        }
    }

    /**
     * returns info based on difficulty. For each dropdown to invoke. Feel free to adjust for Panel printing.
     * @return  a string to print to show how much exercise the person should do.
     */
    public static String GetSportDifficulty(String Sport, int difficulty)
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
    public static String SportsBeginner(int i)
    {
        switch(i)
        {
        case 0: return "The beginner stages of Basketball usually revolve around personal practice, active learning of its rules and fundamentals,\n and recreational games with new and other people playing at or around your current level.";
        case 1: return "The beginner stages of Baseball usually revolve around personal practice, active learning of its rules and fundamentals,\n and recreational games with new and other people playing at or around your current level.";
        case 2: return "The beginner stages of Football usually revolve around personal practice, active learning of its rules and fundamentals,\n and recreational games with new and other people playing at or around your current level.";
        case 3: return "The beginner stages of American Football usually revolve around personal practice, active learning of its rules and fundamentals,\n and recreational games with new and other people playing at or around your current level.";
        case 4: return "The beginner stages of Ice Hockey usually revolve around personal practice, active learning of its rules and fundamentals,\n and recreational games with new and other people playing at or around your current level.";
        case 5: return "The beginner stages of Volleyball usually revolve around personal practice, active learning of its rules and fundamentals,\n and recreational games with new and other people playing at or around your current level.";
        case 6: return "The beginner stages of Tennis usually revolve around personal practice, active learning of its rules and fundamentals,\n and recreational games with new and other people playing at or around your current level.";
        case 7: return "The beginner stages of MMA usually revolves around serious training, active learning of its rules and technicalities\n like nonlethal play and cheap shots. Sparring with trained professionals who can hold back\n and others around your weight class and skill level are highly recommended.";
        default: return "Invalid sport";    
        }
    }

    /**
     * Displays the Intermediate description for a select sport from SomeSports[].
     * @return  an Intermediate description for a sport.
     */
    public static String SportsIntermediate(int i)
    {
        switch(i)
        {
        case 0: return "The Intermediate stages of Basketball mean you as a player know all the rules and fundamentals\n including Role Designation, Timers, Fouls, Penalties, free point throws, etc. At this point, you are eligible for more competitive games with others around your skill level.";
        case 1: return "The Intermediate stages of Baseball mean you as a player know all the rules and fundamentals\n including Batting types, pitching types, stealing, positioning, roles, foul play, etc. At this point, you are eligible for more competitive games with others around your skill level.";
        case 2: return "The Intermediate stages of Football mean you as a player know all the rules and fundamentals\n including regular roles, passing, penalty cards, penalty kicks, goal kicks, etc. At this point, you are eligible for more competitive games with others around your skill level.";
        case 3: return "The Intermediate stages of American Football mean you as a player know all the rules and fundamentals\n including team formation, penalty kicks, touchdowns, kickoffs, tackles, passing, equipment, etc. At this point, you are eligible for more competitive games with others around your skill level.";
        case 4: return "The Intermediate stages of Ice Hockey mean you as a player know all the rules and fundamentals\n including fighting, shots, rounds/periods, penalty box, guarding, passing, movement, etc. At this point, you are eligible for more competitive games with others around your skill level.";
        case 5: return "The Intermediate stages of Volleyball mean you as a player know all the rules and fundamentals\n including Spikes, Positioning, Bounce Rules, Passing/Comboing, etc. At this point, you are eligible for more competitive games with others around your skill level.";
        case 6: return "The Intermediate stages of Tennis mean you as a player know all the rules and fundamentals\n including Serving, quadrant positioning for service boxes and courts, point scoring system, scoring, etc. At this point, you are eligible for more competitive games with others around your skill level.";
        case 7: return "The Intermediate stages of MMA mean you as a player have a decent arsenal of techniques and conditioning\n to fight properly over a period of time. At this point, you are eligible for more competitive sparring with others around your skill level as well as prepared for self defense if needed.";
        default: return "Invalid sport";    
        }
    }

    /**
     * Displays the Advanced description for a select sport from SomeSports[].
     * @return  an Advanced description for a sport.
     */
    public static String SportsAdvanced(int i)
    {
        switch(i)
        {
        case 0: return "At this point, you know mostly everything about Basketball including mastery of fundamentals, muscle memory for actions\n made during a Basketball game, playstyles, and techniques. At this point, you are in the top percentile of player based skill but still not at a pro level.";
        case 1: return "At this point, you know mostly everything about Baseball including mastery of fundamentals, muscle memory for actions\n made during a Baseball game, playstyles, and techniques. At this point, you are in the top percentile of player based skill but still not at a pro level.";
        case 2: return "At this point, you know mostly everything about Football including mastery of fundamentals, muscle memory for actions\n made during a Football game, playstyles, and techniques. At this point, you are in the top percentile of player based skill but still not at a pro level.";
        case 3: return "At this point, you know mostly everything about American Football including mastery of fundamentals, muscle memory for actions\n made during an American Football game, playstyles, and techniques. At this point, you are in the top percentile of player based skill but still not at a pro level.";
        case 4: return "At this point, you know mostly everything about Ice Hockey including mastery of fundamentals, muscle memory for actions\n made during an Ice Hockey game, playstyles, and techniques. At this point, you are in the top percentile of player based skill but still not at a pro level.";
        case 5: return "At this point, you know mostly everything about Volleyball including mastery of fundamentals, muscle memory for actions\n made during a Volleyball game, playstyles, and techniques. At this point, you are in the top percentile of player based skill but still not at a pro level.";
        case 6: return "At this point, you know mostly everything about Tennis including mastery of fundamentals, muscle memory for actions made\n during a Tennis game, playstyles, and techniques. At this point, you are in the top percentile of player based skill but still not at a pro level.";
        case 7: return "At this point, you know mostly everything about MMA including mastery of fundamentals, muscle memory for actions made during\n a MMA game, playstyles, and techniques. At this point, you are in the top percentile of player based skill but still not at a pro level which requires prep time and study of an opponent.";
        default: return "Invalid sport";    
        }
    }
    /*
     Links/Sources for each sports rules:
      https://official.nba.com/rulebook/
      https://www.mlb.com/official-information 
      https://www.ussoccer.com/referee-program/laws-of-the-game
      https://operations.nfl.com/the-rules/nfl-rulebook/
      https://www.usahockey.com/rulesandresources
      https://usavolleyball.org/play/rules-of-volleyball/
      https://www.itftennis.com/en/about-us/governance/rules-and-regulations/
      https://www.ufc.com/unified-rules-mixed-martial-arts?language_content_entity=en
     */
}