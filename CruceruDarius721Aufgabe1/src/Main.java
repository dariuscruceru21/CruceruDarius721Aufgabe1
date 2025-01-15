import Controller.Controller;
import Models.Mitglieder;

import java.io.IOException;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
            controller.mitgliederWithInitial(mitglieders,"B");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }


}