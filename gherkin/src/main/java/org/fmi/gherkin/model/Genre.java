package org.fmi.gherkin.model;


import java.util.*;

/**
 * 
 */
public class Genre {

    /**
     * Default constructor
     */
    public Genre() {
    }

    
    
    public Genre(String name) {
		super();
		this.name = name;
	}



	/**
     * 
     */
    public String name;

    /**
     * 
     */
    public Set<Movie> movies;

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
    public Set<Movie> getMovies() {
       return this.movies;
    }

    /**
     * @param List 
     * @return
     */
    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

}