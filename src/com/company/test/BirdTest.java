package com.company.test;

import com.company.BirdDatabase;
import com.company.model.Bird;

import java.util.HashMap;

public class BirdTest {

    public static void test(HashMap<String, Bird> birdsDatabase) {
        createFakeBirds(BirdDatabase db);
    }

    public static void createFakeBirds(HashMap<String, Bird> birdsDatabase) {

        BirdDatabase db = new BirdDatabase("MyBirdDatabase");

        Bird bird1 = new Bird("Martinet", "Martinus Martinus");
        Bird bird2 = new Bird("Colom", "Palominus Palominus");
        Bird bird3 = new Bird("Gavina", "Gavius Gavius");
        db.addBirdToDatabase(bird1);
        db.addBirdToDatabase(bird2);
        db.addBirdToDatabase(bird3);
    }
}
