class PremierLeaguePlayer extends FootballPlayer {
    private int matchesPlayed;
    private String league = "Premier League";

    public PremierLeaguePlayer(String name, int goals, double monthlySalary, int matchesPlayed) {
        super(name, goals, monthlySalary);
        this.matchesPlayed = matchesPlayed;
    }

    @Override
    public double calculateGoalRate() {
        return (double) getGoals() / matchesPlayed;
    }

    public void displayDetails() {
        System.out.println("Player: " + getName());
        System.out.println("League: " + league);
        System.out.println("Goals: " + getGoals());
        System.out.printf("Goal Rate: %.2f\n", calculateGoalRate());
        System.out.println("---------------------------");
    }
}