package be.ephec.java.exercice.e01;

import java.util.Scanner;

public class ProgrammePerson {

    public static void main(String[] args) {

        Person person1 = new Person();
        System.out.println("Quel est votre prenom?");
        Scanner scan = new Scanner(System.in);
        person1.firstName = scan.next();
        System.out.println("Quel est votre nom?");
        person1.lastName = scan.next();
        System.out.println("Quel est votre age?");
        person1.age = scan.nextInt();
        person1.display();
    }
}
