package org.example.nivell_3.excercici1.models;

import org.example.nivell_3.excercici1.models.News;

public class Tenis extends News {

    private String competitionName;
    private String player;
    private final String PLAYER_FEDERER = "Federer";
    private final String PLAYER_NADAL = "Nadal";
    private final String PLAYER_DJOKOVIC = "Djokovic";

    public Tenis(
            String title,
            String competitionName,
            String player
    ) {
        super(title);
        super.setPrice(150);
        super.setScore(4);
        this.competitionName = competitionName;
        this.player = player;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
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

        if(player.equalsIgnoreCase(this.PLAYER_FEDERER)
                || player.equalsIgnoreCase(this.PLAYER_NADAL)
                || player.equalsIgnoreCase(this.PLAYER_DJOKOVIC)

        ){
            totalPrice += 100;
        }
        return totalPrice;
    }

    @Override
    public int calcularPuntuacio() {

        int totalScore = super.getScore();

        if(player.equalsIgnoreCase(this.PLAYER_FEDERER)
                || player.equalsIgnoreCase(this.PLAYER_NADAL)
                || player.equalsIgnoreCase(this.PLAYER_DJOKOVIC)

        ){
            totalScore += 3;
        }
        return totalScore;
    }

    @Override
    public String toString() {
        return "Tenis{" +
                "competitionName='" + this.competitionName + '\'' +
                ", player='" + this.player + '\'' +
                '}';
    }
}
