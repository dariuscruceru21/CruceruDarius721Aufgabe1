package Controller;

import Models.Mitglieder;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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



}
