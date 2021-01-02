package com.calculator.controllers;

import com.calculator.models.Calculator;
import com.calculator.views.IUserInterface;

public class Controller {
    private IUserInterface ui;
    private Calculator calculator;

    public Controller(IUserInterface ui){
        calculator = new Calculator();
        this.ui = ui;
    }

    public void run(){
        boolean keepGoing = true;

        while(keepGoing){
            ui.displayMenu();
            var input = ui.readInteger();

            switch(input){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }
    }
}
