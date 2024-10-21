package org.example.nivell_3.excercici1.models;

import java.util.ArrayList;

public class Editor {
    private String name;
    private final String DNI;
    private static double salary;
    ArrayList<News> news;

    public Editor(String name, final String DNI) {
        this.name = name;
        this.DNI = DNI;
        Editor.salary = 1500;
        news = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDNI() {
        return DNI;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        Editor.salary = salary;
    }

    public ArrayList<News> getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news.add(news);
    }
}
