package org.fmi.gherkin.model;

/**
 * 
 */
public class Movie {

    /**
     * Default constructor
     */
    public Movie() {
    }

    
    
    public Movie(String name, Integer length, Genre genre) {
		super();
		this.name = name;
		this.length = length;
		this.genre = genre;
	}



	/**
     * 
     */
    public String name;

    /**
     * 
     */
    public Integer length;

    /**
     * 
     */
    public Genre genre;


    /**
     * @return
     */
    public String getName() {
      return this.name;
    }

    /**
     * @param String 
     * @return
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public Integer getLength() {
      return this.length;
    }

    /**
     * @param Integer 
     * @return
     */
    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * @return
     */
    public Genre getGenre() {
    	return this.genre;
    }

    /**
     * @param Genre 
     * @return
     */
    public void setGenre(Genre genre) {
      this.genre = genre;
    }

}