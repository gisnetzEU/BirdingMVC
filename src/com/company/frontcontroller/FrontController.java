package com.company.frontcontroller;

import com.company.controller.UserController;
import com.company.model.Bird;
import com.company.utils.Utilities;
import com.company.view.Menu;

import java.util.HashMap;
import java.util.Scanner;

public class FrontController {
    public static void mainLoop(Scanner scanner, HashMap<String, Bird> birdsDatabase) {

        while (true) {

            Menu.mainMenu();
            String command = Utilities.ask(scanner, "Option?");


            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                add(scanner, db);
            } else if (command.equals("Observation")) {
                observation(scanner, db);
            } else if (command.equals("Show")) {
                show(scanner, db);
            } else if (command.equals("Statistics")) {
                statistics(db);
            } else {
                System.out.println("Unknown command!");
            }
        }
    }
}