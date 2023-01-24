package be.ephec.java.exercice;


import be.ephec.java.exercice.e01.Person;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Exercice 1
        Person person1 = new Person();
        String ageAsString;
        System.out.println("Quel est votre prenom?");
        person1.firstName = scan.next();
        System.out.println("Quel est votre nom?");
        person1.lastName = scan.next();
        System.out.println("Quel est votre age?");
        ageAsString = scan.next();
        person1.age = Integer.parseInt(ageAsString);
        person1.display();

        //Exercice 2
        int inputAsInt1, radixAsInt;
        String inputAsString1, radixAsString;

        try{
            do {
                System.out.println("Donnez un nombre et puis sa base :");
                inputAsString1 = scan.next();
                radixAsString = scan.next();
                radixAsInt = Integer.parseInt(radixAsString);
                inputAsInt1 = Integer.parseInt(inputAsString1);
                System.out.println("Executer Base avec " + inputAsInt1 + " et " + radixAsInt + " donnera " + Integer.parseInt(inputAsString1, radixAsInt));

            }while((inputAsInt1 != 0 || inputAsInt1 != Character.MIN_RADIX || inputAsInt1 != Character.MAX_RADIX) && radixAsInt != 0);

        } catch (NumberFormatException e){
            System.out.println("O inputed, end of program");
        }







    }
}