package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Adoption adoptionReference = new Adoption();
        adoptionReference.nameAdoption = "Vasile";
        adoptionReference.moneyAvailable = 200.50;

        Animal dog = new Animal();
        dog.age = 2;
        dog.favoriteFood = "Carne";
        dog.favoriteRecreationalActivity = "Plimbari";
        dog.moodLevel = 8;
        dog.nameAnimal = "Spike";
        dog.theLevelOfHealth = 9;
        dog.theLevelOfTheFeelingOfHunger = 10;

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.nameVeterinarian = "George";
        veterinarian.specialization = "Medic veterinar";

        System.out.println("Numele adoptatorului este: " + adoptionReference.nameAdoption);
        System.out.println("Banii disponibili: " + adoptionReference.moneyAvailable);
        System.out.println("-----------------------");
        System.out.println("Numele cainelui este: " + dog.nameAnimal);
        System.out.println("Varsta: " + dog.age);
        System.out.println("Mancarea favorita: " + dog.favoriteFood);
        System.out.println("Activitatea favorita: " + dog.favoriteRecreationalActivity);
        System.out.println("Nivelul starii de spirit: " + dog.moodLevel);
        System.out.println("Nivelul starii de sanatate: " + dog.theLevelOfHealth);
        System.out.println("Nivelul senzatiei de foame: " + dog.theLevelOfTheFeelingOfHunger);
        System.out.println("---------------------");
        System.out.println("Numele veterinarului este: " + veterinarian.nameVeterinarian);
        System.out.println("Specializarea: " + veterinarian.specialization);

    }
}
