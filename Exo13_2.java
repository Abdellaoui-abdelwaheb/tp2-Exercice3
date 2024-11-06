public class Exo13_2 {
    public static void main(String[] args) {
        Compteur c1, c2, c3;

        c1 = new Compteur(0); // Initialise c1 à 0
        c1.incremente(); // Incrémente c1 de 1 ; c1.value() est maintenant 1
        c2 = new Compteur(1); // Initialise c2 à 1
        c3 = c1; // c3 référence le même objet que c1

        // Vérifier si c1 et c3 sont le même objet (référence)
        if (c1 == c3) {
            System.out.println("c1 et c3 sont le même objet");
        } else {
            System.out.println("c1 et c3 ne sont pas le même objet");
        }

        // Vérifier si c1 et c2 ont la même valeur
        if (c1.value() == c2.value()) {
            System.out.println("c1 et c2 ont la même valeur");
        } else {
            System.out.println("c1 et c2 n'ont pas la même valeur");
        }

        if (c1 == c2) {
            System.out.println("c1 et c2 sont le même objet");
        } else {
            System.out.println("c1 et c2 ne sont pas le même objet");
        }


        c1.incremente();
        if (c1.value() == 2) {
            System.out.println("c1 a été incrémenté correctement");
        } else {
            System.out.println("c1 n'a pas été incrémenté correctement");
        }
    }
}
