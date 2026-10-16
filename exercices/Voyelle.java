package exercices;

import java.util.Scanner;

public class Voyelle {
     static boolean estVoyelle(char c){
            char[] voyelles = {'a', 'e', 'i','o', 'u', 'y','é', 'è', 'ê', 'à', 'ù'};
            boolean estVoyelle = false;
            for(int i = 0; i < voyelles.length; i++){
                if(voyelles[i] == c){
                    estVoyelle = true;
                    break;
                }
            }
            return  estVoyelle;

        }
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le texte ");
        String texte = sc.nextLine();
        texte = texte.toLowerCase();
        
        int nbVoyelle = 0, chiffres = 0 , consonnes = 0, espaces = 0 , speciaux = 0;

        for( int i = 0 ; i < texte.length(); i++){
            if (estVoyelle(texte.charAt(i)))  nbVoyelle ++;

            else if (Character.isLetter(texte.charAt(i))) consonnes++;
            else if (Character.isDigit(texte.charAt(i))) chiffres++;
            else if (Character.isWhitespace(texte.charAt(i)))  espaces++;
            else speciaux++;
        }
        System.out.println("Voyelles : "+nbVoyelle);
        System.out.println("Consonnes: "+consonnes);
        System.out.println("Chiffres: "+chiffres);
        System.out.println("Espaces: "+espaces);
        System.out.println("Autres: "+speciaux);
        sc.close();
    }
}
