public abstract class Seance {
    private int jour;
    private Heure horraire;
    private int nbPlaceVendueTn;

    public Seance(int jour, Heure horraire) {
        this.jour = jour;
        this.horraire = horraire;
        this.nbPlaceVendueTn = 0;
    }
    public abstract  int CompareTo();

    public abstract int nbPlaceDispo();

    public abstract int totalVendu();

    public abstract double tauxRemplissage();

    public abstract void vendrePlaceTn(int nbre);
}