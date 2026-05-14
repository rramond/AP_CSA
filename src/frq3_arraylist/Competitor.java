package frq3_arraylist;
import java.util.ArrayList;
/** A single competitor in the tournament */
public class Competitor {
    private String name;
    private int rank;

    /**
     * Assigns n to name and initialRank to rank
     * Precondition: initialRank >= 1
     */
    public Competitor(String n, int initialRank)
    { /* implementation not shown */ }
/* There may be instance variables, constructors,
and methods that are not shown. */

   /** A match between two competitors */
    public class Match
    {
        public Match(Competitor one, Competitor two)
        { /* implementation not shown */ }
/* There may be instance variables, constructors,
and methods that are not shown. */
    }

    public class Round
    {
        /** The list of competitors participating in this round */
        private ArrayList<Competitor> competitorList;
        /** Initializes competitorList, as described in part (a) */
        public Round(String[] names) {
            competitorList = new ArrayList<Competitor>();
            for(int i = 0 ; i < names.length ; i++)
                competitorList.add(new Competitor(names[i], i+1));
        }

        /**
         * Creates an ArrayList of Match objects for the next round
         * of the tournament, as described in part (b)
         * Preconditions: competitorList contains at least one element.
         * competitorList is ordered from best to worst rank.
         * Postcondition: competitorList is unchanged.
         */
        public ArrayList<Match> buildMatches() {
                ArrayList<Match> currMatch = new ArrayList<Match>();
                int pool = competitorList.size();
                int k = 1;
                if(pool % 2 == 0 ) {
                    for (int i = 0; i < pool / 2; i++)
                        currMatch.add(new Match(competitorList.get(i), competitorList.get(pool-1-i)));
                } else {
                    for(int i = 1; i <= pool/2; i++)
                        currMatch.add(new Match(competitorList.get(i), competitorList.get(pool-i)));
                }
                return currMatch;
        }

    }
}
