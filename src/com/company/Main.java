package com.company;

import com.company.model.Bird;
import com.company.test.BirdTest;
import com.company.utils.Utilities;
import com.company.frontcontroller.FrontController;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BirdDatabase db = new BirdDatabase("MyBirdDatabase");

        Utilities.createFakeBirds(birds);
        Utilities.printBirds(birds);

        FrontController.mainLoop(scanner, birds);

        //Exit program
        System.out.println("\nFinishing Birding, bye, bye!");




        }
    }





}
