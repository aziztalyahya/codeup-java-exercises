package movies;
import util.Input;

public class MoviesApplication {
    public static  Movie[] listOfMovies = MoviesArray.findAll();

    public static void main(String[] args) {
        boolean continueLoop;


        do {
            System.out.println("What would you like to do?");
            System.out.println("0 - Exit Program");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println("6 - add a movie");
            Input myInput = new Input();
            System.out.print("Enter your choice: ");
            int userChoice = myInput.getInt();

            if(userChoice == 0){
                System.exit(0);
            } else if (userChoice == 1){
                for(int i=0; i<listOfMovies.length; i++){
                    System.out.println("Name of Movie: is " + listOfMovies[i].getMovie());
                }

            } else if (userChoice == 2){
                for(int i=0; i<listOfMovies.length; i++){
                    if(listOfMovies[i].getCategory().equals("animated")){
                        System.out.println("Animated movie " + i + " is " + listOfMovies[i].getMovie());
                    }
                }
            } else if (userChoice == 3){
                for(int i=0; i<listOfMovies.length; i++){
                    if(listOfMovies[i].getCategory().equals("drama")){
                        System.out.println("Drama Movie " + i + " is " + listOfMovies[i].getMovie());
                    }
                }
            } else if (userChoice == 4){
                for(int i=0; i<listOfMovies.length; i++){
                    if(listOfMovies[i].getCategory().equals("horror")){
                        System.out.println("Drama Movie " + i + " is " + listOfMovies[i].getMovie());
                    }
                }
            } else if (userChoice == 5){
                for(int i=0; i<listOfMovies.length; i++){
                    if(listOfMovies[i].getCategory().equals("scifi")){
                        System.out.println("Drama Movie " + i + " is " + listOfMovies[i].getMovie());
                    }
                }
            } else if (userChoice == 6){
                System.out.println("What movie would you like to add?");
                String myMovie = myInput.getString();
                System.out.println("What is the category?");
                String category = myInput.getString();
                Movie[] newListOfMovies = addMovie(myMovie, category, listOfMovies);
                System.out.println("Movie added!");

                listOfMovies = newListOfMovies;

            } else{
                System.out.println("Invalid Input");
            }


            System.out.println("Would you like to continue? y or n");
            continueLoop = myInput.yesNo();
        } while (continueLoop);



    }

    public static Movie[] addMovie(String myMovie, String category, Movie[] movieArray){
        Movie[] newArrayOfMovies = new Movie[movieArray.length + 1];
        for(int i=0; i<(movieArray.length); i++){
            newArrayOfMovies[i] = movieArray[i];
        }
        Movie newMovie = new Movie(myMovie, category);
        newArrayOfMovies[movieArray.length] = newMovie;
        return  newArrayOfMovies;
    }


}
