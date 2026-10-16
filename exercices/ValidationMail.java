package exercices;

public class ValidationMail {
    static boolean estEmailValide(String email){
        return email.matches("^[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z]{2,6}$");
    }
    static boolean estReferenceValide(String ref){
        String refValid = "^PRD-+\\d{3}$";
        return ref.matches(refValid);
    }
    public  static void main(String[] args){
        System.out.printf("awa.diop@isep.edu.sn -> %s%n", estEmailValide("awa.diop@isep.edu.sn") ? "valide" : "invalide");
        System.out.printf("moussa@gmail, -> %s%n", estEmailValide("moussa@gmail,") ? "valide" : "invalide");
        System.out.printf("-dejpz@wave.com -> %s%n", estEmailValide( "-@wave.com") ? "valide" : "invalide");
        System.out.printf("PRD-234 -> %s%n",
                            estReferenceValide("PRD-234") ? "Ref valide" : "Ref invalide");
        System.out.printf("psdzfnz -> %s%n", estReferenceValide("psdzfnz") ? "Ref valide" : "Ref invalide");
    }
}
