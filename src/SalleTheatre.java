public class SalleTheatre extends Salle {
    private int nombreFauteuils;
    private double prixFauteuils;

    public int getNombreBalcon() {
        return getCapacite() - nombreFauteuils;
    }
}
