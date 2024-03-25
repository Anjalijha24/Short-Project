import java.util.Scanner;

// Superclass Movie
abstract class Movie {
    private String title;
    private String director;

    // Constructor
    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    // Abstract method to display movie details
    public abstract void displayDetails();

    // Getter method for title
    public String getTitle() {
        return title;
    }

    // Getter method for director
    public String getDirector() {
        return director;
    }
}

// Subclass ActionMovie
class ActionMovie extends Movie {
    private String[] mainActors;

    // Constructor
    public ActionMovie(String title, String director, String[] mainActors) {
        super(title, director);
        this.mainActors = mainActors;
    }

    // Overriding abstract method
    @Override
    public void displayDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Director: " + getDirector());
        System.out.println("Main Actors: ");
        for (String actor : mainActors) {
            System.out.println("- " + actor);
        }
        System.out.println("Genre: Action");
    }
}

// Subclass ComedyMovie
class ComedyMovie extends Movie {
    private int laughs;

    // Constructor
    public ComedyMovie(String title, String director, int laughs) {
        super(title, director);
        this.laughs = laughs;
    }

    // Overriding abstract method
    @Override
    public void displayDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Director: " + getDirector());
        System.out.println("Laughs: " + laughs);
        System.out.println("Genre: Comedy");
    }
}

public class Main {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for ActionMovie
        System.out.println("Enter details for Action Movie:");
        System.out.print("Title: ");
        String actionTitle = scanner.nextLine();
        System.out.print("Director: ");
        String actionDirector = scanner.nextLine();
        System.out.print("Number of main actors: ");
        int numActors = Integer.parseInt(scanner.nextLine());
        String[] actionActors = new String[numActors];
        for (int i = 0; i < numActors; i++) {
            System.out.print("Actor " + (i + 1) + ": ");
            actionActors[i] = scanner.nextLine();
        }
        ActionMovie actionMovie = new ActionMovie(actionTitle, actionDirector, actionActors);

        // Taking input for ComedyMovie
        System.out.println("\nEnter details for Comedy Movie:");
        System.out.print("Title: ");
        String comedyTitle = scanner.nextLine();
        System.out.print("Director: ");
        String comedyDirector = scanner.nextLine();
        System.out.print("Number of laughs: ");
        int laughs = Integer.parseInt(scanner.nextLine());
        ComedyMovie comedyMovie = new ComedyMovie(comedyTitle, comedyDirector, laughs);

        // Displaying movie details
        System.out.println("\nAction Movie Details:");
        actionMovie.displayDetails();
        System.out.println("\nComedy Movie Details:");
        comedyMovie.displayDetails();

        scanner.close();
    }
}
