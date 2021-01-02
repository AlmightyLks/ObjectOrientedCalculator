package com.calculator.models;

import java.util.ArrayList;
import java.util.List;

public class Calculator implements ICalculator{
    private List<Calculation> previousCalculations;

    public Calculator(){
        previousCalculations = new ArrayList<>();
    }

    public List<Calculation> getPreviousCalculations() {
        return previousCalculations;
    }

    public void setPreviousCalculations(List<Calculation> previousCalculations) {
        this.previousCalculations = previousCalculations;
    }

    @Override
    public double Addition() {
        return 0;
    }

    @Override
    public double Subtraction() {
        return 0;
    }

    @Override
    public double Multiplication() {
        return 0;
    }

    @Override
    public double Division() {
        return 0;
    }
}
