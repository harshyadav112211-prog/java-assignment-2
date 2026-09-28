public class Q7_Team {

    // Abstract Team Base Class
    public static abstract class Team {
        protected String name;
        protected int matchesPlayed;
        protected int wins;
        protected int draws;

        // Parameterized Constructor
        public Team(String name, int matchesPlayed, int wins, int draws) {
            this.name = name;
            this.matchesPlayed = matchesPlayed;
            this.wins = wins;
            this.draws = draws;
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getMatchesPlayed() {
            return matchesPlayed;
        }

        public void setMatchesPlayed(int matchesPlayed) {
            this.matchesPlayed = matchesPlayed;
        }

        public int getWins() {
            return wins;
        }

        public void setWins(int wins) {
            this.wins = wins;
        }

        public int getDraws() {
            return draws;
        }

        public void setDraws(int draws) {
            this.draws = draws;
        }

        // Abstract method for calculating points
        public abstract int calculatePoints();

        @Override
        public abstract String toString();
    }

    // Cricket Team Class
    public static class CricketTeam extends Team {
        public CricketTeam(String name, int matchesPlayed, int wins, int draws) {
            super(name, matchesPlayed, wins, draws);
        }

        @Override
        public int calculatePoints() {
            // Cricket: win=2, draw=1
            return (wins * 2) + (draws * 1);
        }

        @Override
        public String toString() {
            return "Team: " + name + " (Cricket) Points: " + calculatePoints();
        }
    }

    // Football Team Class
    public static class FootballTeam extends Team {
        public FootballTeam(String name, int matchesPlayed, int wins, int draws) {
            super(name, matchesPlayed, wins, draws);
        }

        @Override
        public int calculatePoints() {
            // Football: win=3, draw=1
            return (wins * 3) + (draws * 1);
        }

        @Override
        public String toString() {
            return "Team: " + name + " (Football) Points: " + calculatePoints();
        }
    }

    public static void main(String[] args) {
        // Create Cricket Team
        Team cricketTeam = new CricketTeam("India", 10, 6, 2);
        System.out.println(cricketTeam);

        // Create Football Team
        Team footballTeam = new FootballTeam("Barcelona", 8, 6, 1);
        System.out.println(footballTeam);
    }
}
