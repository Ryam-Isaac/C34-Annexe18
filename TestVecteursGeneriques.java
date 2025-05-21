package packagevector;

import java.awt.*;
import java.util.Vector;

public class TestVecteursGeneriques {
    public static void main(String[] args) {
        // Création d'un vecteur avec générique
        Vector<Point> v = new Vector(3);

        // insertion ds le vecteur en une étape
        v.add (new Point(3,3));

        // insertion ds le vecteur en deux étapes
        Point p = new Point(2,4);
        v.add(p);

        v.add(new Point(5,5));

        v.insertElementAt(new Point(8,5), 0);

        v.insertElementAt(new Point(4,7), 2);

        v.removeElementAt(4);

        //1 afficher la capacité du vecteur

        //2 afficher la grandeur du vecteur

        //3 afficher la valeur de la donnée x du premier élément du vecteur
        // sans enlever l'élément du vecteur

        // afficher la valeur de la valeur y du deuxième Point du vecteur
        // sans enlever l'élément du vecteur

        // afficher la valeur de la valeur en x du troisième Point du vecteur
        // sans enlever l'élément du vecteur

        // à l'aide d'une boucle, faire le total des valeurs des valeur en x de 
        // tous les Points du vecteur et l'afficher

    }
}
