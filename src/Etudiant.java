import java.util.ArrayList;

public class Etudiant {
    // attributs privee

    private String nom;
    private int aneeNaissance;
    private ArrayList<Float> notes;

    // methodes public

    //constucteur
    //constucteur par defaut
    public Etudiant() {
        System.out.println("Constructeur par default");
        this.nom = "Huriye";
        this.aneeNaissance = 1960;
        this.notes = new ArrayList();


    }
    //constructeur parametrer
    public Etudiant(String n, int a) {
        System.out.println("Constructeur parametre");
        this.nom = n;
        this.aneeNaissance = a;
        this.notes = new ArrayList();
    }
    public Etudiant(int c) {
        this.nom = "None";
        this.aneeNaissance = c;
        this.notes = new ArrayList();
    }
    //acceseurs GETTER + SETTER pour tout les attributs

    public String getNom() {
        return this.nom;
    }
    public void setNom(String n) {
        this.nom = n;
    }

}
