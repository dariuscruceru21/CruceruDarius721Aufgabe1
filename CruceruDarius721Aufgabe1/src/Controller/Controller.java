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
        List<Mitglieder> mitglieders = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.readValue(
                new File(filename),
                new TypeReference<List<Mitglieder>>() {}
        );

    }
}
