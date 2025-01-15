import Controller.Controller;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        try {
            System.out.println(controller.readFromJson("evenimente.json"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}