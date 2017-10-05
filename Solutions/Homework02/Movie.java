/**
 * 
 */
package movieDatabase;

/**
 * @author Brady
 *
 */
public class Movie {
    private String name = "";
    private int year = 0;
    private int rating = 0;
    private String director = "";
    private int boxOfficeGross = 0;
    
    public Movie() {}
    public Movie(String name, int year, int rating, String director, int boxOfficeGross) {
        this.name = name;
        this.year = year;
        this.rating = rating;
        this.director = director;
        this.boxOfficeGross = boxOfficeGross;
    }
    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
     * @return the year
     */
    public int getYear()
    {
        return year;
    }
    /**
     * @param year the year to set
     */
    public void setYear(int year)
    {
        this.year = year;
    }
    /**
     * @return the rating
     */
    public int getRating()
    {
        return rating;
    }
    /**
     * @param rating the rating to set
     */
    public void setRating(int rating)
    {
        this.rating = rating;
    }
    /**
     * @return the director
     */
    public String getDirector()
    {
        return director;
    }
    /**
     * @param director the director to set
     */
    public void setDirector(String director)
    {
        this.director = director;
    }
    /**
     * @return the boxOfficeGross
     */
    public int getBoxOfficeGross()
    {
        return boxOfficeGross;
    }
    /**
     * @param boxOfficeGross the boxOfficeGross to set
     */
    public void setBoxOfficeGross(int boxOfficeGross)
    {
        this.boxOfficeGross = boxOfficeGross;
    }
}
