package org.example.nivell_3.excercici1.models;

public class Basquet extends News {

    private String competitionName;
    private String club;

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

        if (competitionName.equalsIgnoreCase("Eurolliga")){
            totalPrice += 75;
        }
        if(club.equalsIgnoreCase("Barça")
        || club.equalsIgnoreCase("Madrid")){
            totalPrice += 75;
        }
        return totalPrice;
    }

    @Override
    public int calcularPuntuacio() {

        int totalScore = super.getScore();

        if(competitionName.equalsIgnoreCase("Eurolliga")){
            totalScore += 3;
        }
        if(competitionName.equalsIgnoreCase("ACB")){
            totalScore += 2;
        }
        if(club.equalsIgnoreCase("Barça")
                || club.equalsIgnoreCase("Madrid")
        ){
            totalScore += 1;
        }
        return totalScore;
    }

    @Override
    public String toString() {
        return "Basquet{" +
                "competitionName='" + competitionName + '\'' +
                ", club='" + club + '\'' +
                '}';
    }
}
