package org.example.nivell_3.excercici1.controller;

import org.example.nivell_3.excercici1.models.*;

import java.util.ArrayList;
import java.util.Scanner;

public class EditorialManager {
    private final Scanner scanner = new Scanner(System.in);
    private final ArrayList<Editor> editors = new ArrayList<>();

    public void createEditor() {
        String name;
        String dni;
        int editorId;

        System.out.println("Introduce nombre de redactor");
        name = scanner.nextLine();

        System.out.println("Introduce DNI de redactor");
        dni = scanner.nextLine();

        editorId = findEditor(dni);

        if (editorId == -1) {
            Editor editor = new Editor(name, dni);
            editors.add(editor);
            System.out.println("Editor con el DNI " + dni + " creado");
        } else {
            System.out.println("Editor con el DNI " + dni + " existe");
        }
    }

    public void deleteEditor() {
        int editorId;
        String dni;

        System.out.println("Introduce DNI del editor");
        dni = scanner.nextLine();

        editorId = findEditor(dni);

        if (editorId == -1) {
            System.out.println("No se ha encontrado editor con DNI: " + dni);
        } else {
            editors.remove(editorId);
            System.out.println("Editor con DNI: " + dni + " eliminado satisfactoriamente");
        }
    }

    public void createNewsForEditor() {
        int editorId;
        String dni;
        String title;
        String competition;
        String club;
        String player;
        String racingTeam;
        String team;
        int newsOption;

        System.out.println("Introduce DNI de redactor");
        dni = scanner.nextLine();

        editorId = findEditor(dni);

        if (editorId == -1) {
            System.out.println("Editor con DNI: " + dni + " no encontrado");
        } else {
            System.out.println("""
                    Tria tipus de noticia:\s
                    1. Football\s
                    2. Basket\s
                    3. F1\s
                    4. Tennis\s
                    5. Moto\s
                    """
            );
            newsOption = scanner.nextInt();
            scanner.nextLine();

            switch (newsOption) {

                case 1:
                    System.out.println("Introdueix títol del article");
                    title = scanner.nextLine();
                    System.out.println("Introdueix competition");
                    competition = scanner.nextLine();
                    System.out.println("Introdueix club");
                    club = scanner.nextLine();
                    System.out.println("Introdueix jugador");
                    player = scanner.nextLine();

                    News footballNews = new Futbol(title, competition, club, player);
                    editors.get(editorId).setNews(footballNews);
                    System.out.println("Noticia '" + title + "' creado");
                    break;

                case 2:
                    System.out.println("Introdueix títol del article");
                    title = scanner.nextLine();
                    System.out.println("Introdueix competition");
                    competition = scanner.nextLine();
                    System.out.println("Introdueix club");
                    club = scanner.nextLine();

                    News basketNews = new Basquet(title, competition, club);
                    editors.get(editorId).setNews(basketNews);
                    System.out.println("Noticia '" + title + "' creado");
                    break;

                case 3:
                    System.out.println("Introdueix títol del article");
                    title = scanner.nextLine();
                    System.out.println("Introdueix escuderia");
                    racingTeam = scanner.nextLine();

                    News formulaNews = new Formula1(title, racingTeam);
                    editors.get(editorId).setNews(formulaNews);
                    System.out.println("Noticia '" + title + "' creado");
                    break;

                case 4:
                    System.out.println("Introdueix títol del article");
                    title = scanner.nextLine();
                    System.out.println("Introdueix competition");
                    competition = scanner.nextLine();
                    System.out.println("Introdueix jugador");
                    player = scanner.nextLine();

                    News tennisNews = new Tenis(title, competition, player);
                    editors.get(editorId).setNews(tennisNews);
                    System.out.println("Noticia '" + title + "' creado");
                    break;

                case 5:
                    System.out.println("Introdueix títol del article");
                    title = scanner.nextLine();
                    System.out.println("Introdueix escuderia");
                    team = scanner.nextLine();

                    News motoNews = new Moto(title, team);
                    editors.get(editorId).setNews(motoNews);
                    System.out.println("Noticia '" + title + "' creado");
                    break;
            }
        }
    }

    public void deleteArticle() {
        int editorId;
        int articleId;
        String dni;
        String title;

        System.out.println("Introduce DNI de Redactor");
        dni = scanner.nextLine();

        System.out.println("Introduce titulo de articulo");
        title = scanner.nextLine();

        editorId = findEditor(dni);
        articleId = findArticle(editorId, title);

        if (editorId == -1 || articleId == -1) {
            System.out.println("Redactor o articulo no encontrado");
        } else {
            ArrayList<News> news = editors.get(editorId).getNews();
            news.remove(articleId);
            System.out.println("Articulo " + title + " eliminado");
        }
    }

    public void getAllArticles() {
        int editorId;
        String dni;

        System.out.println("Introduce DNI de Redactor");
        dni = scanner.nextLine();

        editorId = findEditor(dni);

        ArrayList<News> allNews = editors.get(editorId).getNews();
        for (News news : allNews) {
            System.out.println(news);
        }
    }

    public void showNewsScore() {
        int editorId;
        int articleId;
        String dni;
        String title;

        System.out.println("Introduce DNI de Redactor");
        dni = scanner.nextLine();

        System.out.println("Introduce titulo de articulo");
        title = scanner.nextLine();

        editorId = findEditor(dni);
        articleId = findArticle(editorId, title);

        News news = editors.get(editorId).getNews().get(articleId);
        System.out.println("Puntiación del articulo es " + news.calcularPuntuacio());
    }

    public void showNewsPrice() {
        int editorId;
        int articleId;
        String dni;
        String title;

        System.out.println("Introduce DNI de Redactor");
        dni = scanner.nextLine();

        System.out.println("Introduce titulo de articulo");
        title = scanner.nextLine();

        editorId = findEditor(dni);
        articleId = findArticle(editorId, title);

        News news = editors.get(editorId).getNews().get(articleId);
        System.out.println("El precio total de noticia es " + news.calcularPreuNoticia());

    }

    private int findArticle(int editorId, String title) {
        boolean found = false;
        int articleId = -1;
        int i = 0;


        ArrayList<News> news = editors.get(editorId).getNews();

        while (i < news.size() && !found) {
            if (news.get(i).getTitle().equalsIgnoreCase(title)) {
                articleId = i;
                found = true;
            }
            i++;
        }

        return articleId;
    }

    private int findEditor(String DNI) {
        boolean found = false;
        int editorId = -1;
        int i = 0;

        while (i < editors.size() && !found) {
            if (editors.get(i).getDNI().equals(DNI)) {
                editorId = i;
                found = true;
            }
            i++;
        }
        return editorId;
    }

}
