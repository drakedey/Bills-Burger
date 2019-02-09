package com.company;
import Hamburguer.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //Creating Classic Hamburguer
        Item[] classicItems = getRandomItems(4);
        ClasssicHealthyHamburguer classicHamburger = new ClasssicHealthyHamburguer(classicItems);
        System.out.println("===================================");
        System.out.println("Hamburguer Number 1: ");
        System.out.println("Name: " + classicHamburger.getHamburguer().getName());
        System.out.println("Price: " + classicHamburger.getHamburguer().getPrice());
        System.out.println("Description: " + classicHamburger.getHamburguer().getDescription());
        classicHamburger.getAdditionDetails();
        System.out.println("===================================");

        //Creating Healthy Hamburguer
        Item[] healtyItems = getRandomItems(6);
        ClasssicHealthyHamburguer healtyHamburger = new ClasssicHealthyHamburguer(healtyItems);
        System.out.println("===================================");
        System.out.println("Hamburguer Number 2: ");
        System.out.println("Name: " + healtyHamburger.getHamburguer().getName());
        System.out.println("Price: " + healtyHamburger.getHamburguer().getPrice());
        System.out.println("Description: " + healtyHamburger.getHamburguer().getDescription());
        healtyHamburger.getAdditionDetails();
        System.out.println("===================================");

        //Creating Deluxe Hamburguer
        DeluxeHamburguer deluxeHamburger = new DeluxeHamburguer();
        System.out.println("===================================");
        System.out.println("Hamburguer Number 2: ");
        System.out.println("Name: " + deluxeHamburger.getHamburguer().getName());
        System.out.println("Price: " + deluxeHamburger.getHamburguer().getPrice());
        System.out.println("Description: " + deluxeHamburger.getHamburguer().getDescription());
        deluxeHamburger.getAdditionDetails();
        System.out.println("===================================");

    }

    /*
    * A function that retrieves an Array of Additions to add to toyur hamburguer
    * @cuantity The amount of random Items that you want to add to your hamburger
    * */
    public static Item[] getRandomItems(int cuantity) {
        Item[] availableItems = {
                AvailableAdditions.Carrots,
                AvailableAdditions.FrenchFries,
                AvailableAdditions.Lettuce,
                AvailableAdditions.Soda,
                AvailableAdditions.Tomato,
                AvailableAdditions.Sause,
                AvailableAdditions.Eggs
        };
        Item[] itemsRandomized = new Item[cuantity];
        int[] indexes = new int[cuantity];
        for (int i = 0; i < cuantity; i++) {
            boolean aux = true;
            while (aux) {
                int random = (int)(Math.random()*7);
                boolean repatedIdexes = false;
                for (int j = 0; j < cuantity; j++) {
                    if(i==0) {
                        indexes[i] = random;
                        break;
                    }
                    if(indexes[j] == random) {
                        repatedIdexes = true;
                        break;
                    }
                }
                if(!repatedIdexes) {
                    indexes[i] = random;
                    itemsRandomized[i] = availableItems[random];
                    aux = false;
                }
            }

        }
        return itemsRandomized;
    }
}
