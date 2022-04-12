package com.company.utils;
import java.util.Scanner;

public class Utilities {

    public static String ask(Scanner input, String option) {
        System.out.println(option);
        String data = input.nextLine();
        return data;
    }
}
