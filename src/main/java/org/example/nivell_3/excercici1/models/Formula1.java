package org.example.nivell_3.excercici1.models;

public class Formula1 extends News {

    private String team;

    public Formula1(String title, String team) {
        super(title);
        super.setPrice(100);
        super.setScore(4);
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public double calcularPreuNoticia() {
        double totalPrice = super.getPrice();

        if(team.equalsIgnoreCase("Ferrari")
                || team.equalsIgnoreCase("Mercedes")

        ){
            totalPrice += 50;
        }

        return totalPrice;
    }

    @Override
    public int calcularPuntuacio() {

        int totalScore = super.getScore();

        if(team.equalsIgnoreCase("Ferrari")
                || team.equalsIgnoreCase("Mercedes")

        ){
            totalScore += 2;
        }

        return totalScore;
    }

    @Override
    public String toString() {
        return "Formula1{" +
                "team='" + team + '\'' +
                '}';
    }
}
