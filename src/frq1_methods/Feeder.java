package frq1_methods;

public class Feeder {

    /**
     * The amount of food, in grams, currently in the bird feeder; initialized in the constructor and
     * always greater than or equal to zero
     */
    private int currentFood;
    /**
     * Simulates one day with numBirds birds or possibly a bear at the bird feeder,
     * as described in part (a)
     * Precondition: numBirds > 0
     */
    public void simulateOneDay(int numBirds)
    {
        int consumedFood = numBirds * (int)(Math.random() * 41 + 10);
        if(((int)(Math.random() * 100)) <= 5) {
            currentFood = 0;
        } else {
            if(currentFood < consumedFood)
                currentFood = 0;
            else currentFood -= consumedFood;
        }
    }
    /**
     * Returns the number of days birds or a bear found food to eat at the feeder in this simulation,
     * as described in part (b)
     * Preconditions: numBirds > 0, numDays > 0
     */
    public int simulateManyDays(int numBirds, int numDays)
    {
        int i;
        for(i = 0; i < numDays; i++) {
            if (currentFood == 0) return i;
            simulateOneDay(numBirds);
        }
        return i;
    }
// There may be instance variables, constructors, or methods that are not shown


}
