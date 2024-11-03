package org.example.nivell_3.excercici1.models;

public class Basquet extends News {

    private String competitionName;
    private String club;
    private final String EURO_LEAGUE = "Eurolliga";
    private final String COMPETITION = "ACB";
    private final String CLUB_BARCA = "Barça";
    private final String CLUB_MADRID = "Madrid";

    public Basquet(
            String title,
            String competitionName,
            String club
    ) {
        super(title);
        super.setPrice(250);
        super.setScore(4);
        this.competitionName = competitionName;
        this.club = club;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public double calcularPreuNoticia() {

        double totalPrice = super.getPrice();

        if (competitionName.equalsIgnoreCase(this.EURO_LEAGUE)){
            totalPrice += 75;
        }
        if(club.equalsIgnoreCase(this.CLUB_BARCA)
        || club.equalsIgnoreCase(this.CLUB_MADRID)){
            totalPrice += 75;
        }
        return totalPrice;
    }

    @Override
    public int calcularPuntuacio() {

        int totalScore = super.getScore();

        if(competitionName.equalsIgnoreCase(this.EURO_LEAGUE)){
            totalScore += 3;
        }
        if(competitionName.equalsIgnoreCase(this.COMPETITION)){
            totalScore += 2;
        }
        if(club.equalsIgnoreCase(this.CLUB_BARCA)
                || club.equalsIgnoreCase(this.CLUB_MADRID)
        ){
            totalScore += 1;
        }
        return totalScore;
    }

    @Override
    public String toString() {
        return "Basquet{" +
                "competitionName='" + this.competitionName + '\'' +
                ", club='" + this.club + '\'' +
                '}';
    }
}
