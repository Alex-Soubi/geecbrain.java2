package com.company;

public abstract class Barriers {
    private String name;

    public Barriers(String name) {
        this.name = name;
    }

    protected abstract boolean moving(Actions actions);

    public String getName() {
        return name;
    }
}
