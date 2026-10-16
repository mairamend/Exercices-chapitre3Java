package exercices;

public class MethodeBase {
    public static void main(String[] args){
        String s = " TerangaShop, Dakar - Sénégal - Afrique ";
        int longueurAvant =  s.length();
        s = s.trim();
        System.out.println("Apres nettoyage "+s);
        System.out.println("Longueur avant nettoyage : "+longueurAvant+" Longueur apres "+s.length());
        System.out.println("La position de la virgule : "+s.indexOf(','));
        System.out.println("Le nom de la ville : "+s.substring(s.indexOf("Dakar"),s.indexOf("Dakar")+"Dakar".length()));
        String sVirgule = s.replace('-',',');
        String motsT[] = sVirgule.split(",");
        System.out.println("nombre de Mots : "+motsT.length);
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
    }
}
