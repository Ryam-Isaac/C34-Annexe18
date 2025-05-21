package packagevector;

import java.awt.*;
import java.util.Vector;

public class TestVecteursGeneriques {
    public static void main(String[] args) {
        // Création d'un vecteur avec générique
        Vector<Point> v = new Vector<>(3); // Notez bien les <Point> ici

        // insertion dans le vecteur en une étape
        v.add(new Point(3, 3));

        // insertion dans le vecteur en deux étapes
        Point p = new Point(2, 4);
        v.add(p);

        v.add(new Point(5, 5));
        v.insertElementAt(new Point(8, 5), 0);
        v.insertElementAt(new Point(4, 7), 2);

        v.removeElementAt(4);

        System.out.println("Contenu du vecteur :");
        for (int i = 0; i < v.size(); i++) {
            System.out.println("Point " + i + " : " + v.get(i));
        }

        // 1. Afficher la capacité du vecteur
        System.out.println("1. Capacité du vecteur : " + v.capacity());

        // 2. Afficher la grandeur du vecteur
        System.out.println("2. Taille (grandeur) du vecteur : " + v.size());

        // 3. Afficher la valeur de la donnée x du premier élément du vecteur
        System.out.println("3. Valeur x du 1er point : " + v.get(0).x);

        // 4. Valeur y du 2e Point
        System.out.println("4. Valeur y du 2e point : " + v.get(1).y);

        // 5. Valeur x du 3e Point
        System.out.println("5. Valeur x du 3e point : " + v.get(2).x);

        // 6. Total des valeurs en x de tous les Points
        int totalX = 0;
        for (Point point : v) {
            totalX += point.x;
        }
        System.out.println("6. Total des valeurs en x : " + totalX);
    }
}
