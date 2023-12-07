package io.zipcoder.polymorphism;

public abstract class Pet {
    String petName;
    public abstract String speak();

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }
}
