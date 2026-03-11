import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // liste des étudiants
        ArrayList<Etudiant> liste = new ArrayList<>();

        // créer 25 étudiants
        for(int i = 0; i < 25; i++) {

            Etudiant e = new Etudiant("Etudiant" + i, 2000 + i);

            // ajouter 5 notes aléatoires
            for(int j = 0; j < 5; j++) {
                float note = (float)(Math.random() * 20);
                e.ajoutNote(note);
            }

            liste.add(e);
        }

        float sommeMoyennes = 0;

        // afficher moyenne de chaque étudiant
        for(int i = 0; i < liste.size(); i++) {

            Etudiant e = liste.get(i);
            float moyenne = e.moyenne();

            System.out.println(e.getNom() + " : " + moyenne);

            sommeMoyennes += moyenne;
        }

        // moyenne générale
        float moyenneGenerale = sommeMoyennes / liste.size();

        System.out.println("Moyenne générale : " + moyenneGenerale);
    }
}
