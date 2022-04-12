package com.company.model;

public class Bird {

    private String name;
    private String nameLatin;
    private int observations;

    //constructor
    public Bird(String name, String nameLatin) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.observations = 0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameLatin() {
        return nameLatin;
    }

    public void setNameLatin(String nameLatin) {
        this.nameLatin = nameLatin;
    }

    public int getObservations() {
        return observations;
    }

    public void setObservations(int observations) {
        this.observations = observations;
    }

    public void addObservation() {
        this.observations++;
    }

    @Override
    public String toString() {
        return "Bird [name=" + name + ", nameLatin=" + nameLatin + ", observations=" + observations + "]";
    }
}
