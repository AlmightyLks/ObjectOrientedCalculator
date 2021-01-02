package com.calculator.models;

public class Calculation {
    private Double firstOperand;
    private Double secondOperand;
    private Character operator;
    private Double result;


    public Double getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(Double firstOperand) {
        this.firstOperand = firstOperand;
    }

    public Double getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(Double secondOperand) {
        this.secondOperand = secondOperand;
    }

    public Character getOperator() {
        return operator;
    }

    public void setOperator(Character operator) {
        this.operator = operator;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
}
