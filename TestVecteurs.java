package packagevector;

import java.awt.*;  // Pour la classe Point
import java.util.Vector;

public class TestVecteurs {

    public static void main(String[] args) {
        // Création d'un vecteur sans générique
        Vector v = new Vector(3);

        // insertion dans le vecteur en une étape
        v.add(new Point(3, 3));

        // insertion dans le vecteur en deux étapes
        Point p = new Point(2, 4);
        v.add(p);
        v.add(new Point(5, 5));
        v.insertElementAt(new Point(8, 5), 0);
        v.insertElementAt(new Point(4, 7), 2);
        v.removeElementAt(4);

        // Affichage du contenu
        System.out.println("Contenu du vecteur :");
        for (int i = 0; i < v.size(); i++) {
            System.out.println("Élément " + i + " : " + v.get(i));
        }

        // 1. Afficher la capacité du vecteur
        System.out.println("1. Capacité du vecteur : " + v.capacity());

        // 2. Afficher la grandeur du vecteur
        System.out.println("2. Taille (grandeur) du vecteur : " + v.size());

        // 3. Afficher la donnée x du 1er élément
        System.out.println("3. Valeur x du 1er élément : " + ((Point) v.get(0)).x);

        // 4. Afficher la donnée y du 2e élément
        System.out.println("4. Valeur y du 2e élément : " + ((Point) v.get(1)).y);

        // 5. Afficher la donnée x du 3e élément
        System.out.println("5. Valeur x du 3e élément : " + ((Point) v.get(2)).x);

        // 6. Calcul du total des x
        int totalX = 0;
        for (int i = 0; i < v.size(); i++) {
            Point pt = (Point) v.get(i);
            totalX += pt.x;
        }
        System.out.println("6. Total des valeurs x : " + totalX);
    }
}
