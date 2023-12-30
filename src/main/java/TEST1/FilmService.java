package TEST1;

public interface FilmService {
    int addFilm(Film film);
    int updateFilm(Film film);
    int deleteFilm(int filmId);
    Film getFilmById(int filmId);


}
