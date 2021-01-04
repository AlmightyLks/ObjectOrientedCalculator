package com.calculator.views;

import com.calculator.models.Calculation;

public class ResultView implements IView {
    private String header;
    private Calculation calculation;

    public ResultView(String header, double num1, double num2, char operator, double result){
        calculation = new Calculation(num1, num2, operator, result);
        this.header = header;
    }

    @Override
    public String getHeader() {
        return header;
    }

    @Override
    public void setHeader(String header) {
        this.header = header;
    }

    public Calculation getCalculation() {
        return calculation;
    }

    public void setCalculation(Calculation calculation) {
        this.calculation = calculation;
    }
}
