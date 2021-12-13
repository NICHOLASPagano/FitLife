public class Workout()
{
  private String days;
  private String workout;
  private int reps;
  private int sets;
  private int numLifts;
  
  public Workout(String d)
  {
    days = d;
    setWorkout();
    setReps();
    SetSets();
  }
  public Workout()
  {
    System.out.println("Please Enter the day of the week: ");
    /*
    *scanner method for entry of values from GUI
    */
  }
  public String toString()
  {
      return "[Day]\n" + days + "\n [lifts]\n" + workoutList();
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
    //Setters
    //Getters
    public int getReps()
    {
        return reps;
    }
    public int getSets()
    {
        return sets;
    }
    //Getters
    //Input
    public repsInput()
    {
     System.out.println("Enter number of reps: ");
     reps = Scan.nextInt();
    }
    public setsInput()
    {
     System.out.println("Enter number of sets: ");
     sets = Scan.nextInt();
    }
  //Input
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
        System.out.print("\n\t\t\t" + repsInput() + " X " + setsInput() + "\t\t");
      }
      
    }
}
