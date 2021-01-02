package com.calculator;

import com.calculator.controllers.*;
import com.calculator.views.*;

public class Main {
    private static Controller controller;
    public static void main(String[] args) {
        controller = new Controller();
        controller.run();
    }
}
