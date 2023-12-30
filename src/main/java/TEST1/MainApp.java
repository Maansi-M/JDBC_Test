package TEST1;

import java.util.List;
import java.util.Scanner;

public class MainApp {

    static FilmService filmservice = new FilmImpl();
    static Scanner sc1 = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Select Operation");
        System.out.println("1. Add Film Info");
        System.out.println("2. Remove ");
        System.out.println("3. Update Film");
        System.out.println("4. Display Film");
        System.out.println("5. Exit Film");
        int ch = sc1.nextInt();

        switch (ch){
            case 1 :
                    addFilm();
                    break;
            case 2 :
                    //removeFilm
                    break;
            case 3 :
                    updateFilm();
                    break;
            case 4 :
                    //displayFilm
                    break;
            case 5:
                    System.exit(0);
                    break;
            default:
                    System.out.println("INVALID INPUT ");
            }
                main(args);
        }


    private static void updateFilm() {
        System.out.print("Enter Film Name: ");
        String filmName = sc1.nextLine();
        filmName = sc1.nextLine();
        System.out.print("Enter New Film Year: ");
        int newFilmYear = sc1.nextInt();
        sc1.nextLine();

        Film f1 = new Film();
        f1.setFilmName(filmName);
        f1.setFilmYear(newFilmYear);

        int n = filmservice.updateFilm(f1);

        if (n > 0)
            System.out.println("Film year updated successfully!");
        else
            System.out.println("Film not found");
    }


    public static void addFilm()
        {
            System.out.println("ENTER Film Name");
            String filmName = sc1.nextLine();
            filmName = sc1.nextLine();

            System.out.println("ENTER Film Year ");
            int filmYear = sc1.nextInt() ;

            System.out.println("ENTER Film Language  ");
            String filmLanguage = sc1.nextLine();
            filmLanguage = sc1.nextLine();

            System.out.println("ENTER Film Rating ");
            int filmRating = sc1.nextInt() ;

            Film newFilm = new Film(filmName,filmYear,filmLanguage,filmRating);
            int n = filmservice.addFilm(newFilm);
            System.out.println(n+" RECORD INSERTED !!");
            System.out.println("\n\n");
        }
}



