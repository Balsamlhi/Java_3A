import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class DepartementHashSet implements IDepartement<Departement> {
    private HashSet<Departement> departements;
    public DepartementHashSet() {
        departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement d) {
        departements.add(d);

    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        return nomDepartement.contains(nomDepartement.toLowerCase());
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }

    @Override
    public void afficherDepartements() {
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    @Override
    public void trierDepartementsParId() {
        List<Departement> list = new ArrayList<>();
        list.sort(Comparator.comparingInt(Departement::getId));
        list.forEach(System.out::println);
    }

    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        List<Departement> list = new ArrayList<>();
        list.sort(Comparator.comparing(Departement::getNomDepartement).thenComparing(Departement::getNombreEmployes));
        list.forEach(System.out::println);
    }
}
