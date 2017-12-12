public class Salle {
    private String nomSalle;
    private int capacite;
    private double tarif;

    public int getCapacite() {
        return capacite;
    }

    public String getNomSalle() {
        return nomSalle;
    }

    public void setNomSalle(String nomSalle) {
        this.nomSalle = nomSalle;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }
}
