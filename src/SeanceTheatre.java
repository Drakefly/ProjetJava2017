public class SeanceTheatre extends Seance {
    private SalleTheatre salleTheatre;
    private int nbFauteuilsDispo;

    public SeanceTheatre(int jour, Heure horraire) {
        super(jour, horraire);

    }

    public int nbPlaceDispo() {
        return nbFauteuilsDispo + salleTheatre.getNombreBalcon();
    }

    public int totalVendu() {

        return 1;

    }

    public double tauxRemplissage() {
        return 1;

    }

    public void vendrePlaceTn(int nbre) {

    }

    public int NbFauteuilsDispo() {
        return 1;
    }

    public SalleTheatre getSalleTheatre() {
        return salleTheatre;
    }

    public void setSalleTheatre(SalleTheatre salleTheatre) {
        this.salleTheatre = salleTheatre;
    }

    public int getNbFauteuilsDispo() {
        return nbFauteuilsDispo;
    }

    public void setNbFauteuilsDispo(int nbFauteuilsDispo) {
        this.nbFauteuilsDispo = nbFauteuilsDispo;
    }

    public void vendrePlaceFauteuil(int nbre) {

    }
}
