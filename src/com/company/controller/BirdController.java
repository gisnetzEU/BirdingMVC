package com.company.controller;

import com.company.BirdDatabase;
import com.company.model.Bird;
import com.company.utils.Utilities;

import java.util.Scanner;

public class BirdController {

    public static void add(Scanner input, BirdDatabase db) {
        String birdName = Utilities.ask(input, "Give bird's name: ");
        String birdNameLatin = Utilities.ask(input, "Give bird's Latin name: ");
        Bird bird = new Bird(birdName, birdNameLatin);
        db.addBirdToDatabase(bird);
        System.out.println("New bird added to database: " + bird.toString());
    }

    public static void observation(Scanner input, BirdDatabase db) {
        String birdName = Utilities.ask(input, "Give seen bird's name: ");
        Bird bird = db.getBirdsDatabase().get(birdName);
        bird.addObservation();
        System.out.println("Current observations for " + birdName + " are " + bird.getObservations());
    }

    public static void show(Scanner input, BirdDatabase db) {
        String birdName = Utilities.ask(input, "Give bird's name to show: ");
        Bird bird = db.getBirdsDatabase().get(birdName);
        System.out.println(bird.toString());
    }

    public static void statistics(BirdDatabase db) {
        /*String birdName = Utilities.ask(input, "Give bird's name to display observations count: ");
        Bird bird = db.getBirdsDatabase().get(birdName);
        System.out.println("Current observations for " + birdName + " are " + bird.getObservations());*/
        System.out.println(db);
    }
}
