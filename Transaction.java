package ma.tp.exceptions;
public class Transaction {

    public double lireTransaction(double[] tab, int index) {
        return tab[index];
    }

    public static void main(String[] args) {
        Transaction t = new Transaction();

        double[] transactions = {100.0, 200.0, 300.0};

        try {
            System.out.println("Transaction: " + 
                t.lireTransaction(transactions, 1));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur: indice invalide !");
        } catch (NullPointerException e) {
            System.out.println("Erreur: tableau non initialisé !");
        }

        try {
            System.out.println("Transaction: " + 
                t.lireTransaction(transactions, 10));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur: indice invalide !");
        } catch (NullPointerException e) {
            System.out.println("Erreur: tableau non initialisé !");
        }

        try {
            System.out.println("Transaction: " + 
                t.lireTransaction(null, 0));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur: indice invalide !");
        } catch (NullPointerException e) {
            System.out.println("Erreur: tableau non initialisé !");
        }
    }
}