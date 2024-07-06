public class Movie {
    private int id;
    private String title;
    private String duration;

    public Movie(int id, String title, String duration){
        this.id = id;
        this.title = title;
        this.duration = duration;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getDuration(){
        return duration;
    }

    public void setDuration(String duration){
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie ID: " + id + ", Title: " + title + ", Duration: " + duration + " minutes";
    }
}