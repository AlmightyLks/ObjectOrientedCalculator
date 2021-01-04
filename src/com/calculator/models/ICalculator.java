package com.calculator.models;

//Can't be bothered to get over certain C#'s naming conventions, yet
public interface ICalculator {
    double addition(double num1, double num2);
    double subtraction(double num1, double num2);
    double multiplication(double num1, double num2);
    double division(double num1, double num2);
}
