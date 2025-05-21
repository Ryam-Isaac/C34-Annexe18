package packagevector;

import java.awt.*;  // Pour la classe Point
import java.util.Vector;

public class TestVecteurs {

    public static void main(String[] args)
    {
        // Création d'un vecteur sans générique
        Vector v = new Vector(3);

        // insertion ds le vecteur en une étape
        v.add(new Point(3,3));

        // insertion ds le vecteur en deux étapes
        Point p = new Point(2,4);
        v.add(p);
        v.add (new Point(5,5));
        v.insertElementAt(new Point(8,5), 0);
        v.insertElementAt(new Point(4,7), 2);
        v.removeElementAt(4);

        //1 afficher la capacité du vecteur

        //2 afficher la grandeur du vecteur

        //3 afficher la valeur de la donnée x du premier élément du vecteur
        // sans enlever l'élément du vecteur

        // afficher la valeur de la donnée y du deuxième élément du vecteur
        // sans enlever l'élément du vecteur

        // afficher la valeur de la donnée x du troisième élément du vecteur
        // sans enlever l'élément du vecteur

        // à l'aide d'une boucle, faire le total des valeurs des données x de tous les
        // éléments du vecteur et l'afficher
     
    }
}
