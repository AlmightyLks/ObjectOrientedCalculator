package com.calculator.models;

import com.calculator.views.IUserInterface;

import java.util.ArrayList;
import java.util.List;

public class Calculator implements ICalculator{
    private List<Calculation> previousCalculations;
    private IUserInterface ui;

    public Calculator(IUserInterface ui){
        this.ui = ui;
        previousCalculations = new ArrayList<>();
    }

    public List<Calculation> getPreviousCalculations() {
        return previousCalculations;
    }

    public void setPreviousCalculations(List<Calculation> previousCalculations) {
        this.previousCalculations = previousCalculations;
    }

    @Override
    public double addition() {
        Calculation calc = new Calculation();

        //Read first operand
        do{
            ui.writeText("Please enter your first operand");
            calc.setFirstOperand(ui.readDouble());
        }while(calc.getFirstOperand() == null);

        //Read second operand
        do{
            ui.writeText("Please enter your second operand");
            calc.setSecondOperand(ui.readDouble());
        }while(calc.getSecondOperand() == null);

        return 0;
    }

    @Override
    public double subtraction() {
        ui.writeText("I am in subtraction");
        return 0;
    }

    @Override
    public double multiplication() {
        ui.writeText("I am in multiplication");
        return 0;
    }

    @Override
    public double division() {
        ui.writeText("I am in division");
        return 0;
    }
}
