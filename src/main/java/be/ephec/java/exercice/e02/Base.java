package be.ephec.java.exercice.e02;

import java.util.Scanner;

public class Base {
    Scanner scan;
    int radixAsInt = 10;
    String inputAsString1 = "10";

    public void ConversionDeBase(){

        if(inputAsString1 != null && !inputAsString1.isEmpty() && radixAsInt > Character.MIN_RADIX && radixAsInt < Character.MAX_RADIX ){
            try {
                while(!inputAsString1.equals("0")  && (radixAsInt == 8 || radixAsInt == 10 || radixAsInt == 16 || radixAsInt == 26))
                {
                    System.out.println("Donnez un nombre :");
                    scan = new Scanner(System.in);
                    inputAsString1 = scan.next();
                    System.out.println("Donnez maintenant sa base :");
                    radixAsInt = scan.nextInt();
                    System.out.println("Executer Base avec " + inputAsString1 + " et " + radixAsInt + " donnera " + Integer.parseInt(inputAsString1, radixAsInt));
                }
            }
            catch (NumberFormatException e) {
                System.out.println("La base '0' n'est pas autorisee");
            }
        }
    }
}
