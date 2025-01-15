package Controller;

import Models.Haus;
import Models.Mitglieder;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Controller {
    public static List<Mitglieder> readFromJson(String filename) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.readValue(
                new File(filename),
                new TypeReference<List<Mitglieder>>() {}
        );

    }

    public void mitgliederWithInitial(List<Mitglieder> mitglieders, String letter){
        System.out.println("Mitglieder mit Names starten mit " + letter + ":");
        mitglieders.stream()
                .filter(mitglieder -> mitglieder.getMitgliedsName().charAt(0) == letter.toUpperCase().charAt(0))
                .map(mitglieder -> mitglieder.getMitgliedsName())
                .distinct()
                .forEach(System.out::println);
    }

    public void mitgliedersStarkSortedNachDatum(List<Mitglieder> mitglieders){
        System.out.println("Sorted by Date:");
        mitglieders.stream()
                .filter(mitglieder-> mitglieder.getHaus() == Haus.Stark)
                .sorted(Comparator.comparing(mitglieder -> mitglieder.getDatum()))
                .map(mitglieder -> mitglieder.getDatum() + ": " + mitglieder.getMitgliedsName() + " - " + mitglieder.getEreignis())
                .distinct()
                .forEach(System.out::println);
    }

    public void nummerVonMitgliederVonEinHaus(List<Mitglieder> mitglieders, String fileName) throws IOException {
        HashMap<Haus, Integer> points = new HashMap<>();
        for (Mitglieder mitglieder : mitglieders) {
            points.put(mitglieder.getHaus(), points.getOrDefault(mitglieder.getHaus(), 0) + 1);
        }

        List<Map.Entry<Haus, Integer>> hausListe = new ArrayList<>(points.entrySet());
        hausListe.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileName));
        for (Map.Entry<Haus, Integer> entry : hausListe) {
            writer.write(entry.getKey() + "#" + entry.getValue());
            writer.newLine();
        }
        writer.close();
        System.out.println("\nErgebnis des Nummer wurde in 'ergebnis.txt' gespeichert.");
    }



}
