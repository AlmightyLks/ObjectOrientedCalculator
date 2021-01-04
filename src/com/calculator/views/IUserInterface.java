package com.calculator.views;

import java.util.Scanner;

//Can't be bothered to get over certain C#'s naming conventions, yet
public interface IUserInterface {
    Integer readInteger();
    Double readDouble();
    Character readCharacter();
    String readString();
    void writeText(String text);
}
