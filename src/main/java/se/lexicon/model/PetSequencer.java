package se.lexicon.model;

public class PetSequencer {
    private static int counter = 0;

    public static int nextPetId(){
        return ++counter;
    }

    public static int getCurrentId(){
        return counter;
    }

    public static void reset(){
        counter = 0;
    }
}
