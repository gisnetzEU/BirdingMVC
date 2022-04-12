package com.company;

import com.company.frontcontroller.FrontController;
import com.company.model.Bird;
import com.company.test.BirdTest;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nStarting Birding\n");
        Scanner reader = new Scanner(System.in);

        BirdDatabase db = BirdTest.createFakeBirds();

        //BirdDatabase db = new BirdDatabase("birds");
        FrontController.mainLoop(reader, db);

        System.out.println("\nFinishing Birding");
    }

}
