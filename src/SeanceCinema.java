public class SeanceCinema extends Seance {
    private Salle salle;
    private int placevendueTr;

    public SeanceCinema(int jour, Heure horraire) {
        super(jour, horraire);
        placevendueTr = 0;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public int getPlacevendueTr() {
        return placevendueTr;
    }

    public void setPlacevendueTr(int placevendueTr) {
        this.placevendueTr = placevendueTr;
    }

    public int nbPlaceDispo() {
        return 1;
    }

    public int totalVendu() {
        //TODO
        return 1;
    }

    public double tauxRemplissage() {
        //TODO
        return 1;
    }

    public void vendrePlaceTn(int nbre) {

    }

    public void vendrePlaceTr(int nbre) {

    }
}
