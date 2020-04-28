package se.lexicon;

import se.lexicon.model.Pet;

import java.time.LocalDate;

import static se.lexicon.model.PetSequencer.nextPetId;

public class PetIdDemo {
    public static void main(String[] args) {
        Pet pet1 = new Pet(nextPetId(),"Fluffy", LocalDate.of(2020, 4,27));
        Pet pet2 = new Pet(nextPetId(),"Ruffie", LocalDate.of(2008, 4, 11));
        System.out.println(pet1.getDateOfBirth());
        System.out.println(pet2.getDateOfBirth());
    }
}
