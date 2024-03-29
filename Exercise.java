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
}