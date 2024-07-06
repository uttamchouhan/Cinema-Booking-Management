public class Showtime {
    private int id;
    private Movie movie;
    private String time;

    public Showtime(int id, Movie movie, String time) {
        this.id = id;
        this.movie = movie;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie){
        this.movie = movie;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time){
        this.time = time;
    }

    @Override
    public String toString() {
        return "Showtime ID: " + id + ", Movie: " + movie.getTitle() + ", Time: " + time;
    }

}