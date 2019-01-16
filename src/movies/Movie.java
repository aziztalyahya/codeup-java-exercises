package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

    public String getMovie(){
        return name;
    }

    public String getMovie(String movieInput){
        return name;
    }

    public void setMovie(String movieInput){
        this.name = movieInput;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String movieCategory){
         this.category = movieCategory;
    }




}
