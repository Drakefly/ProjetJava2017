import java.util.HashMap;
import java.util.PriorityQueue;

public class ProgrammationSemaine {
    private int Semaine;
    private HashMap<Film, FileSeanceCine> mapcine;
    private HashMap<PieceTheatre, FileSeanceTheatre> maptheatre;


    public void ProgrammationSemaine(int semaine, PriorityQueue<SeanceCinema> seanceCinemas, HashMap<SeanceTheatre, PieceTheatre> seanceDePiece) {
        Semaine = semaine;
    }

    public void ajouterFilmSeance(Film film, FileSeanceCine fileSeanceCine){
        mapcine.put(film, fileSeanceCine);
    }
    public String getSeancescine(Film film) {
        if(!mapcine.containsKey(film)) throw new IllegalArgumentException();
        FileSeanceCine file= new FileSeanceCine();
        file=mapcine.get(film);
        return file.toString();
    }

    public void ajouterTheatreSeance(PieceTheatre pieceTheatre,FileSeanceTheatre fileSeanceTheatre){
        maptheatre.put(pieceTheatre,fileSeanceTheatre);
    }

    public String getSeanceTheatre(PieceTheatre pieceTheatre) {
        if(!maptheatre.containsKey(pieceTheatre)) throw new IllegalArgumentException();
        FileSeanceTheatre file = new FileSeanceTheatre();
        file= maptheatre.get(pieceTheatre);
        return file.toString();
    }
}
