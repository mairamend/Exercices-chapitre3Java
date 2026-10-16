package exercices;

public class AnalyseLigne {
    public static void main(String[] args){
        String ligne = """
        2026-09-14;TS-2026-000087;Awa Diop;Médina;WAVE;18500 """;
        String enregistrement[] = ligne.split(";");
        if(enregistrement.length < 6){
            System.out.println("Ligne invalide");
        }
        else{
            System.out.println("Date : "+enregistrement[0]);
            System.out.println("Code : "+enregistrement[1]);
            System.out.println("Nom du client : "+enregistrement[2]);
            System.out.println("Adresse : "+enregistrement[3].toUpperCase());
            System.out.println("Moyen de Paiement : "+enregistrement[4]);
            System.out.println("Montant : "+enregistrement[5]+" FCFA");
        }

    }
}
