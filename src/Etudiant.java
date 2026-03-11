import java.util.ArrayList;

public class Etudiant {

    private String nom;
    private int anneeNaissance;
    private ArrayList<Float> notes;

    // constructeur
    public Etudiant(String nom, int anneeNaissance) {
        this.nom = nom;
        this.anneeNaissance = anneeNaissance;
        this.notes = new ArrayList<>();
    }

    // ajouter une note
    public void ajoutNote(float note) {
        notes.add(note);
    }

    // afficher les notes
    public void voirNotes() {
        for(int i = 0; i < notes.size(); i++) {
            System.out.println("Note " + i + " : " + notes.get(i));
        }
    }

    // modifier une note
    public void modifierNote(int i, float note) {
        if(i >= 0 && i < notes.size()) {
            notes.set(i, note);
        }
    }

    // calculer la moyenne
    public float moyenne() {

        float somme = 0;

        for(int i = 0; i < notes.size(); i++) {
            somme += notes.get(i);
        }

        if(notes.size() == 0) {
            return 0;
        }

        return somme / notes.size();
    }

    public String getNom() {
        return nom;
    }
}
