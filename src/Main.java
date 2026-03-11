//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
        public class Main {

            public static void main(String[] args) {

                // variable pour stocker un Etudiant
                // Déclaration
        Etudiant etu;
        // Initialisation / construction
        etu = new Etudiant();

        Etudiant etu2 = new Etudiant("Bastien", 1990);
        Etudiant etu3 = new Etudiant(2002);

        System.out.println("Le premier etudiant s'appelle " + etu.getNom() );
        etu.setNom("Claude");
        System.out.println("Le premier etudiant s'appelle " + etu.getNom() );


        // etu3.nom = "f*ck";
        System.out.println(etu3.getNom());
        etu3.setNom("f*ck");
        System.out.println(etu3.getNom());

        System.out.println(etu.toString());

        System.out.println(etu.age());
        System.out.println(etu2.age());
        System.out.println(etu3.age());
        //met les note
        etu.ajoutNote(12);
        etu.ajoutNote(15);
        etu.ajoutNote(9);

        etu.voirNotes();

        System.out.println("La note 1 est : " + etu.avoirNote(1));

        etu.modifierNote(1, 18);

        etu.voirNotes();

        System.out.println("Moyenne : " + etu.moyenne());
    }

}
