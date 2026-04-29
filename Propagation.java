package ma.tp.exceptions;
public class Propagation {

    public double lireMontant(String valeur) 
            throws NumberFormatException, IllegalArgumentException {
        double montant = Double.parseDouble(valeur);
        if (montant < 0) {
            throw new IllegalArgumentException("Montant négatif !");
        }
        return montant;
    }

    public static void main(String[] args) {
        Propagation p = new Propagation();

        try {
            System.out.println("Montant: " + p.lireMontant("200"));
        } catch (NumberFormatException e) {
            System.out.println("Erreur format: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur métier: " + e.getMessage());
        }

        try {
            System.out.println("Montant: " + p.lireMontant("abc"));
        } catch (NumberFormatException e) {
            System.out.println("Erreur format: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur métier: " + e.getMessage());
        }

        try {
            System.out.println("Montant: " + p.lireMontant("-50"));
        } catch (NumberFormatException e) {
            System.out.println("Erreur format: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur métier: " + e.getMessage());
        }
    }
}