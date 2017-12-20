import java.util.*;

public class ProgrammationSemaine {
    private int Semaine;
    private HashMap<Film, FileSeanceCine> mapcine;
    private HashMap<PieceTheatre, FileSeanceTheatre> maptheatre;


    public void ProgrammationSemaine(int semaine, PriorityQueue<SeanceCinema> seanceCinemas, HashMap<SeanceTheatre, PieceTheatre> seanceDePiece) {
        Semaine = semaine;
    }
    //FILMS
    public void ajouterFilmSeance(Film film, FileSeanceCine fileSeanceCine){//WARNING Ne prends pas enn compte que ca doit etre trié
        mapcine.put(film, fileSeanceCine);
    }
    public FileSeanceCine getSeancescine(Film film) {
        if(!mapcine.containsKey(film)) throw new IllegalArgumentException();
        FileSeanceCine file= new FileSeanceCine();
        file=mapcine.get(film);
        return file;
    }

    public FileSeanceCine getSeancesCine(Film film, int jour){//Ouais ya moyen d'ecrire ca plus propre
        FileSeanceCine f= new FileSeanceCine();
        f=this.getSeancescine(film);
        if(f.getListeSeanceCine().isEmpty()) throw new IllegalArgumentException();
        Iterator<SeanceCinema> it= f.getListeSeanceCine().iterator();
        FileSeanceCine leRetour = new FileSeanceCine();
        while (it.hasNext()){
            if (it.next().jour==jour) leRetour.getListeSeanceCine().add(it.next());
        }
        return leRetour;
    }

    public void retirerFilm (Film film){
        mapcine.remove(film);
    }

    public List<Film> filmsDeLaSemaine(){
        List<Film> films = new ArrayList<>();
        mapcine.
        Iterator<Film> it= new mapcine.iterator();
    }
//THEATRE
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
