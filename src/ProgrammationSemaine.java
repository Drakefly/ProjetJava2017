import java.util.*;

public class ProgrammationSemaine {
    private int Semaine;
    private HashMap<Film, FileSeanceCine> mapcine;
    private HashMap<PieceTheatre, FileSeanceTheatre> maptheatre;

    //CREATION
    public void ProgrammationSemaine(int semaine, PriorityQueue<SeanceCinema> seanceCinemas, HashMap<SeanceTheatre, PieceTheatre> seanceDePiece) {
        Semaine = semaine;
    }

    //FILMS
    public void ajouterFilmSeance(Film film, FileSeanceCine fileSeanceCine) {//WARNING Ne prends pas enn compte que ca doit etre trié
        mapcine.put(film, fileSeanceCine);
    }

    public FileSeanceCine getSeancescine(Film film) {
        if (!mapcine.containsKey(film)) throw new IllegalArgumentException();
        FileSeanceCine file = new FileSeanceCine();
        file = mapcine.get(film);
        return file;
    }

    public FileSeanceCine getSeancesCine(Film film, int jour) {//Ouais ya moyen d'ecrire ca plus propre
        FileSeanceCine f = new FileSeanceCine();
        f = this.getSeancescine(film);
        if (f.getListeSeanceCine().isEmpty()) throw new IllegalArgumentException();
        Iterator<SeanceCinema> it = f.getListeSeanceCine().iterator();
        FileSeanceCine leRetour = new FileSeanceCine();
        while (it.hasNext()) {
            if (it.next().jour == jour) leRetour.getListeSeanceCine().add(it.next());
        }
        return leRetour;
    }

    public void retirerFilm(Film film) {
        mapcine.remove(film);
    }

    public List<Film> filmsDeLaSemaine() {
        List<Film> films = new ArrayList<>();
        //TODO
        return films;
    }

    public int nombreDefilm() {
        return filmsDeLaSemaine().size();
    }

    public boolean estProgrammme(Film film) {
        return filmsDeLaSemaine().contains(film);
    }

    public boolean supprimerSeance(Film film, int jour, Heure horraire) {//Return True si supprimé return false sinon
        if (!mapcine.containsKey(film)) return false;//Le film n'existe pas
        Seance laSeance = new SeanceCinema(jour, horraire);
        FileSeanceCine f = mapcine.get(film);
        if (!f.getListeSeanceCine().contains(laSeance)) return false;//Il n'y a pas de seance cine avec ce film
        return f.getListeSeanceCine().remove(laSeance);
    }

    //THEATRE
    public void ajouterTheatreSeance(PieceTheatre pieceTheatre, FileSeanceTheatre fileSeanceTheatre) {
        maptheatre.put(pieceTheatre, fileSeanceTheatre);
    }

    public FileSeanceTheatre getSeanceTheatre(PieceTheatre pieceTheatre) {
        if (!maptheatre.containsKey(pieceTheatre)) throw new IllegalArgumentException();
        FileSeanceTheatre file = new FileSeanceTheatre();
        return maptheatre.get(pieceTheatre);

    }

    public FileSeanceTheatre getSeanceTheatre(PieceTheatre pieceTheatre, int jour) {
        FileSeanceTheatre f = new FileSeanceTheatre();
        f = this.getSeanceTheatre(pieceTheatre);
        if (f.getListSeanceTheatre().isEmpty()) throw new IllegalArgumentException();
        Iterator<SeanceTheatre> i;
        i = f.getListSeanceTheatre().iterator();
        FileSeanceTheatre leRetour = new FileSeanceTheatre();
        while (i.hasNext()) {
            if (i.next().jour == jour) leRetour.getListSeanceTheatre().add(i.next());
        }
        return leRetour;
    }

    public void retirerPieceTheatre(PieceTheatre pieceTheatre) {
        maptheatre.remove(pieceTheatre);
    }

    public List<PieceTheatre> pieceDeLaSemaine() {
        List<PieceTheatre> pieceTheatres = new ArrayList<>();
        return pieceTheatres;
    }//TODO

    public int nombreDePieces() {
        return pieceDeLaSemaine().size();
    }

    public boolean estProgramme(PieceTheatre pieceTheatre) {
        return pieceDeLaSemaine().contains(pieceTheatre);
    }

    public boolean supprimerSeance(PieceTheatre pieceTheatre, int jour, Heure horraire) {//Return True si supprimé return false sinon

        if (!estProgramme(pieceTheatre)) return false;//Le film n'existe pas
        Seance laSeance = new SeanceTheatre(jour, horraire);
        FileSeanceTheatre f = maptheatre.get(pieceTheatre);
        return f.getListSeanceTheatre().remove(laSeance);
    }

    //LES DEUX

    public float tauxDeRemplissage() {

    }

    public int chiffreAfaire() {

    }
}
