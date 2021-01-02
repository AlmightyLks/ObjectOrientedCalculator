package com.calculator.views;

public interface IUserInterface {
    Integer readInteger();
    Double readDouble();
    Character readCharacter();
    String readString();
    void writeText(String text);
    void displayMenu();
}
