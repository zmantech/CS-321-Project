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
        case 8: return "The chest is a simple muslce to stimulate and grow.\n Fitnition has found that the best exercises to stimulate chest growth are:\n- A flat press variant\n- A inclined press variant\n- A fly variant \n \n";
        case 9: return "The shoulders are often overcomplicated by many new lifters\n Luckily Fitnition is here to inform that stimulating chest growth only requires:\n- A side delt emphasized exercise\n- A rear delt emphasized exercise\n -A front delt emphasized exercise \n \n";
        case 10: return "The biceps are often seen as the most entertaining muscle group to target among many lifters\n Through research, Fitnition has found the following types of exercises are simply best for shoulder stimulus:\n- A curl variation in the lengthened variation\n- A curl variation targetting the brachialis\n- A curl variation in the shortened position \n \n";
        case 11: return "The triceps are very important for arm development as they are much larger muscles than the biceps\n Finition has found that the only necessary type of exercise for triceps is the tricep extension (With certain variations depending on the experience level) \n \n ";
        case 12: return "While a very painful muscle to train, the quads are very important in an individuals overall physique\n Finition found that the following exercises will effectively every muslce in the quad:\n- A squat variant\n- A leg extension variant\n- An adductor exercise variant \n \n";
        case 13: return "The Hamstrings are coined as \"the bicep of the leg\" due to the lack of complexity in effectively training the muscle\n Fitnition believes the one of or both of the following are all thats required to effectly train the hamstring\n -A leg curl variant\n- A stiff leg deadlift or Romanian dead lift \n \n";
        case 14: return "The calves are debatably more painful than quads, however they are necessary for full development of the leg\n While many people argue calf size depends on genetics, Fitnition has found that an effective calf raise variant will trigger calf growth \n \n";
        case 15: return "The abs are what many consider the pinnacle of an aesthetic physique.\nLucky for you all that is technically required to reveal abdominal muscles are a low body fat percentage (See our nutrition feature)\n However, if an individual wishes to still train the muscle they can opt for a cable crunch \n \n";
        case 16: return "The back compared to most other muscles is a complex muscle to train considering the large quantity back muscles\n Fitnition has found a these exercises to effectively train the entire back:\n- A wide grip pull down or pullup\n- A variant of a row while keeping the arms inline with the body\n- A variant of the row with the arms creating a 45 degree from the sides of the body \n \n";
        case 17: return "Running can look intimidating, it is an amazing way of building endurance, stamina, and functional athleticism.\n With the right steps you can go from barely being able to run a mile to becoming well versed long and short distanced runner. \n \n";   
        case 18: return "Swimming is one of the most efficient ways for staying fit and burning calories.\nSwimming can be a very technical skill, following the necessary steps that Fitnition has provided is very important in becoming a skillful swimmer \n \n";
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
        case 0: return "The beginner stages of Basketball usually revolve around personal practice, active learning of its rules and fundamentals,\n and recreational games with new and other people playing at or around your current level.\n \n";
        case 1: return "The beginner stages of Baseball usually revolve around personal practice, active learning of its rules and fundamentals,\n and recreational games with new and other people playing at or around your current level. \n \n";
        case 2: return "The beginner stages of Football usually revolve around personal practice, active learning of its rules and fundamentals,\n and recreational games with new and other people playing at or around your current level. \n \n";
        case 3: return "The beginner stages of American Football usually revolve around personal practice, active learning of its rules and fundamentals,\n and recreational games with new and other people playing at or around your current level. \n \n";
        case 4: return "The beginner stages of Ice Hockey usually revolve around personal practice, active learning of its rules and fundamentals,\n and recreational games with new and other people playing at or around your current level. \n \n";
        case 5: return "The beginner stages of Volleyball usually revolve around personal practice, active learning of its rules and fundamentals,\n and recreational games with new and other people playing at or around your current level. \n \n";
        case 6: return "The beginner stages of Tennis usually revolve around personal practice, active learning of its rules and fundamentals,\n and recreational games with new and other people playing at or around your current level. \n \n";
        case 7: return "The beginner stages of MMA usually revolves around serious training, active learning of its rules and technicalities\n like nonlethal play and cheap shots. Sparring with trained professionals who can hold back\n and others around your weight class and skill level are highly recommended. \n \n";
        case 8: return "It is advised that beginners build proper form in any of their exercises before incorporating any sort of intensity. \n With that being said the three execises we recommend are the flat benchpress, the incline benchpress, and the lying dumbbell fly.\n With each exercise being done for 3 sets and 8 repititions.\n Fitnition has selected these exercises due to the fact that these exercises require equipment that is the most readily available. \n \n";
        case 9: return "It is advised that beginners build proper form in any of their exercises before incorporating any sort of intensity. \n With that being said the three execises we recommend are the seated overhead dumbbell press, the side delt lateral raise, and the rear delt dumbbell fly,\n with each exercise being done for 3 sets and 8 repititions.\n Fitnition has selected these exercises due to the fact that these exercises require equipment that is the most readily available. \n \n";
        case 10: return "It is advised that beginners build proper form in any of their exercises before incorporating any sort of intensity. \n With that being said the three execises we recommend are the standard dumbbell curl, the hammer dumbbell curl, and the machine preacher curl,\n with each exercise being done for 3 sets and 8 repititions.\n Fitnition has selected these exercises due to the fact that these exercises require equipment that is the most readily available. \n \n";
        case 11: return "It is advised that beginners build proper form in any of their exercises before incorporating any sort of intensity. \n With that being said the only execise we recommend is the cable tricep pushdown preferably with a rope attachment.\n Fitnition has selected this exercise due to the fact that this exercise require equipment that is the most readily available. \n \n";
        case 12: return "It is advised that beginners build proper form in any of their exercises before incorporating any sort of intensity. \n With that being said the execises we recommend are the backsquat, machine leg extension, and the hip adductors.\n Fitnition has selected these exercises due to the fact that these exercises effectively train the most prominant part of the quad. \n \n";
        case 13: return "It is advised that beginners build proper form in any of their exercises before incorporating any sort of intensity. \n With that being said the execises we recommend are either the lying hamstring curl or the seated hamstring curl.\n Fitnition has selected these exercises due to the fact that these exercises are among the easiest to learn and isolate the muscle well. \n \n";
        case 14: return "It is advised that beginners build proper form in any of their exercises before incorporating any sort of intensity. \n With that being said the execises we recommend any variation of a calf raise\n No matter what variation is selected, Fitnition urges new lifters to get a full range of muscle, getting a full stretch on the calf. \n \n";
        case 15: return "Abs are the easiest of all train. Whether you're a beginner, intermediate, or advanced lifter, the only requirement to reveal abdominal muscle is a low enough body fat percentage\n Please see our nutrition feature to find the level of calories to consume to lose weight. \n \n";
        case 16: return "It is advised that beginners build proper form in any of their exercises before incorporating any sort of intensity. \n With that being said the three execises we recommend are the standard barbell bent over row, the underhand bent over row, and a wide grip pullup,\n with each exercise being done for 3 sets and 8 repititions.\n Fitnition has selected these exercises due to the fact that these exercises require equipment that is the most readily available. \n \n";
        case 17: return "Fitnition recommends that new runners become familiar getting outside and moving around\n Start by first walking for extended periods of your time and once comfortable start jogging for an extended period of time at your own pace \n \n";
        case 18: return "Fitnition recommends that new runners become familiar getting in the water and moving around\n Start by learning different strokes and employing those streaks while swimming in the water. \n \n";
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
        case 0: return "The Intermediate stages of Basketball mean you as a player know all the rules and fundamentals\n including Role Designation, Timers, Fouls, Penalties, free point throws, etc. At this point, you are eligible for more competitive games with others around your skill level. \n \n";
        case 1: return "The Intermediate stages of Baseball mean you as a player know all the rules and fundamentals\n including Batting types, pitching types, stealing, positioning, roles, foul play, etc. At this point, you are eligible for more competitive games with others around your skill level. \n \n";
        case 2: return "The Intermediate stages of Football mean you as a player know all the rules and fundamentals\n including regular roles, passing, penalty cards, penalty kicks, goal kicks, etc. At this point, you are eligible for more competitive games with others around your skill level. \n \n";
        case 3: return "The Intermediate stages of American Football mean you as a player know all the rules and fundamentals\n including team formation, penalty kicks, touchdowns, kickoffs, tackles, passing, equipment, etc. At this point, you are eligible for more competitive games with others around your skill level. \n \n";
        case 4: return "The Intermediate stages of Ice Hockey mean you as a player know all the rules and fundamentals\n including fighting, shots, rounds/periods, penalty box, guarding, passing, movement, etc. At this point, you are eligible for more competitive games with others around your skill level. \n \n";
        case 5: return "The Intermediate stages of Volleyball mean you as a player know all the rules and fundamentals\n including Spikes, Positioning, Bounce Rules, Passing/Comboing, etc. At this point, you are eligible for more competitive games with others around your skill level. \n \n";
        case 6: return "The Intermediate stages of Tennis mean you as a player know all the rules and fundamentals\n including Serving, quadrant positioning for service boxes and courts, point scoring system, scoring, etc. At this point, you are eligible for more competitive games with others around your skill level. \n \n";
        case 7: return "The Intermediate stages of MMA mean you as a player have a decent arsenal of techniques and conditioning\n to fight properly over a period of time. At this point, you are eligible for more competitive sparring with others around your skill level as well as prepared for self defense if needed. \n \n";
        case 8: return "Once an individual has mastered form and technique, Fitnition recommends offering intensity into each exercise.\nEssentially, training until failure (while keeping perfect form).\n Intermediates can choose to remain doing the same exercises but could also elect for using dumbbells rather than barbells in each of their benchpress/pressing movements.\nThis variation of pressing movements allows for a more natural arm path and improved range of motion. \n \n";
        case 9: return "Once an individual has mastered form and technique, Fitnition recommends offering intensity into each exercise.\nEssentially, training until failure (while keeping perfect form).\n Intermediates can choose to remain doing the same exercises but could also elect for using cables rather than dumbbells in each of their delt exercises.\nThis variation of delt exercises allows for constant tension on the muscle. \n \n";
        case 10: return "Once an individual has mastered form and technique, Fitnition recommends offering intensity into each exercise.\nEssentially, training until failure (while keeping perfect form). \n \n";
        case 11: return "Once an individual has mastered form and technique, Fitnition recommends offering intensity into each exercise.\nEssentially, training until failure (while keeping perfect form).\n Intermediates can choose to remain doing the same exercise but could also elect for using a a longer rope, for it allows a longer range of motion. \n \n";
        case 12: return "Once an individual has mastered form and technique, Fitnition recommends offering intensity into each exercise.\nEssentially, training until failure (while keeping perfect form). \n \n";
        case 13: return "Once an individual has mastered form and technique, Fitnition recommends offering intensity into each exercise.\nEssentially, training until failure (while keeping perfect form). \n \n";
        case 14: return "Once an individual has mastered form and technique, Fitnition recommends offering intensity into each exercise.\nEssentially, training until failure (while keeping perfect form). \n \n";
        case 15: return "Abs are the easiest of all train. Whether you're a beginner, intermediate, or advanced lifter, the only requirement to reveal abdominal muscle is a low enough body fat percentage\n Please see our nutrition feature to find the level of calories to consume to lose weight. \n \n";
        case 16: return "Once an individual has mastered form and technique, Fitnition recommends offering intensity into each exercise.\nEssentially, training until failure (while keeping perfect form).\n Intermediates can choose to remain doing the same exercises but could also elect for using a pulldown machine rather than doing pullups. \nThe pulldown machine will provide better stability and muscle isolation in the back \n \n";
        case 17: return "Once an individual has become comfortable with a slight jog, individuals should start measuring their run distance.\n Become comfortable with completing an integer amount of miles per run. \n \n";
        case 18: return "Once an individual has become comfortable with a numbe of strokes and being in the water.\n The swimmer at hand should become comfortable with completing an integer amount of laps in the pool during their swimming sessions. \n \n";
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
        case 8: return "Once an individual has reached an advanced status (can effectively train with proper form an intensity) they can select from a wide range of exercises\n While the movements recommended for beginners and intermediates are still viable options, we recommend the use of machines for they promote muscle isolation and stability.\n A flat converging chest press machine, inclined converging chest press machine a, and any variation of a machine or cable fly is what Fitnition recommends.";
        case 9: return "Once an individual has reached an advanced status (can effectively train with proper form an intensity) they can select from a wide range of exercises\n While the movements recommended for beginners and intermediates are still viable options, we recommend the use of machines for they promote muscle isolation and stability.\n An overhead press machine, a side delt lateral raise machine, and a rear delt fly machine is what Fitnition recommends.";
        case 10: return "Once an individual has reached an advanced status (can effectively train with proper form an intensity) they can select from a wide range of exercises\nHowever, unlike other muscle groups, Fitnition believes that the exercises already established are the most viable. Although, this should not discourage anyone from \n experimenting with different movements and exercises." ;
        case 11: return "Once an individual has reached an advanced status (can effectively train with proper form an intensity) they can select from a wide range of exercises\n While the movements recommended for beginners and intermediates are still viable options, we recommend the use of a superset \n(a set of another exercises immediately following the set of another exercise).\n The superset we recommend is the cable tricep pushdown followed by an overhead tricep extension.";
        case 12: return "Once an individual has reached an advanced status (can effectively train with proper form an intensity) they can select from a wide range of exercises\n While the movements recommended for beginners and intermediates are still viable options, we recommend the use of a machine variation of a squat.\n Whether it be a smith machine squat, pengelum squat, or a hack squate machine. For they offer better muscle isolation during training.";
        case 13: return "Once an individual has reached an advanced status (can effectively train with proper form an intensity) they can select from a wide range of exercises\n While the movements recommended for beginners and intermediates are still viable options, we recommend the stiff leg deadlift.\nThis movement enables more weight to be loaded on the hamstring in the case that the lifter becomes to strong for a machine.";
        case 14: return "Once an individual has reached an advanced status (can effectively train with proper form an intensity) they can select from a wide range of exercises\nHowever, unlike other muscle groups, Fitnition believes that the exercises already established are the most viable. Although, this should not discourage anyone from \n experimenting with different movements and exercises." ;
        case 15: return "Abs are the easiest of all train. Whether you're a beginner, intermediate, or advanced lifter, the only requirement to reveal abdominal muscle is a low enough body fat percentage\n Please see our nutrition feature to find the level of calories to consume to lose weight. \n \n";
        case 16: return "Once an individual has reached an advanced status (can effectively train with proper form an intensity) they can select from a wide range of exercises\n While the movements recommended for beginners and intermediates are still viable options, we recommend the use of machines for they promote muscle isolation and stability.\n A machine that enables a row keeping the arms either inline with the body or 45 degrees from the body are proper substitutes for both bent over row movements";
        case 17: return "Once an individual is able to run a set number of miles, they should begin measuring the time it takes to complete those miles\n Advanced runners should be focused on improving those mile times for each run";
        case 18: return "Once an individual is able to run a set number of laps, they should begin measuring the time it takes to complete those laps\n Advanced swimmers should be focused on improving those lap times for each swim";
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