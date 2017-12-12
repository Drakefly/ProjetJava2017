public abstract class Spectacle {
    private String titre;
    private String interprete;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public Spectacle(String titre, String interprete) {

        this.titre = titre;
        this.interprete = interprete;
    }
}
