package com.calculator;

import com.calculator.views.IUserInterface;
import com.calculator.views.UserInterface;

public class Main {
    public static void main(String[] args) {
        //IUserInterface ui = new UserInterface();
        var ui = new UserInterface();

        ui.writeText("Enter int");
        var myInt = ui.readInteger();

        ui.writeText("Enter double");
        var myDouble = ui.readDouble();

        ui.writeText("Enter char");
        var myCharacter = ui.readCharacter();

        ui.writeText("Enter string");
        var myString = ui.readString();
    }
}
