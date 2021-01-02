package com.calculator.views;

import java.util.Scanner;

public class UserInterface implements IUserInterface {
    private Scanner scanner;

    public UserInterface(){
        scanner = new Scanner(System.in);
    }

    @Override
    public Integer readInteger() {
        Integer result;
        try{
            result = scanner.nextInt();
        }catch(Exception e){
            result = null;
            scanner.nextLine();
        }
        return result;
    }

    @Override
    public Double readDouble() {
        Double result;
        try{
            result = scanner.nextDouble();
        }catch(Exception e){
            result = null;
            scanner.nextLine();
        }
        return result;
    }

    @Override
    public Character readCharacter() {
        Character result;
        try{
            result = scanner.next().charAt(0);
        }catch(Exception e){
            result = null;
            scanner.nextLine();
        }
        return result;
    }

    @Override
    public String readString() {
        String result;
        try{
            result = scanner.next();
        }catch(Exception e){
            result = null;
            scanner.nextLine();
        }
        return result;
    }

    @Override
    public void writeText(String text) {
        System.out.println(text);
    }

    @Override
    public void displayMenu() {
        for (int i = 0; i < 24; i++){ writeText(""); }
        writeText("\tMenu");
        writeText("");
        writeText("\t[1] Addition");
        writeText("\t[2] Subtraction");
        writeText("\t[3] Multiplication");
        writeText("\t[4] Division");
        writeText("\t[0] Exit");
    }
}
