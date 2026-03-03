public class FootballSystem {
    public static void main(String[] args) {
        // Instantiate Messi (LaLiga) and Ronaldo (Premier League)
        LaLigaPlayer messi = new LaLigaPlayer("Lionel Messi", 474, 5000000, 520);
        PremierLeaguePlayer ronaldo = new PremierLeaguePlayer("Cristiano Ronaldo", 103, 4000000, 236);

        // Print details
        System.out.println("--- Football Player Details ---\n");
        messi.displayDetails();
        ronaldo.displayDetails();
    }
}