package com.calculator.views;

import com.calculator.models.Prompt;

public class MenuView implements IView {
    private String header;
    private Prompt[] prompts;

    public MenuView(String header, Prompt[] prompts){
        this.header = header;
        this.prompts = prompts;
    }

    @Override
    public String getHeader() {
        return header;
    }
    @Override
    public void setHeader(String header) {
        this.header = header;
    }

    public Prompt[] getPrompts() {
        return prompts;
    }
    public void setPrompts(Prompt[] prompts) {
        this.prompts = prompts;
    }
}
