package com.calculator.views;

import java.util.Scanner;

public class UserInterface implements IUserInterface{
    private Scanner scanner;

    public UserInterface(){
        scanner = new Scanner(System.in);
    }

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

    public void writeText(String text) {
        System.out.println(text);
    }
}
