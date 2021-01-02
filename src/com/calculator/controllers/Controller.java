package com.calculator.controllers;

import com.calculator.models.Calculator;
import com.calculator.views.IUserInterface;
import com.calculator.views.UserInterface;

public class Controller {
    private IUserInterface ui;
    private Calculator calculator;

    public Controller(){
        ui = new UserInterface();
        calculator = new Calculator(ui);
    }

    public void run(){
        boolean keepGoing = true;

        while(keepGoing){
            ui.displayMenu();
            Integer input = ui.readInteger();

            if(input == null)
                continue;

            switch(input){
                case 0:
                    keepGoing = false;
                    break;
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
            }
        }
    }

    private void addition(){
        calculator.addition();
    }
    private void subtraction(){
        calculator.subtraction();
    }
    private void multiplication(){
        calculator.multiplication();
    }
    private void division(){
        calculator.division();
    }
}
