package org.fmi.gherkin.model;


import java.util.*;

import org.joda.time.DateTime;

/**
 * 
 */
public class Screening {

    /**
     * Default constructor
     */
    public Screening() {
    }

    public Screening(Movie movie, DateTime startingTime, List<Boolean> seats) {
		super();
		this.movie = movie;
		this.startingTime = startingTime;
		this.seats = seats;
	}

    /**
     * 
     */
    public DateTime startingTime;

    /**
     * 
     */
    public List<Boolean> seats;

    /**
     * 
     */
    public Movie movie;

    /**
     * @return
     */
    public Movie getMovie() {
        return this.movie;
    }

    /**
     * @param Movie 
     * @return
     */
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    /**
     * @return
     */
    public DateTime getStartingTime() {
    	return this.startingTime;
    }

    /**
     * @param Date 
     * @return
     */
    public void setStartingTime(DateTime startingTime) {
       this.startingTime = startingTime;
    }

    /**
     * @return
     */
    public List<Boolean> getSeats() {
    	return this.seats;
    }

    /**
     * @param List 
     * @return
     */
    public void setSeats(List<Boolean> seats) {
       this.seats = seats;
    }

}