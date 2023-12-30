package TEST1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FilmImpl implements FilmService {
    static Connection conn ;
    static {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","sql123");
        } catch (SQLException e) {
            System.err.println("CONNECTION UNSUCCESSFUL !! ");
            System.exit(1);
        }
    }

    @Override
    public int addFilm(Film film) {
        int n = 0;

            String sql = "INSERT INTO film_info (film_name, film_year, film_language, film_rating) VALUES(?, ?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, film.getFilmName());
                pstmt.setInt(2, film.getFilmYear());
                pstmt.setString(3, film.getFilmLanguage());
                pstmt.setInt(4, film.getFilmRating());
                n = pstmt.executeUpdate();
            } catch (SQLException e) {
                System.out.println("DATA cannot be inserted");
            }
        return n;

    }


    @Override
    public int updateFilm(Film film) {
        int n = 0;

        String sql = "UPDATE film_info SET film_year = ? WHERE film_name = ?";
        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setInt(1, film.getFilmYear());
            preparedStatement.setString(2, film.getFilmName());

            n = preparedStatement.executeUpdate();

            if (n > 0)
                System.out.println("Film year updated successfully!");
             else
                System.out.println("Film not found");

        }
        catch (SQLException e) {
            System.out.println(e);
        }
        return n;
    }


    @Override
    public int deleteFilm(int filmId) {

        return 0;
    }

    @Override
    public Film getFilmById(int filmId) {


        return null;
    }
}




