package ma.tp.exceptions;

public class LireMontant {

    public double lireMontant(String valeur) {
        try {
            double montant = Double.parseDouble(valeur);
            if (montant < 0) {
                throw new IllegalArgumentException("Montant négatif !");
            }
            return montant;
        } catch (NumberFormatException e) {
            System.out.println("Erreur: valeur non numérique !");
            return 0.0;
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur: " + e.getMessage());
            return 0.0;
        }
    }

    public static void main(String[] args) {
        LireMontant lm = new LireMontant();

        System.out.println("Montant: " + lm.lireMontant("150.5"));

        System.out.println("Montant: " + lm.lireMontant("abc"));

        System.out.println("Montant: " + lm.lireMontant("-50"));
    }
}