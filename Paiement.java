package ma.tp.exceptions;

public class Paiement {

    public double effectuerPaiement(double montant, double solde) 
                                    throws IllegalArgumentException {
        if (montant <= 0) {
            throw new IllegalArgumentException(
                "Montant invalide : doit être supérieur à zéro");
        }
        if (montant > solde) {
            throw new IllegalArgumentException(
                "Solde insuffisant !");
        }
        return solde - montant;
    }

    public static void main(String[] args) {
        Paiement p = new Paiement();

        try {
            double nouveauSolde = p.effectuerPaiement(200, 500);
            System.out.println("Paiement OK - Nouveau solde: " + nouveauSolde);

            p.effectuerPaiement(-50, 500);

        } catch (IllegalArgumentException e) {
            System.out.println("Erreur: " + e.getMessage());
        
        } finally {
            System.out.println("Fin de la transaction");
        }
    }
}