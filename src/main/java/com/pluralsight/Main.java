package com.pluralsight;

import java.util.*;
import java.io.*;

public class Main {
    static Scanner scanner=new Scanner(System.in);
    static String enteredCommand;

    public static void print(String text) {
        System.out.println(text);}
    public static void print(String text, boolean nextLine){
        if (nextLine){System.out.println(text);}
        else {System.out.print(text);}}


    public static void main(String[] args) {
        commandLogger("launch");
        runMainMenu();
    }

    private static String commandLogger(String prompt) {
        return prompt;
    }

    private static void runMainMenu(){
        do {
            print("""
                    X - exit application
                    Enter command here:""" + " ", false);
            enteredCommand=commandLogger(scanner.nextLine());
            switch (enteredCommand) {
                case "1" -> {}
                case "2" -> {}
                case "3" -> {}
                default -> {
                    if (!enteredCommand.equals("x")) {
                        print("Error invalid command! Please enter a valid command prompt");}
                }
            }
        } while (!enteredCommand.equals("x"));
    }
}