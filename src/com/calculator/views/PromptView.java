package com.calculator.views;

public class PromptView implements IView {
    private String header;
    private String[] options;
    private char operation;

    public PromptView(String header, String[] options, char operation){
        this.header = header;
        this.options = options;
        this.operation = operation;
    }

    @Override
    public String getHeader() {
        return header;
    }
    @Override
    public void setHeader(String header) {
        this.header = header;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }
}
