
import java.lang.*;

public class Game
{
    public String name;
    public String genre;
    public int ageRating,price;
    public String platform;
    public String synopsis;
    public String developer;
    public String releasedate;
    

    public Game(){};

    public Game(String name, String genre, int ageRating, String platform, String synopsis, String developer, String releasedate )
    {
        this.name=name;
        this.genre=genre;
        this.ageRating=ageRating;
        this.platform=platform;
        this.synopsis=synopsis;
        this.developer=developer;
        this.releasedate=releasedate;

    }

  
    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAgeRating(int ageRating) {
        this.ageRating = ageRating;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    public void setDeveloper(String developer){
        this.developer=developer;
    }
    public void setReleaseDate(String releasedate){
        this.releasedate=releasedate;
    }



    public String getName() {
        return this.name;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getAgeRating() {
        return this.ageRating;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getSynopsis() {
        return this.synopsis;
    }
    public String getDeveloper(){
        return this.developer;
    }
    public String getReleaseDate(){
        return this.releasedate;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}