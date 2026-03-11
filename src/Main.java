import java.util.ArrayList;

public class Etudiant {

    // attributs : PRIVÉS
    private String nom;
    private int anneeNaissance;
    private ArrayList<Float> notes;
    private int id;
    private double taille;

    // méthodes

    // constructeurs
    // constructeur par défaut
    public Etudiant() {
        System.out.println("Constructeur par défaut");
        this.nom = "John";
        this.anneeNaissance = 2007;
        this.notes = new ArrayList();
        this.id = 1;
        this.taille = 1.5;
    }

    // constructeur paramétré
    public Etudiant(String n, int a) {
        System.out.println("Constructeur paramétré 1");
        this.nom = n;
        this.anneeNaissance = a;
        this.notes = new ArrayList();
        this.id = 1;
        this.taille = 1.5;
    }

    public Etudiant(int a) {
        System.out.println("Constructeur paramétré 2");
        this.nom = "Bob";
        this.anneeNaissance = a;
        this.notes = new ArrayList<Float>();
        this.id = 1;
        this.taille = 1.5;
    }

    public Etudiant(String n, int a, int i, double t) {
        this.nom = n;
        this.anneeNaissance = a;
        this.id = i;
        this.taille = t;
        this.notes = new ArrayList<Float>();
    }

    // accesseurs = GETTER + SETTER (pour chaque attribut)
    public String getNom() {
        return this.nom;
    }

    public void setNom(String n) {
        if(n != "f*ck")
            this.nom = n;
    }

    public int getAnneeNaissance() {
        return this.anneeNaissance;
    }

    public void setAnneeNaissance(int a) {
        this.anneeNaissance = a;
    }

    public ArrayList<Float> getNotes() {
        return this.notes;
    }

    public void setNotes(ArrayList<Float> n) {
        this.notes = n;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public double getTaille() {
        return this.taille;
    }

    public void setTaille(double t) {
        this.taille = t;
    }

    @Override
    public String toString() {
        return "Etudiant s'appelant "+ this.nom +
                " et qui est né en " + this.anneeNaissance +
                " ayant l'identifiant " + this.id +
                " et qui mesure " + this.taille + " mètres";
    }

    public int age() {
        return 2026 - this.anneeNaissance;
    }
}
