import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(3, "Ali", "Hamdi", "Informatique", 2);
        Employe e2 = new Employe(1, "Sami", "Amine", "Ressources Humaines", 1);
        Employe e3 = new Employe(2, "Lina", "Meriem", "Informatique", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        societe.displayEmploye();

        System.out.println("**********");
        // Tri par ID
        societe.trierEmployeParId();
        societe.displayEmploye();
        System.out.println("**********");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();


        societe.rechercherEmploye("Ali");
        societe.supprimerEmploye(e2);
        societe.displayEmploye();

        List<Employe> infoDept = societe.rechercherParDepartement("Informatique");
        System.out.println("Employés du département Informatique :");
        for (Employe e : infoDept) {
            System.out.println(e);
        }

    }
}