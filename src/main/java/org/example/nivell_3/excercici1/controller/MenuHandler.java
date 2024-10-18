package org.example.nivell_3.excercici1.controller;

import java.util.Scanner;

public class MenuHandler {
    private final Scanner scanner = new Scanner(System.in);
    private final EditorialManager editorialManager = new EditorialManager();

    public void run(){
        int option;

        do {
        menu();
        option = scanner.nextInt();
        scanner.nextLine();
        getOption(option);
        } while (option != 0);
    }


    private void menu(){
        System.out.println("""
                    Escoge una opción:\s
                    0. Salir de programa\s
                    1. Introduir editor.\s
                    2. Eliminar editor.\s
                    3. Introduir notícia a un editor.\s
                    4. Eliminar notícia.\s
                    5. Mostrar totes les notícies per editor.\s
                    6. Calcular puntuació de la notícia.\s
                    7. Calcular preu-notícia. \s
                    """);
    }

    private void getOption(int option){
        switch (option){

            case 0:
                System.out.println("Cerrando sesión");
                break;
            case 1:
                editorialManager.createEditor();
                break;
            case 2:
                editorialManager.deleteEditor();
                break;
            case 3:
                editorialManager.createNewsForEditor();
                break;
            case 4:
                editorialManager.deleteArticle();
                break;
            case 5:
                editorialManager.getAllArticles();
                break;
            case 6:
                editorialManager.showNewsScore();
                break;
            case 7:
                editorialManager.showNewsPrice();
                break;
            default:
                System.out.println("Escoge una opción válida");
        }
    }
}
