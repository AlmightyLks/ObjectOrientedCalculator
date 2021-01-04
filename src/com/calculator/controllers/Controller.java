package com.calculator.controllers;

import com.calculator.models.*;
import com.calculator.views.*;

public class Controller {
    private ICalculator calculator;
    private IUserInterface userInterface;

    public Controller(){
        calculator = new Calculator();
        userInterface = new UserInterface();
    }

    public void run(){
        String enteredOption = "";

        do{
            IView ui = viewSelector(enteredOption);
            enteredOption = displayView(ui);
        }while(!enteredOption.equals("<exit>"));
    }

    private String displayView(IView view) {
        if(view == null){
            return "<exit>";
        }
        String result = "";
        String input = "";

        userInterface.writeText(view.getHeader());

        if(view instanceof MenuView){
            MenuView menuView = (MenuView)view;
            for(Prompt prompt : menuView.getPrompts()){
                userInterface.writeText("\t[" + prompt.getDiscriminator() + "]\t" + prompt.getDescription());
            }
            input = userInterface.readString();
            for(Prompt prompt : menuView.getPrompts()){
                if(prompt.getDiscriminator().equals(input)){
                    result = prompt.getOp();
                    break;
                }
            }
        }
        else if(view instanceof PromptView){
            PromptView promptView = (PromptView)view;
            result = Character.toString(promptView.getOperation()) + ";";
            for(String option : promptView.getOptions()){
                userInterface.writeText("Please enter your " + option);
                result += userInterface.readDouble() + ";";
            }
        }
        else if(view instanceof ResultView){
            ResultView resultView = (ResultView)view;
            userInterface.writeText(resultView.getCalculation().toString());
            input = userInterface.readString();
        }

        return result;
    }

    private IView viewSelector(String opInfo){
        IView result = null;
        String[] operation = opInfo.split(";");

        if(opInfo.equals("")){
            result = new MenuView("Menu", new Prompt[]{
                    new Prompt("1", "Addition", "+"),
                    new Prompt("2", "Subtraction", "-"),
                    new Prompt("3", "Multiplication", "*"),
                    new Prompt("4", "Division", "/"),
                    new Prompt("5", "Exit", "<exit>")
            });
        }
        else if(operation.length == 1){
            result = new PromptView("Enter Numbers", new String[]{
                "First Operand",
                "Second Operand"
            },  opInfo.charAt(0));
        }
        else if(operation.length == 3){
            result = switch (operation[0]) {
                case "+" -> resultView(Double.parseDouble(operation[1]), Double.parseDouble(operation[2]),'+', calculator::addition);
                case "-" -> resultView(Double.parseDouble(operation[1]), Double.parseDouble(operation[2]),'-', calculator::subtraction);
                case "/" -> resultView(Double.parseDouble(operation[1]), Double.parseDouble(operation[2]),'/', calculator::division);
                case "*" -> resultView(Double.parseDouble(operation[1]), Double.parseDouble(operation[2]),'*', calculator::multiplication);
                default -> new MenuView("Menu", new Prompt[]{
                        new Prompt("1", "Addition", "+"),
                        new Prompt("2", "Subtraction", "-"),
                        new Prompt("3", "Multiplication", "*"),
                        new Prompt("4", "Division", "/"),
                        new Prompt("5", "Exit", "<exit>")
                });
            };
        }
        else {
            userInterface.writeText("How even");
        }

        return result;
    }

    private IView resultView(double num1, double num2, char operator, Operation operation){
        double result = operation.Operation(num1, num2);

        return new ResultView("Result", num1, num2, operator, result);
    }
}
