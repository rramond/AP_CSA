/*package frq1_methods;

public class DogWalkCompany25
{
    /**
     * Returns the number of dogs, always greater than 0, that are available
     * for a walk during the time specified by hour
     * Precondition: 0 <= hour <= 23

    public int numAvailableDogs(int hour) {

    }
     /* implementation not shown */

    /**
     * Decreases, by numberDogsWalked, the number of dogs available for a walk
     * during the time specified by hour
     * Preconditions: 0 <= hour <= 23
     * numberDogsWalked > 0

    public void updateDogs(int hour, int numberDogsWalked)
    { /* implementation not shown */
    /* There may be instance variables, constructors,
    and methods that are not shown.

    public class DogWalker
    {
      /** The maximum number of dogs this walker can walk simultaneously
      per hour
         private int maxDogs;
    /** The dog-walking company this dog walker is associated with
         private DogWalkCompany25 company;
    /**
     * Assigns max to maxDogs and comp to company
     * Precondition: max > 0

          public DogWalker(int max, DogWalkCompany25 comp) {
          }

    /**
     * Takes at least one dog for a walk during the time specified by
     * hour, as described in part (a)
     * Preconditions: 0 <= hour <= 23
     * maxDogs > 0

          public int walkDogs(int hour){
              int dogsToWalk = Math.min(company.numAvailableDogs(hour), maxDogs);
              company.updateDogs(hour, dogsToWalk);
              return dogsToWalk;
             /* if(company.numAvailableDogs(hour) < maxDogs){
                  company.updateDogs(hour, company.numAvailableDogs(hour));
                  return company.numAvailableDogs(hour);
              }
              company.updateDogs(hour, maxDogs);
              return maxDogs;
              }*/



        /**
     * Performs an entire dog-walking shift and returns the amount
     * earned, in dollars, as described in part (b)
     * Preconditions: 0 <= startHour <= endHour <= 23
     * maxDogs > 0

          public int dogWalkShift(int startHour, int endHour){
              int earnings = 0;
              for (int i = startHour; i <= endHour; i++){
                  int walked = walkDogs(i);
                  earnings += 5*walked;
                  if(walked == maxDogs || (i >=9 && i <=17))
                      earnings += 3;
                  }
              return earnings;
              }



*/