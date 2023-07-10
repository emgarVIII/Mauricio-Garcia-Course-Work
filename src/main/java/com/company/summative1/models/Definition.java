package com.company.summative1.models;

public class Definition {
    private long id;
    private String word;
    private String definition;

    // constructors, getters, and setters

    public Definition(long id, String word, String definition) {
        this.id = id;
        this.word = word;
        this.definition = definition;
    }

    // Getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}

