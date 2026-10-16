package exercices;

public class Palindrome {
     static boolean estPalindrome(String s){
     s = s.toLowerCase();
     s = s.replaceAll(" ", "");
     int firstIndice = 0 ;
     int lastIndice = s.length() - 1;
     while( firstIndice < lastIndice){
        if(s.charAt(firstIndice) != s.charAt(lastIndice))
            {
                return false;
            }
        firstIndice++;
        lastIndice--;
     }
     return  true;
    }
    public  static void main(String[] args ){
        System.out.println(estPalindrome("Kayak"));
        System.out.println(estPalindrome("Engage le jeu que je le gagne" ));
        System.out.println(estPalindrome("Dakar" ));
        
    }
}
