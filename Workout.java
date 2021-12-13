public class Workout()
{
  private String days;
  private String workout;
  private int reps;
  private int sets;
  private int numLifts;
  
  public Workout(String d, String w, int r, int s)
  {
    days = d;
    workout = w;
    setReps(r);
    SetSets(s);
  }
  public Workout()
  {
    System.out.println("Please Enter the following fields: Day, Workout, Reps, and Sets");
    /*
    *scanner method for entry of values from GUI
    */
  }
  public String toString()
  {
      return "Day: " + days + "\n lifts: " + workoutList();
  }
    //Setters
    public setReps(int r)
    {
        reps = r;
    }
    public setSets(int s)
    {
        sets = s
    }
    public setWorkout()
    {
      workout = //scanmethod
    }
    //Getters
    public int getReps()
    {
        return reps;
    }
    public int getSets()
    {
        return sets;
    }
    public workoutList()
    {
      While (numLifts > 0)
      {
        System.out.print("|" + workout + "|   ");
        numLifts--;
        setWorkout();
      }
      While (numLifts > 0)
      {
        System.out.print("\n" + reps + " X " + sets);
      }
    }
}
