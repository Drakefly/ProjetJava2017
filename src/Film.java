public class Film extends Spectacle {
    private String Realisateur;
    private Heure heure;

    public Film(String titre, String interprete, String realisateur, Heure heure) {
        super(titre, interprete);
        Realisateur = realisateur;
        this.heure = heure;//TODO
    }
}
