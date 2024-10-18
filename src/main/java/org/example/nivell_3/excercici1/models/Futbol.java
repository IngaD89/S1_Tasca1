package org.example.nivell_3.excercici1.models;

public class Futbol extends News {

    private String competitionName;
    private String club;
    private String player;

    public Futbol(
            String title,
            String competitionName,
            String club,
            String player
    ) {
        super(title);
        super.setPrice(300);
        super.setScore(5);
        this.competitionName = competitionName;
        this.club = club;
        this.player = player;
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

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    @Override
    public double calcularPreuNoticia() {
        double totalPrice = super.getPrice();
        if(competitionName.equalsIgnoreCase("Lliga de Campions")){
            totalPrice += 100;
        }
        if (club.equalsIgnoreCase("Barça")
                || club.equalsIgnoreCase("Madrid")) {
            totalPrice += 100;
        }
        if (player.equalsIgnoreCase("Ferran Torres")
                || player.equalsIgnoreCase("Benzema")) {
            totalPrice += 50;
        }
        return totalPrice;
    }

    @Override
    public int calcularPuntuacio() {
        int totalScore = super.getScore();

        if(competitionName.equalsIgnoreCase("Lliga de Campions")){
            totalScore += 3;
        }
        if(competitionName.equalsIgnoreCase("Lliga")){
            totalScore += 2;
        }
        if(club.equalsIgnoreCase("Barça")
        || club.equalsIgnoreCase("Madrid")
        ){
            totalScore += 1;
        }
        if(player.equalsIgnoreCase("Ferran Torres")
        || player.equalsIgnoreCase("Benzema")
        ){
            totalScore += 1;
        }

        return totalScore;
    }

    @Override
    public String toString() {
        return "Futbol{" +
                "competitionName='" + competitionName + '\'' +
                ", club='" + club + '\'' +
                ", player='" + player + '\'' +
                '}';
    }
}
