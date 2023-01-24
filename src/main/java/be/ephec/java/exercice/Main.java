package be.ephec.java.exercice;


import be.ephec.java.exercice.e01.Person;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
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

        //System.out.println("Nom = " + person1.lastName + " prenom = " + person1.firstName + " age = " + person1.age);



    }
}