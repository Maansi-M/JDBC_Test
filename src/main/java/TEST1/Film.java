package TEST1;

public class Film {

    private int filmId;
    private String filmName;
    private int filmYear;
    private String filmLanguage;
    private int filmRating;

    public Film() {
    }

    public Film(String filmName, int filmYear, String filmLanguage,int filmRating) {
        this.filmName = filmName;
        this.filmYear = filmYear;
        this.filmLanguage = filmLanguage;
        this.filmRating = filmRating;

    }



    public int filmId() {
        return filmId;
    }

    public void setFilmId(int filmImd) {
        this.filmId = filmImd;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public int getFilmYear() {
        return filmYear;
    }

    public void setFilmYear(int filmYear) {
        this.filmYear = filmYear;
    }

    public String getFilmLanguage() {
        return filmLanguage;
    }

    public void setFilmLanguage(String filmLanguage) {
        this.filmLanguage = filmLanguage;
    }
    public int getFilmRating() {
        return filmRating;
    }

    public void setFilmRating(int filmRating) {
        this.filmRating = filmRating;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmId=" + filmId +
                ", filmName='" + filmName + '\'' +
                ", filmYear=" + filmYear +
                ", filmLanguage='" + filmLanguage + '\'' +
                ", filmRating=" + filmRating +
                '}';
    }
}
