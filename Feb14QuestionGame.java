package com.project1;

import java.util.Scanner;

public class Feb14QuestionGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the type of animal you are thinking of (e.g. mammal, bird, reptile, fish): ");
        String type = input.nextLine();
        
        if (type.equalsIgnoreCase("mammal")) {
            System.out.println("Is the animal you are thinking of a carnivore?");
            String diet = input.nextLine();
            
            if (diet.equalsIgnoreCase("yes")) {
                System.out.println("Is the animal you are thinking of a big cat?");
                String cat = input.nextLine();
                
                if (cat.equalsIgnoreCase("yes")) {
                    System.out.println("You might be thinking of a lion.");
                } else {
                    System.out.println("You might be thinking of a hyena.");
                }
            } else {
                System.out.println("Is the animal you are thinking of a herbivore?");
                String herbivore = input.nextLine();
                
                if (herbivore.equalsIgnoreCase("yes")) {
                    System.out.println("You might be thinking of a giraffe.");
                } else {
                    System.out.println("Sorry, I don't know which animal you are thinking of.");
                }
            }
        } else if (type.equalsIgnoreCase("bird")) {
            System.out.println("Is the animal you are thinking of a predator?");
            String predator = input.nextLine();
            
            if (predator.equalsIgnoreCase("yes")) {
                System.out.println("Is the animal you are thinking of a bird of prey?");
                String prey = input.nextLine();
                
                if (prey.equalsIgnoreCase("yes")) {
                    System.out.println("You might be thinking of an eagle.");
                } else {
                    System.out.println("You might be thinking of an owl.");
                }
            } else {
                System.out.println("Is the animal you are thinking of a water bird?");
                String water = input.nextLine();
                
                if (water.equalsIgnoreCase("yes")) {
                    System.out.println("You might be thinking of a duck.");
                } else {
                    System.out.println("Sorry, I don't know which animal you are thinking of.");
                }
            }
        } else if (type.equalsIgnoreCase("reptile")) {
            System.out.println("Is the animal you are thinking of a venomous snake?");
            String venomous = input.nextLine();
            
            if (venomous.equalsIgnoreCase("yes")) {
                System.out.println("You might be thinking of a cobra.");
            } else {
                System.out.println("You might be thinking of a turtle.");
            }
        } else if (type.equalsIgnoreCase("fish")) {
            System.out.println("Is the animal you are thinking of a saltwater fish?");
            String saltwater = input.nextLine();
            
            if (saltwater.equalsIgnoreCase("yes")) {
                System.out.println("You might be thinking of a shark.");
            } else {
                System.out.println("You might be thinking of a salmon.");
            }
        } else {
            System.out.println("Sorry, I don't know which animal you are thinking of.");
        }
    }
}
