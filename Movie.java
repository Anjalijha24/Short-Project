// Superclass,parentclass Movie
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

// Subclass,childclass ActionMovie
class ActionMovie extends Movie {
    private String[] mainActors;

    // Constructor
    public ActionMovie(String title, String director, String[] mainActors) {
        super(title, director);
        this.mainActors = mainActors;
    }

    // Overriding abstract method
    @Override
    public void displayDetails()
 {
        System.out.println("Title: " + getTitle());
        System.out.println("Director: " + getDirector());
        System.out.println("Main Actors: ");
        for (String actor : mainActors)
       {
            System.out.println("- " + actor);
        }
        System.out.println("Genre: Action");
    }
}

// Subclass/child class ComedyMovie
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

public class Main {  //main method
    public static void main(String[] args) {
        // Creating objects of subclasses
        ActionMovie actionMovie = new ActionMovie("Hera Pheri", "Akshay kumar", new String[]{"Rohit Shetty", "Karan Johar"});
        ComedyMovie comedyMovie = new ComedyMovie("Singham", "Ajay devgan", 100);

        // Polymorphism (Calling displayDetails method on different types of objects)
        actionMovie.displayDetails();
        System.out.println(); 
        comedyMovie.displayDetails();
    }
}