abstract class FootballPlayer {
    private String name;
    private int goals;
    private double monthlySalary; // Encapsulated (Confidential)

    public FootballPlayer(String name, int goals, double monthlySalary) {
        this.name = name;
        this.goals = goals;
        this.monthlySalary = monthlySalary;
    }

    // Abstract method to be implemented by subclasses
    public abstract double calculateGoalRate();

    // Getters for display purposes
    public String getName() { return name; }
    public int getGoals() { return goals; }
}