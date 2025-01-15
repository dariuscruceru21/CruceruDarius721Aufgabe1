import Controller.Controller;
import Models.Mitglieder;

import java.io.IOException;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
//        try {
//            System.out.println(controller.readFromJson("evenimente.json"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        try {
            List<Mitglieder>mitglieders = controller.readFromJson("evenimente.json");
            //controller.mitgliederWithInitial(mitglieders,"B");
            //controller.mitgliedersStarkSortedNachDatum(mitglieders);
            controller.nummerVonMitgliederVonEinHaus(mitglieders,"ergebnis.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }


}