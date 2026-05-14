package frq3_arraylist;

import java.util.ArrayList;

public class WeatherData {
    /** Guaranteed not to be null and to contain only non-null entries */
    private ArrayList<Double> temperatures;
    /**
     * Cleans the data by removing from temperatures all values that are less than
     * lower and all values that are greater than upper, as described in part (a)
     */
    public void cleanData(double lower, double upper)
    {
        for(int i = 0; i < temperatures.size(); i++)
            if(temperatures.get(i) < lower || temperatures.get(i) > upper) {
                temperatures.remove(i);
                i--;
            }
    }
    /**
     * Returns the length of the longest heat wave found in temperatures, as described in
     * part (b)
     * Precondition: There is at least one heat wave in temperatures based on threshold.
     */
    public int longestHeatWave(double threshold)
    {
        int waveLength = 0;
        int maxLen = 0;
       for(int i = 0; i < temperatures.size(); i++){
           if(temperatures.get(i) > threshold)
                    waveLength++;
           else {
               maxLen = Math.max(maxLen, waveLength);
               waveLength = 0;
           }
        }
        return Math.max(maxLen, waveLength);
    }
// There may be instance variables, constructors, and methods that are not shown.
}
