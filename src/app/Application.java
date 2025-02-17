package app;
import models.Chien;

public class Application {

    public static void main(String[] args){
        
        //////////////////////////////////////////////////////////////////////////////////
        // Création de quelques chiens
        //////////////////////////////////////////////////////////////////////////////////
        Chien chien1 = new Chien("Pluto", 12);
        Chien chien2 = new Chien("Droopy",14);
        Chien chien3 = new Chien("Scooby Doo", 8);
        
        //////////////////////////////////////////////////////////////////////////////////
        // Affichage de chaque chien
        //////////////////////////////////////////////////////////////////////////////////

        // On affiche directement les infos du chien1 en lui posant directement les questions
        System.out.println("Je m'appelle " + chien1.getNom() + " et j'ai " + chien1.getAge() + " années.");        

        // On affiche son "toString()" qui retourne le nom du chien dans une chaîne
        System.out.println(chien2.toString());

        // Mais par quel miracle ce chien-là s'affichera-t-il ?
        System.out.println(chien3);                 
    
    }

}
