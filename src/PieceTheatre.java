public class PieceTheatre extends Spectacle {
    private String metteurEnScene;
    private int nbEntracte;

    public PieceTheatre(String titre, String interprete, String metteurEnScene, int nbEntracte) {
        super(titre, interprete);
        this.metteurEnScene = metteurEnScene;
        this.nbEntracte = nbEntracte;
    }
}
