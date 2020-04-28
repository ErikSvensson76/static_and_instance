package se.lexicon.model;

import java.time.LocalDate;

public class Pet {
    private int petId;
    private String name;
    private LocalDate dateOfBirth;

    public Pet(int petId, String name, LocalDate dateOfBirth) {
        this.petId = petId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public int getPetId() {
        return petId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
