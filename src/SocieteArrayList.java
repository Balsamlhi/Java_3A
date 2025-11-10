import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {
    ArrayList<Employe> listeEmployes;

    public SocieteArrayList() {
        listeEmployes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe e) {
        listeEmployes.add(e);
        System.out.println("employee ajouté:"+ e );
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : listeEmployes) {
            if (e.getNom().equals(nom)) {
                System.out.println("Employé trouvé : " + e);
                return true;
            }
        }
        System.out.println("Aucun employé avec le nom : " + nom);
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return listeEmployes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        listeEmployes.remove(employe);

    }

    @Override
    public void displayEmploye() {
        for (Employe e : listeEmployes) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(listeEmployes, Comparator.comparingInt(Employe::getId));
        System.out.println("Liste triée par ID.");
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(listeEmployes, Comparator
                .comparing(Employe::getNomDepartement)
                .thenComparingInt(Employe::getGrade)
                .thenComparing(Employe::getNom));
        System.out.println("Liste triée par departement,Grade,puis Nom");
    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> listeDepartements = new ArrayList<>();
        for (Employe e : listeEmployes) {

            if (e.getNomDepartement().equals(nomDepartement)) {
                listeDepartements.add(e);
            }
        }
        return listeDepartements;
    }
}
