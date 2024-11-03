package org.example.nivell_3.excercici1.models;

public class Moto extends News {
    private String motoTeam;

     private final String TEAM_HONDA = "Honda";
     private final String TEAM_YAMAHA = "Yamaha";

    public Moto(String title, String motoTeam) {
        super(title);
        super.setPrice(100);
        super.setScore(3);
        this.motoTeam = motoTeam;
    }

    public String getMotoTeam() {
        return motoTeam;
    }

    public void setMotoTeam(String motoTeam) {
        this.motoTeam = motoTeam;
    }

    @Override
    public double calcularPreuNoticia() {
        double totalPrice = super.getPrice();

        if(motoTeam.equalsIgnoreCase(this.TEAM_HONDA)
                || motoTeam.equalsIgnoreCase(this.TEAM_YAMAHA)

        ){
            totalPrice += 50;
        }

        return totalPrice;
    }

    @Override
    public int calcularPuntuacio() {
        int totalScore = super.getScore();

        if(motoTeam.equalsIgnoreCase(this.TEAM_HONDA)
                || motoTeam.equalsIgnoreCase(this.TEAM_YAMAHA)

        ){
            totalScore += 3;
        }

        return totalScore;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "motoTeam='" + this.motoTeam + '\'' +
                '}';
    }
}
