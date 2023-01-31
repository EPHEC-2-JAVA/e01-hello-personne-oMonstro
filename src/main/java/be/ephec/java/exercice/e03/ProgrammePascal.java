package be.ephec.java.exercice.e03;
import java.util.Scanner;

public class ProgrammePascal {
    public static void main(String[] args) {
        System.out.println("Le programme calcule le triangle de Pascal jusqu'a la ligne specifiee");
        System.out.print("Jusqu'à quelle ligne voulez-vous calculer ?");
        Scanner scan = new Scanner(System.in);
        int nbLine = scan.nextInt();

        int [][] triangle = Pascal.triangle(nbLine);

        if(triangle == null)
            System.out.println("");

        for (int [] line : triangle) {
            for(int val : line)
                System.out.print(val + " ");
        }
    }
}
