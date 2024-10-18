package org.example.nivell_3.excercici1.models;

public abstract class News {
    private String title;
    private String text;
    private int score;
    private double price;

    public News(String title) {
        this.title = title;
        this.text = "";
        this.score = 0;
        this.price = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calcularPreuNoticia();
    public abstract int calcularPuntuacio();

    @Override
    public String toString() {
        return "Noticia{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", score=" + score +
                ", price=" + price +
                '}';
    }
}
