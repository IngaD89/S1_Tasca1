package org.example.nivell_3.excercici1.models;

public class Futbol extends News {

    private String competitionName;
    private String club;
    private String player;
    private final String LEAGUE_CHAMPIONS = "Lliga de Campions";
    private final String LEAGUE = "Lliga";
    private final String CLUB_BARCA = "Barça";
    private final String CLUB_MADRID = "Madrid";
    private final String PLAYER_FERRAN = "Ferran Torres";
    private final String PLAYER_BENZEMA = "Benzema";

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
        if(competitionName.equalsIgnoreCase(this.LEAGUE_CHAMPIONS)){
            totalPrice += 100;
        }
        if (club.equalsIgnoreCase(this.CLUB_BARCA)
                || club.equalsIgnoreCase(this.CLUB_MADRID)) {
            totalPrice += 100;
        }
        if (player.equalsIgnoreCase(this.PLAYER_FERRAN)
                || player.equalsIgnoreCase(this.PLAYER_BENZEMA)) {
            totalPrice += 50;
        }
        return totalPrice;
    }

    @Override
    public int calcularPuntuacio() {
        int totalScore = super.getScore();

        if(competitionName.equalsIgnoreCase(this.LEAGUE_CHAMPIONS)){
            totalScore += 3;
        }
        if(competitionName.equalsIgnoreCase(this.LEAGUE)){
            totalScore += 2;
        }
        if(club.equalsIgnoreCase(this.CLUB_BARCA)
        || club.equalsIgnoreCase(this.CLUB_MADRID)
        ){
            totalScore += 1;
        }
        if(player.equalsIgnoreCase(this.PLAYER_FERRAN)
        || player.equalsIgnoreCase(this.PLAYER_BENZEMA)
        ){
            totalScore += 1;
        }

        return totalScore;
    }

    @Override
    public String toString() {
        return "Futbol{" +
                "competitionName='" + this.competitionName + '\'' +
                ", club='" + this.club + '\'' +
                ", player='" + this.player + '\'' +
                '}';
    }
}
