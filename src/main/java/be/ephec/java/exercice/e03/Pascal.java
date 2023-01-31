package be.ephec.java.exercice.e03;

public class Pascal {

    public static int [][] triangle(int nbOfLines) {
        if (nbOfLines <= 0) {
            System.out.println("Impossible de creer un triangle de Pascal pour un nombre < 0" + nbOfLines);
            return null;
        }
        int [][] triangle = new int[nbOfLines][];
        triangle [1] = new int [1];
        triangle [0][0] = 1;

        if (nbOfLines > 1) {
            for (int line = 1; line < nbOfLines; line++){
                triangle[line] = new int [line+1];
                triangle[line][0] = 1;
                triangle[line][line] = 1;
                for (int cell = 1; cell < line; cell++){
                    triangle [line][cell] = triangle[line-1][cell-1] + triangle [line-1][cell];
                }
            }
        }
        return triangle;
    }

}
