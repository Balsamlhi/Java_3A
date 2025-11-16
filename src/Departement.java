public class Departement {
    int id;
    String nomDepartement ;
    int nombreEmployes;

    public Departement(){
        this.id = 0;
        this.nomDepartement = "";
        this.nombreEmployes = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Departement that = (Departement) o;

        return this.id == that.id &&
                this.nomDepartement.equalsIgnoreCase(that.nomDepartement);
    }

    @Override
    public int hashCode() {
        return id + nomDepartement.toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nombreEmployes=" + nombreEmployes +
                '}';
    }
}
