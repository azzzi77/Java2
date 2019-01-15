package lesson1;

public class Team {

    public String teamName;
    private Competitor[] competitors;

    public Team(String teamName, Competitor... competitors) {
        this.teamName = teamName;
        this.competitors = competitors;
    }

    public Competitor[] getCompetitors() {
        return competitors;
    }

    public void showResults() {
        System.out.printf("%s:\n", teamName);
        for (Competitor competitor : competitors) {
            competitor.result();
        }
    }

    public void positiveInfo() {
        System.out.printf("%s positive :\n", teamName);
        for (Competitor competitor : competitors) {
            if (competitor.isOnDistance()) competitor.result();
        }
    }
}