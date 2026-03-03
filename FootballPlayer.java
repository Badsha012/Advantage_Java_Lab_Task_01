abstract class FootballPlayer {
    private String name;
    private int goals;
    private double monthlySalary; 

    public FootballPlayer(String name, int goals, double monthlySalary) {
        this.name = name;
        this.goals = goals;
        this.monthlySalary = monthlySalary;
    }

    // Abstract method to be implemented by subclasses
    public abstract double calculateGoalRate();

   
    public String getName() { return name; }
    public int getGoals() { return goals; }
}