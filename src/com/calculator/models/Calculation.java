package com.calculator.models;

public class Calculation {
    private double firstOperand;
    private double secondOperand;
    private char operator;
    private double result;

    public Calculation(double firstOperand, double secondOperand, char operator, double result){
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.operator = operator;
        this.result = result;
    }

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

    public String toString(){
        return getFirstOperand() + " " + getOperator()+ " " + getSecondOperand() + " = " + getResult();
    }
}
