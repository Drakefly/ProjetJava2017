import java.util.HashMap;
import java.util.PriorityQueue;

public class ProgrammationSemaine {
    private int Semaine;
    private HashMap<Film, FileSeanceCine> mapcine;
    private HashMap<PieceTheatre, FileSeanceTheatre> maptheatre;


    public ProgrammationSemaine(int semaine, PriorityQueue<SeanceCinema> seanceCinemas, HashMap<SeanceTheatre, PieceTheatre> seanceDePiece) {
        Semaine = semaine;
    }
}
