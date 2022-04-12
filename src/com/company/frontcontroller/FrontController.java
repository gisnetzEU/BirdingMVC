package com.company.frontcontroller;

import com.company.BirdDatabase;
import com.company.controller.BirdController;
import com.company.utils.Utilities;
import com.company.view.Menu;

import java.util.Scanner;

public class FrontController {

    public static void mainLoop(Scanner scanner, BirdDatabase db) {
        while (true) {
            Menu.mainMenu();
            String command = Utilities.ask(scanner, "Option?");

            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                BirdController.add(scanner, db);
            } else if (command.equals("Observation")) {
                BirdController.observation(scanner, db);
            } else if (command.equals("Show")) {
                BirdController.show(scanner, db);
            } else if (command.equals("Statistics")) {
                BirdController.statistics(db);
            } else {
                System.out.println("Unknown command!");
            }
        }
    }

}