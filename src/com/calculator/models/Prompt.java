package com.calculator.models;

public class Prompt {
    private String discriminator;
    private String description;
    private String op;

    public Prompt(String discriminator, String description, String op){
        this.discriminator = discriminator;
        this.description = description;
        this.op = op;
    }
    public String getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }
}
