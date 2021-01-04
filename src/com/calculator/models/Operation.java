package com.calculator.models;

@FunctionalInterface
public interface Operation {
    double Operation(double num1, double num2);
}
