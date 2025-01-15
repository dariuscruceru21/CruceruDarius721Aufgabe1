import Controller.Controller;
import Models.Mitglieder;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Controller controller = new Controller();

        List<Mitglieder>mitglieders = controller.readFromJson("evenimente.json");
        Scanner scanner = new Scanner(System.in);
        String userChoice;

        do {
            // Display the menu
            System.out.println("\nWählen Sie eine Option:");
            System.out.println("1. Zeige alle Mittglieder");
            System.out.println("2. Zeige Mittglieder, deren Namen mit einem Großbuchstaben beginnen");
            System.out.println("3. Zeige alle Mitglieder aus Haus Stark sortiert nach chronologischer Rheinfolge");
            System.out.println("4. Schreibe in ergebnis.txt Nummer von Mittglieder aus jeden Haus");
            System.out.println("0. Beenden");

            // Get user's choice
            userChoice = scanner.nextLine();

            switch (userChoice) {

                case "0":
                    // Exit the program
                    System.out.println("Das Programm wird beendet.");
                    break;

                case "1":
                    // Prompt the user for a letter and show students starting with that letter
                    System.out.println(mitglieders.toString());
                    break;

                case "2":
                    System.out.println("Geben Sie einen Buchstaben: ");
                    String letter = scanner.nextLine();
                    controller.mitgliederWithInitial(mitglieders,letter);
                    break;

                case "3":
                    // Calculate and save house cup results to a file
                    System.out.println("Alle Mitglieder und Ighren Ereignis von Haus Stark");
                    controller.mitgliedersStarkSortedNachDatum(mitglieders);
                    break;


                case "4":
                    controller.nummerVonMitgliederVonEinHaus(mitglieders,"ergebnis.txt");
                    break;

                default:
                    // Handle invalid input
                    System.out.println("Ungültige Eingabe. Bitte wählen Sie eine gültige Option.");
                    break;
            }

        } while (!userChoice.equals("0"));  // Keep running until the user chooses to exit
    }




}


